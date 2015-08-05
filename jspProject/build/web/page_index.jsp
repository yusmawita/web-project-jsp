<%-- 
    Document   : page_index
    Created on : Jul 15, 2013, 11:06:15 PM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String id = (String)session.getAttribute("userid");
    session.removeAttribute("id_pic");
%>
<html>
    <head>
        <link href="css_index.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
                <table border="0">
            <tr>
                <td height="25px" width="1000px"></td>
                <td width="200px"><a href="http://localhost:8084/jspProject/ShowCon?index=1&userid=<%=id%>" style="text-decoration:none"><p class="a">Hi,  
                    <%=id%>
                    
                    </p></a></td>
                <td width="300px"><p class="b">
                    <a href="page_contact.jsp" class="text">Contact</a>
                    <a href="page_about.jsp" class="text">About</a>
                    <a href="http://localhost:8084/jspProject/UserCon?index=100" class="text">Logout</a>
                    </p>
                </td>
            </tr>
        </table>
        <table border="0" >
            <tr>
                <td width="1500px" height="630px">
                    <table border="0">
                        <tr>
                            <td width="1500px" height="160px">
                                <table border="0">
                                    <tr>
                                        
                                        <td height="130px" width="180px"><a href="page_home.jsp" class="picture"><img class="button" src="picture/home_button.png"></a></td>
                                        <td height="130px" width="180px"><a href="http://localhost:8084/jspProject/ShowCon?index=1&userid=<%=id%>" class="picture"><img class="button" src="picture/profile_button.png"></a></td>
                                        <td height="130px" width="180px"><a href="http://localhost:8084/jspProject/ForumCon?index=1&index2=1" class="picture"><img class="button" src="picture/forum_button.png"></a></td>
                                        <td height="130px" width="180px"><a href="page_exam.jsp" class="picture"><img class="button" src="picture/exam_button.png"></a></td>
                                        <td height="130px" width="180px"></td>
                                        <td height="130px" width="180px"></td>
                                        <td height="130px" width="180px"></td>
                                        <td height="130px" width="180px"></td>
                                    </tr>
                                    <tr>
                                        <td height="20px">
                                            
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td height="450px">
                                <param name="allowScriptAccess" value="sameDomain"/>
                                <param name="movie" value="picture/index.swf"/>
                                <param name="wmode" value="transparent"/>
                                <param name="quality" value="high" />
                                <embed src="picture/index.swf" quality="high" name="clock" height="400px" width="1200px" align="middle" allowScriptAccess="sameDomain" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" wmode="transparent"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
    </body>
</html>
