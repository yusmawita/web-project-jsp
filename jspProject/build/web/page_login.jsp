<%-- 
    Document   : page_login
    Created on : Jul 6, 2013, 3:33:07 PM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<%
  String counter = (String)request.getAttribute("counter");
  String msg = (String)request.getAttribute("message");
%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css_login.css" rel="stylesheet" type="text/css">      
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div style="height: 100%; width: 100%; position: fixed ">
        <form action="http://localhost:8084/jspProject/UserCon" method="post">
        <table border="0">
            <tr>
                <td height="220px" width="90px"></td>
                <td height="220px" width="1410px" colspan="2"></td>
            </tr>
            <tr>
                <td  height="30px" width="90px"></td>
                <td height="30px" width="120px"><p class="a">UserID</p></td>
                <td height="30px">
                    <p class="c"> <%if(counter!=null){ %>
                    <%=msg%>
                    <%}%>
                    </p>
                </td>
            </tr>
            <tr>
                <td  height="30px" width="90px"></td>
                <td height="30px" width="1410px" colspan="2"><p class="a"><input  style=" padding-left: 8px; border-radius:10px; box-shadow: 0 1px 0 rgba(255,255,255,0.2) inset 0 1px 1px rgba(0,0,0,0.1)" required type="text" class="text" name="userid" placeholder="userID" ></p></td>
            </tr>
            
            <tr>
                <td  height="30px" width="90px"></td>
                <td height="30px" width="1410px" colspan="2"><p class="a">Password</p></td>
            </tr>
            <tr>
                <td  height="30px" width="90px"></td>
                <td height="30px" width="1410px" colspan="2"><p class="a"><input style=" padding-left: 8px; border-radius:10px; box-shadow: 0 1px 0 rgba(255,255,255,0.2) inset 0 1px 1px rgba(0,0,0,0.1)" required type="password" class="text" name="password" placeholder="password" ></p></td>
            </tr>
            <tr>
                <td height="5px"></td>
            </tr>
            <tr>
                <td></td>
                <td width="120px"><input style=" padding-left: 8px; border-radius:10px; box-shadow: 0 1px 0 rgba(255,255,255,0.2) inset 0 1px 1px rgba(0,0,0,0.1)" type="submit" class="button" value="Login"></td>
                <td><p class="a">or   <a href="page_register.jsp" style="text-decoration: none">Sign Up</a></p>
                </td>
                
            </tr>
        </table>
            <input type="hidden" name="index" value="1">
        </form>
        </div>
    </body>
</html>