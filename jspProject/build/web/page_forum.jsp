<%-- 
    Document   : page_forum
    Created on : Jul 16, 2013, 9:36:16 AM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.swing.*"%>

          
<!DOCTYPE html>
<%
    String id = (String)session.getAttribute("userid");
    String[][] dataThread= (String[][])session.getAttribute("thread");
%>
<html>
    
    <head>
        <link href="css_forum.css" rel="stylesheet" type="text/css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forum</title>
    </head>
    <body>
        <div id="topdiv">
            <table border="0">
                <tr>
                    <td colspan="2">
                        <table border="0">
            <tr>
                <td height="25px" width="1400px"></td>
                <td width="150px"><a href="http://localhost:8084/jspProject/ShowCon?index=1&userid=<%=id%>" style="text-decoration:none;"><p class="a" style="margin-top: 0px">Hi,  
                    <%=id%>
                    </p></a></td>
                <td width="80px"><a href="page_contact.jsp"  style="text-decoration:none"><p class="a" style="margin-top: 0px">Contact</p></a></td>
                <td width="80px" ><a href="page_about.jsp"  style="text-decoration:none"><p class="a" style="margin-top: 0px"> About</p></a></td>
                <td width="80px"><a href="http://localhost:8084/jspProject/UserCon?index=100"  style="text-decoration:none"><p class="a" style="margin-top: 0px">Logout</p></a></td>
                    
                
                
            </tr>
                </table> 
                    </td>
                </tr>
                <tr>
                
                    <td height="130px" width="1300px" style="text-align: left">
                        <table border="0">
                                    <tr>
                                        <td height="135px" width="180px"><a href="page_home.jsp" class="picture"><img class="button" src="picture/home_button.png"></a></td>
                                        <td width="180px" ><a href="http://localhost:8084/jspProject/ShowCon?index=1&userid=<%=id%>" class="picture"><img class="button" src="picture/profile_button.png"></a></td>
                                        <td  width="180px" ><a href="page_index.jsp" class="picture"><img class="button" src="picture/index_button.png"></a></td>
                                        <td  width="180px" ><a href="page_exam.jsp" class="picture"><img class="button" src="picture/exam_button.png"></a></td>
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
                <td height="30px" style="text-align: right"><a href="page_createForum.jsp"><input type="button" value="+ Create New Thread" class="buttona"></a></td>
            </tr>
            <tr>
                <td height="20px"  style="text-align: right; padding-right: 145px"><a href="http://localhost:8084/jspProject/ForumCon?index=1&index2=2" style="text-decoration: none">Show All Thread</a></td>
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
                                        <td width="200px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Last Comment</p></center>
                                        </td>
                                        <td width="180px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; border-left-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Stats</p></center>
                                        </td>
                                        
                                    </tr>
                                    <%for (int i = 0; i < dataThread.length; i++) {%>    
                                    <tr>
                                        <td height="60px" style="border-width: 0px ; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff"><center><%=dataThread[i][3]%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff; padding-left: 10px">
                                            <a href="http://localhost:8084/jspProject/ForumCon?index=3&index2=1&threadno=<%=i%>&threadid=<%=dataThread[i][0]%>" style="text-decoration: none"><p style=" color: #000000; font-weight: bold"><%=dataThread[i][1]%></p></a>
                                        </td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff"><center><%=dataThread[i][5]%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff"><center><%=dataThread[i][4]%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-top-width: 1px ;  background-color: #eaf5ff; padding-left: 10px">
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
                                    </tr>
                                     <%}%>
                                    <tr>
                                        <td height="10px" style="border-width: 0px; border-bottom-width: 1px ; border-left-width: 1px ; background-color: #eaf5ff"></td>
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
