<%-- 
    Document   : testinggg
    Created on : Jul 25, 2013, 11:50:09 PM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.swing.*" %>
<%int ia = 0;
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css_exam.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
                <script type="text/javascript">

function changeContent(y){
    var a = y;
document.getElementById("ch1_tit").innerHTML="Handling Utensils";
docuemnt.getElementById("oper").value=10;
}
</script>    
                
                <form method="post" action="javascript:changeContent(1);">
                    <p id="ch1_tit">
                        aaa
                    </p>
                    <input type="submit">
                </form>
<a href="javascript:changeContent(-1);">aaaa</a>
<input type="text" value="0" name="oper">
<table border="1">
    <tr>
        <td rowspan="3" width="50px">
            <p style="font-size: 30px">aaaaaaaaaaaaa</p>
        </td>
        <td colspan="2" width="50px">aaaaaaaaa </td>
    </tr>
    <tr>
        <td width="50px">aaaaaaaa</td>
        <td width="50px">aaaaaa</td>
    </tr>
    <tr>
        <td width="50px">aaaaaaa</td>
        <td width="50px">aaaaaaaaaa</td>
    </tr>
</table>

<input type="button" class="testing">

    </body>
</html>