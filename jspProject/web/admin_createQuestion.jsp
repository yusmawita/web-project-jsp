<%-- 
    Document   : page_forum
    Created on : Jul 16, 2013, 9:36:16 AM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.swing.*"%>

          
<!DOCTYPE html>
<%
String op = (String)session.getAttribute("op");
%>
<html>
    
    <head>
        <link href="css_forum.css" rel="stylesheet" type="text/css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Quesiton</title>
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
                <td style="text-align: center">
                    <form action="http://localhost:8084/jspProject/Admincon?index=13" method="post">
                        <center>
                        <table border="0">
                            <tr>
                                <td width="50px" rowspan="3" style="vertical-align: top; padding-top: 30px">Question</td>
                                <td colspan="4"><textarea required  name="squestion" rows="6" cols="60" style="resize: none"></textarea></td>
                            </tr>
                            <tr>
                                <td width="10px">A</td>
                                <td><textarea required  name="answera" rows="3" cols="26" style="resize: none"></textarea></td>
                                <td width="10px">C</td>
                                <td><textarea required  name="answerc" rows="3" cols="26" style="resize: none"></textarea></td>
                            
                            </tr>
                            <tr>
                                <td width="10px">B</td>
                                <td><textarea required  name="answerb" rows="3" cols="26" style="resize: none"></textarea></td>
                                <td width="10px">D</td>
                                <td><textarea required  name="answerd" rows="3" cols="26" style="resize: none"></textarea></td>
                            
                            </tr>
                            <tr>
                                <td>Answer</td>
                                <td colspan="4"><textarea required  name="sanswer" rows="1" cols="60" style="resize: none"></textarea></td>
                            </tr>
                            <tr>
                               <td colspan="5" style="padding-left: 50px">
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
