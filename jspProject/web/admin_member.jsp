<%-- 
    Document   : page_exam
    Created on : Jul 16, 2013, 3:37:48 AM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
 String[][] dataMember = (String[][])session.getAttribute("dataMember");
%>
<html>
    
    <head>
        <link href="css_exam.css" rel="stylesheet" type="text/css">
        <title>Member</title>
    </head>
    <body>
        <div id="topdiv">
            <table>
                <tr>
                    <td colspan="6">
                        <table border="0">
            <tr>
                <td height="25px" width="1400px"></td>
                <td width="150px"></td>
                <td width="260px" style="text-align: right; padding-right: 10px"><p class="b">
                    <a href="http://localhost:8084/jspProject/Admincon?index=100" class="text">Logout</a>
                    </p>
                </td>
                
            </tr>
                        </table> 
                    </td>
                
                <tr>
                    <td height="110px" width="110px"><a href="admin_home.jsp" class="picture"><img class="button" src="picture/home_button.png"></a></td>
                    <td height="110px" width="110px"><a href="admin_question.jsp?counter=0" class="picture"><img class="button" src="picture/question.png"></a></td>
                    <td height="110px" width="110px"><a href="http://localhost:8084/jspProject/Admincon?index=3&index2=1" class="picture"><img class="button" src="picture/thread.png"></a></td>
                    <td height="110px" width="110px"><a href="http://localhost:8084/jspProject/Admincon?index=1" class="picture"><img class="button" src="picture/contact.png"></a></td>
                    <td width="2800"></td>
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
                <td height="20px"  style="text-align: right; padding-right: 10px">
                    <form action="http://localhost:8084/jspProject/Admincon?index=9" method="post">
                        <input type="text" placeholder="Search by ID" required name="userid"><input type="submit" value="" style="background-color: transparent; background-image:url(picture/search_icon.png); background-size: cover; width:30px; height: 25px; border: none">
                    </form>
                </td>
            </tr>
            <tr>
                <td>
            <center>
                    <table border="1" style="border-color: #000000; border-radius: 5px; border-style: double; border-spacing: 0px">
                                    <tr>
                                        <td width="150px" style="border-width: 0px; border-bottom-width: 1px; background-color: #3399ff; padding: 0px;">
                                    <center><p style=" color: #ffffff; font-weight: bold">User ID</p></center> 
                                        </td>
                                        <td width="200px" style="border-width: 0px; border-bottom-width: 1px; border-left-width: 1px; background-color: #3399ff; padding: 0px;">
                                    <center><p style=" color: #ffffff; font-weight: bold">Picture</p></center> 
                                        </td>
                                        <td width="150px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Password</p></center>
                                        </td>
                                        <td width="150px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Full Name</p></center>
                                        </td>
                                        <td width="100px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Gender</p></center>
                                        </td>
                                        <td width="130px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Location</p></center>
                                        </td>
                                        <td width="250px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Email</p></center>
                                        </td>
                                        <td width="200px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Bio</p></center>
                                        </td>
                                        <td width="80px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; border-left-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Action</p></center>
                                        </td>
                                        
                                    </tr>
                                    <%for (int i = 0; i < dataMember.length; i++) {%>    
                                    <tr>
                                        <td height="60px" style="border-width: 0px ; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff"><center><%=dataMember[i][0]%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff"><img src="pictureBase/<%=dataMember[i][3]%>" style="width:200px; height: 150px"></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff; padding-left: 10px"><%=dataMember[i][2]%></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff; padding-left: 10px"><%=dataMember[i][1]%></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff"><center><%=dataMember[i][4]%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff; padding-left: 10px"><%=dataMember[i][5]%></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff; padding-left: 10px"><%=dataMember[i][6]%></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff; padding-left: 10px"><%=dataMember[i][7]%></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-top-width: 1px ;  background-color: #eaf5ff">
                                         <center><a href="http://localhost:8084/jspProject/Admincon?index=8&userid=<%=dataMember[i][0]%>">Delete</a></center>   
                                        </td>
                                    </tr>
                                     <%}%>
                                    <tr>
                                        <td height="10px" style="border-width: 0px; border-bottom-width: 1px ; border-left-width: 1px ; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff"></td>
                                    </tr>
                                    </table> 
                </center>
                    
                </td>
            </tr>
            
        </table>
    </body>
</html>
