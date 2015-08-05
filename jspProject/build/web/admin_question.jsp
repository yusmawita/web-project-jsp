<%-- 
    Document   : page_exam
    Created on : Jul 16, 2013, 3:37:48 AM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.swing.JOptionPane" %>
<!DOCTYPE html>
<%
 String[][] question = (String[][])session.getAttribute("question");
 String counter = (String)request.getAttribute("counter");
%>
<html>
    
    <head>
        <link href="css_exam.css" rel="stylesheet" type="text/css">
        <title>Question</title>
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
                    <td height="110px" width="110px"><a href="http://localhost:8084/jspProject/Admincon?index=7" class="picture"><img class="button" src="picture/member.png"></a></td>
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
                <td height="20px"  style="text-align: center; padding-left: 300px">
                    <form action="http://localhost:8084/jspProject/Admincon?index=10" method="post">
                    <select name="chapter">
                                    <option value="ch1">Chapter 1
                                        <option value="ch2">Chapter 2
                                            <option value="ch3">Chapter 3
                                                <option value="ch4">Chapter 4
                                                    <option value="ch5">Chapter 5
                                                        <option value="ch6">Chapter 6
                                </select>
                                <input type="submit" class="buttona" value="Show">
                                <input type="hidden" name="index" value="1">
                    
                    </form>
                    
                </td>
                <td>
                   <%if(counter!=null){%>
                    <a href="admin_createQuestion.jsp"><input type="button" value="+ Create New Question" class="buttona" style="width:150px"></a>
                    <%}%> 
                </td>
                
            </tr>
            <tr>
                <td colspan="2">
            <center>
                <%if(counter!=null){%>
                    <table border="1" style="border-color: #000000; border-radius: 5px; border-style: double; border-spacing: 0px">
                                    <tr>
                                        <td rowspan="2"  width="80px" style="border-width: 0px; border-bottom-width: 1px; background-color: #3399ff; padding: 0px;">
                                    <center><p style=" color: #ffffff; font-weight: bold">Question ID</p></center> 
                                        </td>
                                        <td rowspan="2" width="300px" style="border-width: 0px; border-bottom-width: 1px; border-left-width: 1px; background-color: #3399ff; padding: 0px;">
                                    <center><p style=" color: #ffffff; font-weight: bold">Question</p></center> 
                                        </td>
                                        <td width="150px" colspan="4" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Choice</p></center>
                                        </td>
                                        <td rowspan="2" width="80px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Answer</p></center>
                                        </td>
                                        <td rowspan="2" width="80px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Edit</p></center>
                                        </td>
                                        <td rowspan="2" width="80px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; border-left-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">Delete</p></center>
                                        </td>
                                        
                                    </tr>
                                    <tr>
                                        <td  width="200px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">A</p></center>
                                        </td>
                                        <td width="200px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">B</p></center>
                                        </td>
                                        <td width="200px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">C</p></center>
                                        </td>
                                        <td width="200px" style="border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;">
                                        <center><p style=" color: #ffffff; font-weight: bold">D</p></center>
                                        </td>
                                    </tr>
                                    <%for (int i = 0; i < question.length; i++) {%>    
                                    <tr>
                                        <td height="60px" style="border-width: 0px ; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff"><center><%=question[i][0]%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff; padding-left: 10px"><%=question[i][1]%></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff; padding-left: 10px"><%=question[i][2]%></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff; padding-left: 10px"><%=question[i][3]%></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff; padding-left: 10px"><%=question[i][4]%></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff; padding-left: 10px"><%=question[i][5]%></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff; padding-left: 10px"><%=question[i][6]%></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; border-top-width: 1px ; background-color: #eaf5ff; padding-left: 10px">
                                         <center><a href="admin_editQuest.jsp?questid=<%=question[i][0]%>&questno=<%=i%>">Edit</a></center>    
                                        </td>
                                        <td style="border-width: 0px; border-left-width: 1px ;border-top-width: 1px ;  background-color: #eaf5ff">
                                         <center><a href="http://localhost:8084/jspProject/Admincon?index=12&questid=<%=question[i][0]%>">Delete</a></center>   
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
                                    <%}%>
                </center>
                    
                </td>
            </tr>
            
        </table>
        
           
        
    </body>
</html>
