package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.swing.*;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    File file ;
    String fileName="";
    String fileLoc="";
    int maxFileSize = 5000 * 1024;
    int maxMemSize = 5000 * 1024;
    ServletContext context = pageContext.getServletContext();
    String dir = request.getServletPath();
    int slashIndex = dir.lastIndexOf('/');
    dir = slashIndex != -1 ? dir.substring(0, slashIndex+1) : "";
    String temppath=  application.getRealPath(dir + "\\temp\\"); //temp directory  crete two directory in web content folder
    dir = application.getRealPath(dir + "\\pictureBase\\");//picture uploaded directory
    String filePath = "E:\\Semester IV\\Pratikum JSP\\Web Project\\jspProject\\build\\web\\pictureBase\\";
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
            file = new File( fileLoc) ;
            ;
            }
            fi.write( file ) ;
            }
            }
         
      }catch(Exception ex) {
         System.out.println(ex);
      }
   }else{
       }
 
  HttpSession sess = request.getSession();
  String id = (String)sess.getAttribute("userid");
  sess.setAttribute("filePath",fileName);
  String fullname=(String)request.getAttribute("fullname");
  String email=(String)request.getAttribute("email");
  String location=(String)request.getAttribute("location");
  String bio=(String)request.getAttribute("bio");
  String gender=(String)request.getAttribute("gender");
  JOptionPane.showMessageDialog(null,""+sess.getAttribute("filePath"));
  
  RequestDispatcher control=null;
  
  request.setAttribute("flag","1");
  request.setAttribute("fileName",fileName);
  request.setAttribute("id",id);
  request.setAttribute("fullname",fullname);
  request.setAttribute("email",email);
  request.setAttribute("location",location);
  request.setAttribute("bio",bio);
  fullname="";
  control=getServletContext().getRequestDispatcher("/page_register.jsp");
  control.forward(request,response);
 

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
