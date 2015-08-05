<%-- 
    Document   : newjsp
    Created on : Jul 21, 2013, 9:11:04 PM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="upload" action="upload2.jsp" method="POST" enctype="multipart/form-data">
          <input type="file" name="aaa" class="bd" onchange="upload.submit();">
        </form>
    </body>
</html>
