<%-- 
    Document   : page_exam
    Created on : Jul 16, 2013, 3:37:48 AM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String id = (String)session.getAttribute("userid");  
%>
<html>
    
    <head>
        <link href="css_exam.css" rel="stylesheet" type="text/css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exam</title>
    </head>
    <body>
        <div id="topdiv">
            <table>
                <tr>
                    <td colspan="5">
                        <table border="0">
            <tr>
                <td height="25px" width="1400px"></td>
                <td width="150px"><a href="http://localhost:8084/jspProject/ShowCon?index=1&userid=<%=id%>" style="text-decoration:none;"><p class="a" style="margin-top: 0px">Hi,  
                    <%=id%>
                    
                    </p></a></td>
                <td width="260px"><p class="b">
                    <a href="page_contact.jsp" class="text">Contact</a>
                    <a href="page_about.jsp" class="text">About</a>
                    <a href="http://localhost:8084/jspProject/UserCon?index=100" class="text">Logout</a>
                    </p>
                </td>
                
            </tr>
                        </table> 
                    </td>
                
                <tr>
                    <td height="110px" width="110px"><a href="page_home.jsp" class="picture"><img class="button" src="picture/home_button.png"></a></td>
                    <td height="110px" width="110px"><a href="http://localhost:8084/jspProject/ShowCon?index=1&userid=<%=id%>" class="picture"><img class="button" src="picture/profile_button.png"></a></td>
                    <td height="110px" width="110px"><a href="page_index.jsp" class="picture"><img class="button" src="picture/index_button.png"></a></td>
                    <td height="110px" width="110px"><a href="http://localhost:8084/jspProject/ForumCon?index=1&index2=1" class="picture"><img class="button" src="picture/forum_button.png"></a></td>
                    <td width="2800"></td>
                </tr>
            </table>
        </div>
        <table border="0">
            <tr>
                <td width="1500px" height="180px"></td>
            </tr>
            <tr>
                <td width="1500px" height="490px">
                    <form action="http://localhost:8084/jspProject/ExamCon" method="POST">
                    <table border="0">
                        <tr>
                            <td height="40px" width="1500px">
                                
                                <p>
                                 Choose chapter below :
                                </p>
                            </td>
                        </tr>
                        <tr>
                            <td height="40px">
                                <select name="chapter">
                                    <option value="ch1">Chapter 1
                                        <option value="ch2">Chapter 2
                                            <option value="ch3">Chapter 3
                                                <option value="ch4">Chapter 4
                                                    <option value="ch5">Chapter 5
                                                        <option value="ch6">Chapter 6
                                </select>
                                <input type="submit" class="buttona">
                                <input type="hidden" name="index" value="1">
                            </td>
                        </tr>
                        <tr>
                            <td height="375px"></td>
                        </tr>
                            
                    </table>
                    </form>
                </td>
            </tr>
        </table>
        
           
        
    </body>
</html>
