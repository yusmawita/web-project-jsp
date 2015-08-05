<%-- 
    Document   : page_home
    Created on : Jul 7, 2013, 1:03:43 PM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  String id = (String)session.getAttribute("userid");
%>
<html>
    
    <head>
        <link href="css_home.css" rel="stylesheet" type="text/css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
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
        <table border="0">
            <tr>
                <td height="400px" width="1500px" colspan="5"></td>
            </tr>
            <tr>
                <td height="240px" width="300px"><a href="page_home.jsp" class="picture"><img src="picture/home_button.png"></a></td>
                <td width="300px"><a href="http://localhost:8084/jspProject/ShowCon?index=1&userid=<%=id%>" class="picture"><img src="picture/profile_button.png"></a></td>
                <td width="300px"><a href="page_index.jsp" class="picture"><img src="picture/index_button.png"></a></td>
                <td width="300px"><a href="http://localhost:8084/jspProject/ForumCon?index=1&index2=1" class="picture"><img src="picture/forum_button.png"></a></td>
                <td width="300px"><a href="page_exam.jsp" class="picture"><img src="picture/exam_button.png"></a></td>
            </tr>
            
        </table>
            
        
    </body>
</html>
