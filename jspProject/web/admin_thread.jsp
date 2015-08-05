<%-- 
    Document   : page_exam
    Created on : Jul 16, 2013, 3:37:48 AM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String id = (String)session.getAttribute("memberid");
    String[][] dataThread= (String[][])session.getAttribute("thread");
%>
<html>
    
    <head>
        <link href="css_exam.css" rel="stylesheet" type="text/css">
        <title>Thread</title>
    </head>
    <body>
        <div id="topdiv">
            <table>
                <tr>
                    <td colspan="5">
                        <table border="0">
            <tr>
                <td height="25px" width="1400px"></td>
                <td width="150px"></td>
                <td width="260px" style="text-align: right; padding-right: 10px "><p class="b">
                    <a href="http://localhost:8084/jspProject/UserCon?index=100" class="text">Logout</a>
                    </p>
                </td>
                
            </tr>
                        </table> 
                    </td>
                
                <tr>
                    <td height="110px" width="110px"><a href="admin_home.jsp" class="picture"><img class="button" src="picture/home_button.png"></a></td>
                    <td height="110px" width="110px"><a href="admin_question.jsp?counter=0" class="picture"><img class="button" src="picture/question.png"></a></td>
                    <td height="110px" width="110px"><a href="http://localhost:8084/jspProject/Admincon?index=7" class="picture"><img class="button" src="picture/member.png"></a></td>
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
                <td height="20px"  style="text-align: right; padding-right: 145px"><a href="http://localhost:8084/jspProject/Admincon?index=3&index2=2" style="text-decoration: none">Show All Thread</a></td>
            </tr>
            <tr>
                <td>
            <center>
                    <table border="1" style="border-color: #000000; border-radius: 5px; border-style: double; border-spacing: 0px">
                                    <tr>
                                        <td width="100px" style="border-width: 0px; border-bottom-width: 1px; background-color: #3399ff; padding: 0px;">
                                    <center><p style=" color: #ffffff; font-weight: bold">Date Posted</p></center> 
                                        </td>
                                        <td width="350px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Thread</p></center>
                                        </td>
                                        <td width="150px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Posted By</p></center>
                                        </td>
                                        <td width="170px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Last Comment</p></center>
                                        </td>
                                        <td width="130px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Stats</p></center>
                                        </td>
                                        <td width="80px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; border-left-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Action</p></center>
                                        </td>
                                        
                                    </tr>
                                    <%for (int i = 0; i < dataThread.length; i++) {%>    
                                    <tr>
                                        <td height="60px" style="border-width: 0px ; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff"><center><%=dataThread[i][3]%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff; padding-left: 10px">
                                            <a href="http://localhost:8084/jspProject/Admincon?index=5&index2=1&threadno=<%=i%>&threadid=<%=dataThread[i][0]%>" style="text-decoration: none"><p style=" color: #000000; font-weight: bold"><%=dataThread[i][1]%></p></a>
                                        </td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff"><center><%=dataThread[i][5]%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff"><center><%=dataThread[i][4]%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff">
                                            <table>
                                                <tr>
                                                    <td width="50px">View</td>
                                                    <td>&nbsp;&nbsp;:&nbsp;&nbsp;</td>
                                                    <td><%=dataThread[i][6]%></td>
                                                </tr>
                                                <tr>
                                                    <td width="50px">Comment</td>
                                                    <td>&nbsp;&nbsp;:&nbsp;&nbsp;</td>
                                                    <td><%=dataThread[i][7]%></td>
                                                </tr>
                                            </table>
                                        </td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-top-width: 1px ;  background-color: #eaf5ff; padding-left: 10px">
                                         <center><a href="http://localhost:8084/jspProject/Admincon?index=4&threadid=<%=dataThread[i][0]%>">Delete</a></center>   
                                            
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
                                    </tr>
                                    </table> 
                </center>
                    
                </td>
            </tr>
            
        </table>
    </body>
</html>
