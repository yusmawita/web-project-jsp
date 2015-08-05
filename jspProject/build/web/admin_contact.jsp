<%-- 
    Document   : page_exam
    Created on : Jul 16, 2013, 3:37:48 AM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String id = (String)session.getAttribute("adminid");
    String[][] dataContact= (String[][])session.getAttribute("dataContact");
%>
<html>
    
    <head>
        <link href="css_admin.css" rel="stylesheet" type="text/css">
        <title>Contact</title>
    </head>
    <body>
        <div id="topdiv">
            <table>
                <tr>
                    <td colspan="6">
                        <table border="0">
            <tr>
                <td height="25px" width="1400px"></td>
                <td width="150px"></td>
                <td width="260px" style="text-align: right"><p class="b">
                    <a href="http://localhost:8084/jspProject/Admincon?index=100" class="text">Logout</a>
                    </p>
                </td>
                
            </tr>
                        </table> 
                    </td>
                
                <tr>
                    <td height="110px" width="110px"><a href="admin_home.jsp" class="picture"><img class="button" src="picture/home_button.png"></a></td>
                    <td height="110px" width="110px"><a href="admin_question.jsp?counter=0" class="picture"><img class="button" src="picture/question.png"></a></td>
                    <td height="110px" width="110px"><a href="http://localhost:8084/jspProject/Admincon?index=7" class="picture"><img class="button" src="picture/member.png"></a></td>
                    <td height="110px" width="110px"><a href="http://localhost:8084/jspProject/Admincon?index=3&index2=1" class="picture"><img class="button" src="picture/thread.png"></a></td>
                    <td width="2800"></td>
                </tr>
            </table>
        </div>
                    <table border="0">
                        <tr><td height="180px"></td></tr>
                        <tr>
                            <td width="1500px" height="50px" colspan="2"></td>                  
                        </tr>
                        <tr>
                            <td width="1050px">
            <center>
                    <table border="1" style="border-color: #000000; border-radius: 5px; border-style: double; border-spacing: 0px">
                                    
                                    <tr>
                                        <td width="100px" style="border-width: 0px; border-bottom-width: 1px; background-color: #3399ff; padding: 0px;">
                                    <center>User ID</center> 
                                        </td>
                                        <td width="550px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center>Message</center>
                                        </td>
                                        <td width="100px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center>Action</center>
                                        </td>
                                        
                                    </tr>
                                    <% for(int i = 0; i < dataContact.length;i++){ %>  
                                    <tr>
                                        <td height="40px" style="border-width: 0px ; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff"><center><%=dataContact[i][0]%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-top-width: 1px ;  background-color: #eaf5ff"><center><%=dataContact[i][1]%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-top-width: 1px ;  background-color: #eaf5ff"><center><a href="http://localhost:8084/jspProject/Admincon?index=2&contactid=<%=dataContact[i][2]%>">Delete</a></center></td>
                                    </tr>
                                    <%}%>
                                    <tr>
                                        <td height="10px" style="border-width: 0px; border-bottom-width: 1px ; border-left-width: 1px ; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                    </tr>
                                    </table> 
                </center>
                    
                </td>
                        </tr>
                        
                        
                    </table>
        
           
        
    </body>
</html>
