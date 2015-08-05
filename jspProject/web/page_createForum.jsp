<%-- 
    Document   : page_forum
    Created on : Jul 16, 2013, 9:36:16 AM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.swing.*"%>

          
<!DOCTYPE html>
<%
    String id = (String)session.getAttribute("userid");
%>
<html>
    
    <head>
        <link href="css_forum.css" rel="stylesheet" type="text/css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Forum</title>
    </head>
    <body>
        <div id="topdiv">
            <table border="0">
                <tr>
                    <td colspan="2">
                        <table border="0">
            <tr>
                <td height="25px" width="1400px"></td>
                <td width="150px"><a href="http://localhost:8084/jspProject/ShowCon?index=1&userid=<%=id%>" style="text-decoration:none;"><p class="a" style="margin-top: 0px">Hi,  
                    <%=id%>
                    </p></a></td>
                <td width="80px"><a href="page_contact.jsp"  style="text-decoration:none"><p class="a" style="margin-top: 0px">Contact</p></a></td>
                <td width="80px" ><a href="page_about.jsp"  style="text-decoration:none"><p class="a" style="margin-top: 0px"> About</p></a></td>
                <td width="80px"><a href="http://localhost:8084/jspProject/UserCon?index=100"  style="text-decoration:none"><p class="a" style="margin-top: 0px">Logout</p></a></td>
                    
                
                
            </tr>
                </table> 
                    </td>
                </tr>
                <tr>
                
                    <td height="130px" width="1300px" style="text-align: left">
                        <table border="0">
                                    <tr>
                                        <td height="135px" width="180px"><a href="page_home.jsp" class="picture"><img class="button" src="picture/home_button.png"></a></td>
                                        <td width="180px" ><a href="http://localhost:8084/jspProject/ShowCon?index=1&userid=<%=id%>" class="picture"><img class="button" src="picture/profile_button.png"></a></td>
                                        <td  width="180px" ><a href="page_index.jsp" class="picture"><img class="button" src="picture/index_button.png"></a></td>
                                        <td  width="180px" ><a href="http://localhost:8084/jspProject/ForumCon?index=1&index2=1" class="picture"><img src="picture/forum_button.png" class="button"></a></td>
                                        <td  width="180px" ><a href="page_exam.jsp" class="picture"><img class="button" src="picture/exam_button.png"></a></td>
                                        
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
                <td width="1500px" height="130px">
                    <p class="title">
                        Create New Thread
                    </p>
                </td>
                
            </tr>
            <tr>
                <td>
            <form action="http://localhost:8084/jspProject/ForumCon?index=2&index2=1" method="post">
            <center>
                
                    <table border="0">
                        <tr>
                            <td width="100px"><p class="create">Title</p></td>
                            <td>&nbsp;&nbsp;:&nbsp;&nbsp;</td>
                            <td><input required type="text" name="title" style="width: 398px"></td>
                        </tr>
                        <tr>
                            <td height="5px" colspan="3"></td>
                        </tr>
                        <tr>
                            <td width="100px"><p class="create">Content</p></td>
                            <td>&nbsp;&nbsp;:&nbsp;&nbsp;</td>
                            <td><textarea required  name="content" rows="8" cols="47" style="resize: none"></textarea></td>
                        </tr>
                        <tr>
                            <td colspan="3" style="padding-left: 130px">
                        <center>
                            <input type="submit" value="Create" class="button">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="button" type="reset" value="Reset">
                        </center>
                            
                            </td>
                        </tr>
                    </table>
            </center>
                    </form>
                </td>
            </tr>
            
            
            
        </table>
        
           
        
    </body>
</html>
