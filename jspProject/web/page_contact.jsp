<%-- 
    Document   : page_exam
    Created on : Jul 16, 2013, 3:37:48 AM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String id = (String)session.getAttribute("userid");
    String counter = (String)request.getAttribute("counter");
    String msg = (String)request.getAttribute("message");
%>
<html>
    
    <head>
        <link href="css_exam.css" rel="stylesheet" type="text/css">
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
                    <td  width="180px"><a href="page_exam.jsp" class="picture"><img class="button" src="picture/exam_button.png"></a></td>
                    <td width="2800"></td>
                </tr>
            </table>
        </div>
                    <table border="0">
                        <tr><td height="180px"></td></tr>
                        <tr>
                            <td width="1500px" height="140px" colspan="2">
                                <p class="title" style="color: #000000">
                                Contact
                                </p>
                            </td>
                            
                        </tr>
                        <tr>
                            <td style="padding-left: 20px">
                                <form action="http://localhost:8084/jspProject/UserCon?index=99" method="post">
                    <table border="0">
                        
                        <tr>
                            <td width="100px"><p class="create">Comment</p></td>
                            <td>&nbsp;&nbsp;:&nbsp;&nbsp;</td>
                            <td><textarea required  name="comment" rows="8" cols="47" style="resize: none"></textarea></td>
                        </tr>
                        <tr>
                            <td colspan="3" style="padding-left: 130px">
                        <center>
                            <input type="submit" value="Send" class="button">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="button" type="reset" value="Reset">
                        </center>
                            
                            </td>
                        </tr>
                    </table>
                    </form>
                            </td>
                            
                                <td><p style="font-size: 60px">
                                 <%if(counter!=null){ %>
                                 <%=msg%>
                                 <%}%>
                    
                                </p></td>
                        </tr>
                        
                    </table>
        
           
        
    </body>
</html>
