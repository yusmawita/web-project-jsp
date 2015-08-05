
<%-- 
    Document   : index
    Created on : Jul 6, 2013, 2:07:01 PM
    Author     : Jefry
--%>


<%@ page import="java.io.*,java.util.*" %>
<html>
<head>
<title>Auto Refresh Header Example</title>
</head>
<body>
<center>
<h2>Auto Refresh Header Example</h2>
<%
            response.setHeader("Refresh","3;url=page_login.jsp"); 
%>
</center>
</body>
</html>
