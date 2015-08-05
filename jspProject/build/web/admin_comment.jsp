<%-- 
    Document   : page_forum
    Created on : Jul 16, 2013, 9:36:16 AM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.swing.*"%>

          
<!DOCTYPE html>
<%
    String[][] dataComment= (String[][])session.getAttribute("comment");
    String[][] dataThread= (String[][])session.getAttribute("thread");
    int threadno = (Integer)request.getAttribute("threadno");
    int threadid = (Integer)request.getAttribute("threadid");
%>
<html>
    
    <head>
        <link href="css_forum.css" rel="stylesheet" type="text/css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forum</title>
    </head>
    <body>
        <div id="topdiv">
            <table border="0">
                <tr>
                    <td colspan="2">
                        <table border="0">
            <tr>
                <td height="25px" width="1400px"></td>
                <td width="150px"></td>
                <td width="80px"></td>
                <td width="80px" ></td>
                <td width="80px"><a href="http://localhost:8084/jspProject/Admincon?index=100"  style="text-decoration:none"><p class="a" style="margin-top: 0px">Logout</p></a></td>
                    
                
                
            </tr>
                </table> 
                    </td>
                </tr>
                <tr>
                
                    <td height="130px" width="1300px" style="text-align: left">
                        <table border="0">
                                    <tr>
                        <td height="110px" width="180px"><a href="admin_home.jsp" class="picture"><img class="button" src="picture/home_button.png"></a></td>
                        <td height="110px" width="180px"><a href="admin_question.jsp?counter=0" class="picture"><img class="button" src="picture/question.png"></a></td>
                        <td height="110px" width="180px"><a href="http://localhost:8084/jspProject/Admincon?index=7" class="picture"><img class="button" src="picture/member.png"></a></td>
                        <td  width="180px" ><a href="http://localhost:8084/jspProject/Admincon?index=3&index2=1" class="picture"><img class="button" src="picture/thread.png"></a></td>
                        <td height="110px" width="180px"><a href="http://localhost:8084/jspProject/Admincon?index=1" class="picture"><img class="button" src="picture/contact.png"></a></td>
                        
                                    </tr>
                                </table>
                    </td>
                    
                </tr>
                
            </table>
        </div>
        <table border="0">
            <tr>
                <td width="1500px" height="180px"></td>
            </tr>
            <tr>
                <td height="30px" style="text-align: right"></td>
            </tr>
            <tr>
                <td height="20px"  style="text-align: right; padding-right: 145px">View : <%=dataThread[threadno][6]%> Comment : <%=dataThread[threadno][7]%></td>
            </tr>
            
            <tr>
                <td width="1050px">
            <center>
                    <table border="1" style="border-color: #000000; border-radius: 5px; border-style: double; border-spacing: 0px">
                                    
                                    <tr>
                                        <td width="100px" style="border-width: 0px; border-bottom-width: 1px; background-color: #3399ff; padding: 0px;">
                                    <center>Date Posted</center> 
                                        </td>
                                        <td width="450px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center>Thread</center>
                                        </td>
                                        <td width="210px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center>Posted By</center>
                                        </td>
                                        <td width="210px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center>Last Comment</center>
                                        </td>
                                        <td width="80px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; border-left-width: 1px; background-color: #3399ff;">
                                        <center>Action</center>
                                        </td>
                                        
                                    </tr>
                                      
                                    <tr>
                                        <td height="40px" style="border-width: 0px ; border-left-width: 1px ; border-bottom-width: 1px ; background-color: #eaf5ff"><center><%=dataThread[threadno][3]%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px ; background-color: #eaf5ff; padding-left: 10px"><%=dataThread[threadno][1]%></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px ; background-color: #eaf5ff"><center><%=dataThread[threadno][5]%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px ;  background-color: #eaf5ff"><center><%=dataThread[threadno][4]%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px ;  background-color: #eaf5ff">
                                            <center><a href="http://localhost:8084/jspProject/Admincon?index=4&threadid=<%=dataThread[threadno][0]%>">Delete</a></center>          
                                            
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 0px ; background-color: #eaf5ff; padding-top: 5px"><center>Content</center></td>
                                        <td width="900px" colspan="4" style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 0px ;  background-color: #eaf5ff; padding-left: 20px ; padding-top: 5px"><%=dataThread[threadno][2]%></td>
                                    </tr>
                                    
                                    <tr>
                                        <td height="10px" style="border-width: 0px; border-bottom-width: 1px ; border-left-width: 1px ; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 0px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 0px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 0px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                    </tr>
                                    </table> 
                </center>
                    
                </td>
            </tr>
            
            <% for(int i = 0; i < dataComment.length; i++) {%>
            <tr>
                <td height="20px"></td>
            </tr>
            <tr>
                <td>
            <center>
                <table border="1" style="border-color: #000000; border-radius: 5px; border-style: double; border-spacing: 0px">
                                    <tr>
                                        <td width="100px" style="border-width: 0px; border-bottom-width: 1px; background-color: #3399ff; padding: 0px;">
                                    <center>User ID</center> 
                                        </td>
                                        <td width="670px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center>Comment</center>
                                        </td>
                                        <td width="200px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center>Comment Date</center>
                                        </td>
                                        <td width="80px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; border-left-width: 1px; background-color: #3399ff;">
                                        <center>Action</center>
                                        </td>
                                        
                                    </tr>
                                    <tr>
                                        <td height="40px" style="border-width: 0px ; border-left-width: 1px ; border-bottom-width: 0px ; background-color: #eaf5ff"><center><%=dataComment[i][0]%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 0px ; background-color: #eaf5ff; padding-left: 10px"><%=dataComment[i][1]%></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 0px ; background-color: #eaf5ff; padding-left: 10px"><center><%=dataComment[i][2]%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 0px ;  background-color: #eaf5ff"><center><a href="http://localhost:8084/jspProject/Admincon?index=6&commentid=<%=dataComment[i][3]%>&threadno=<%=threadno%>&threadid=<%=threadid%>">Delete</a></center></td>
                                    </tr>
                                    <tr>
                                        <td height="10px" style="border-width: 0px; border-bottom-width: 1px ; border-left-width: 1px ; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                    </tr>
                                    </table>
            </center>
                </td>
            </tr>
            <%}%>
            <tr>
                <td style="padding-left: 140px"></td>
            </tr>
            <tr>
                <td style="padding-left: 140px">
            
                </td>
            </tr>
        </table>
        
           
        
    </body>
</html>
