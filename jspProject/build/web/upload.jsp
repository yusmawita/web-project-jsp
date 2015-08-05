<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<%@page import="org.apache.tomcat.util.http.fileupload.FileItem"%>
<%@page import="org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory"%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*,javax.swing.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="javax.servlet.RequestDispatcher"%>

<%
     
    File file ;
    String fileName="";
    String fileLoc="";
    int maxFileSize = 5000 * 1024;
    int maxMemSize = 5000 * 1024;
    ServletContext context = pageContext.getServletContext();
    
    String dir = request.getServletPath();
    int slashIndex = dir.lastIndexOf('/');  
    dir = slashIndex != -1 ? dir.substring(0, slashIndex+1) : "";
    
    String temppath=  application.getRealPath("C:\\tempp\\"); //temp directory  crete two directory in web content folder
    dir = application.getRealPath("E:\\Semester IV\\Pratikum JSP\\Web Project\\jspProject\\web\\pictureBase\\");//picture uploaded directory
    String filePath = "E:\\Semester IV\\Pratikum JSP\\Web Project\\jspProject\\web\\pictureBase\\";
    // Verify the content type
    String contentType = request.getContentType();
    if ((contentType.indexOf("multipart/form-data") >= 0)) {
      DiskFileItemFactory factory = new DiskFileItemFactory();

      // maximum size that will be stored in memory
      factory.setSizeThreshold(maxMemSize);
      // Location to save data that is larger than maxMemSize.
      factory.setRepository(new File(temppath));
      // Create a new file upload handler
      ServletFileUpload upload = new ServletFileUpload(factory);
      // maximum file size to be uploaded.
      upload.setSizeMax( maxFileSize );
      try{ 
         // Parse the request to get file items.
         List fileItems = upload.parseRequest(request);
         
         // Process the uploaded file items
         Iterator i = fileItems.iterator();
         while ( i.hasNext () ) 
         { 
            dir=dir+"\\";
            FileItem fi = (FileItem)i.next();
            if ( !fi.isFormField () )	
            {
            // Get the uploaded file parameters
            String fieldName = fi.getFieldName();
            fileName = fi.getName();
            boolean isInMemory = fi.isInMemory();
            long sizeInBytes = fi.getSize();
            // Write the file
            if( fileName.lastIndexOf("\\") >= 0 ){
                
            file = new File( filePath + 
            fileName.substring( fileName.lastIndexOf("\\"))) ;
           
            }else{
            fileLoc =  filePath + fileName.substring(fileName.lastIndexOf("\\")+1);
            session.setAttribute("id_pic",fileName.substring(fileName.lastIndexOf("\\")+1));
            file = new File( fileLoc) ;
            ;
            }
            fi.write( file ) ;
            }
            }
                    
                    
      }catch(Exception ex) {
         System.out.println(ex);
      }
      
      
      
   }
 
       RequestDispatcher control =getServletContext().getRequestDispatcher("/EditCon");
    session.setAttribute("index","1");
    control.forward(request, response);
%>

