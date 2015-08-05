<%-- 
    Document   : page_register
    Created on : Jul 7, 2013, 3:13:41 PM
    Author     : Jefry
--%>

<%@ page import="java.io.*,java.util.*, javax.servlet.*,javax.swing.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="javax.servlet.RequestDispatcher"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  String counter=(String)request.getAttribute("counter");
    String err2 =(String)request.getAttribute("err_userid");
    String err3 =(String)request.getAttribute("err_pass1");
    String err4 =(String)request.getAttribute("err_pass2");
    String err6 =(String)request.getAttribute("err_match");
    
    String fullname = request.getParameter("fullname");
    String userid = request.getParameter("userid");
    String email = request.getParameter("email");
    String location = request.getParameter("location");
    String bio = request.getParameter("bio");
    
    boolean flag = true;
    if(err2!=null || err3!=null || err4!=null | err6!=null){
        flag=false;
    }    
%>

<html>
    <head>
        <link href="css_register.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <table border="0">
            <tr><td height="200px" width="1500px"></td></tr>
        </table>
        
        <table border="0">  
        <tr>
        <td width="300px"></td>
        <td height="400px" width="1500px">
        <center>
            <table border="0">
                <tr>
                    <td>
                        <form action="http://localhost:8084/jspProject/UserCon" method="post">
                        <table border="0">
                            <tr>
                                <td height="10px"></td>
                            </tr>    
                            <tr>
                                <td width="200px"><p class="a">Full Name</p></td>
                                <td width="10px">:</td>
                                <td width="225px" height="40px">
                                <input required type="text" name="fullname" <% if(!flag && fullname!=null){%> value="<%=fullname%>" <%}%>></td>
                                <td><p class="b">*</p></td>
                            </tr>
                            <tr>
                                <td><p class="a">User ID</p></td>
                                <td>:</td>
                                <td height="40px" ><input <% if(err2!=null){%> class="er" <%}%> required type="text" name="userid" <% if(err2==null && userid!=null){%> value="<%=userid%>" <%}%>></td>
                                <td><p class="b">*</p></td>
                                <td width="240px"><p class="b"><% if(err2!=null){%>UserID is already being used<%}%></p></td>
                            </tr>
                            <tr>
                                <td><p class="a">Password</p></td>
                                <td>:</td>
                                <td height="40px"><input  <% if(err3!=null || err6!=null){%> class="er" <%}%> required type="password" name="password1" ></td>
                                <td><p class="b">**</p></td>
                                <td rowspan="2" width="240px"><p class="b">
                                                                <% if(err3!=null || err6!=null || err4!=null){%>
                                                                Invalid password or password didn't match<br>
                                                                Check again your password <%}%>
                            
                                                               </p></td>
                            </tr>
                
                            <tr>
                                <td><p class="a">Re-Type Password</p></td>
                                <td>:</td>
                                <td height="40px"><input  <% if(err4!=null || err6!=null){%> class="er" <%}%> required type="password" name="password2"></td>
                                <td><p class="b">**</p></td>
                            </tr>
                
                            <tr>
                                <td><p class="a">Gender</p></td>
                                <td>:</td>
                                <td height="40px"><select name="gender"><option value="Male">Male<option value="Female">Female</select></td>
                                <td></td>
                            </tr>
                            
                            <tr>
                                <td><p class="a">Location</p></td>
                                <td>:</td>
                                <td height="40px"><input required type="text" name="location" <% if(!flag && location!=null){%> value="<%=location%>" <%}%>></td>
                                <td>
                                <p class="b">*</p>    
                        
                                </td>
                                </tr>
                
                
                            <tr>
                                <td><p class="a">Email</p></td>
                                <td>:</td>
                                <td height="40px" ><input required type="email" name="email"<% if(!flag && email!=null){%> value="<%=email%>" <%}%>></td>
                                <td><p class="b">*</p></td>
                            </tr>
                
                            <tr>
                                <td height="40px" width="250px"><p class="a">Bio</p></td>
                                <td>:</td>
                                <td ><textarea name="bio"><% if(!flag && bio!=null){%><%=bio%> <%}%></textarea></td>
                                <td></td>
                            </tr>
                 
                            <tr>
                                <td></td>
                                <td></td>
                                <td height="45px" colspan="2"><input type="submit" value="Register" class="button">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="button" type="reset" value="Reset"></td>
                            </tr>
                            <tr>
                                <td height="10px" colspan="4"><p class="b">*) Mandatory<br>**) Must be at least 5 alphanumeric characters</p></td>
                            </tr>
                        </table>
                        <input type="hidden" name="index" value="2">
                        </form>
                    </td>
                </tr>
            </table>
        </center>                
        </td></tr>
        </table>   
    </body>
</html>

