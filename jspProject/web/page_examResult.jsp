<%-- 
    Document   : page_examResult
    Created on : Jul 16, 2013, 8:52:26 AM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.swing.*"%>

          
<!DOCTYPE html>
<%
    String id = (String)session.getAttribute("userid");
    String message = (String)request.getAttribute("resultmes");
    String message2 = (String)request.getAttribute("resultmes2");
    String[][] feedback = (String[][])request.getAttribute("feedback");
    
%>
<html>
    
    <head>
        <link href="css_exam.css" rel="stylesheet" type="text/css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exam</title>
    </head>
    <body>
        <div id="topdiv">
            <table border="0">
                <table border="0">
                <tr>
                    <td>
                        <table border="0">
            <tr>
                <td height="25px" width="1350px"></td>
                <td width="150px"><a href="http://localhost:8084/jspProject/ShowCon?index=1&userid=<%=id%>" style="text-decoration:none;"><p class="a">Hi,  
                    <%=id%>
                    
                    </p></a></td>
                
            </tr>
     </table> 
                    </td>
                <tr>
                </tr>
                    <td height="150px" width="500px">
                        <p class="title">
                          Examination 
                        </p>
                    </td>
                    </tr>
            </table>
        </div>
        <table border="0">
            <tr>
                <td width="1500px" height="180px"></td>
            </tr>
            <tr>
                <td width="1000px" height="490px">
                    <table border="0">
                        <tr>
                            <td height="60px" width="1000px">
                                <p class="result">
                                <%=message%>
                                </p>    
                            </td>
                        </tr>
                        <tr>
                            <td>Item Feedback :</td>
                        </tr>
                        <tr>
                            <td height="390px">
                                <table border="1" style="border-color: #000000; border-radius: 5px; border-style: double; border-spacing: 0px">
                                    <tr>
                                        <td style="border-width: 0px; border-bottom-width: 1px; background-color: #3399ff; padding: 0px;">
                                           No 
                                        </td>
                                        <td style="border-width: 0px; border-bottom-width: 1px; border-left-width: 1px; background-color: #3399ff;">
                                        <center>Feedback</center>
                                        </td>
                                        
                                    </tr>
                                    <% if(feedback!=null){
                                        for(int i = 0; i < feedback.length; i++){  
                                        if(!feedback[i][0].equals(" ")){
                                    %>
                                    <tr>
                                        <td style="border-width: 0px ; background-color: #eaf5ff"><center><%=(i+1)%></center></td>
                                        <td style="border-width: 0px; border-left-width: 1px ; background-color: #eaf5ff"><%=feedback[i][0]%></td>
                                    </tr>
                                    <tr>
                                        <td rowspan="2" style="border-width: 0px; border-bottom-width: 1px ; background-color: #eaf5ff"></td>
                                        <td style="border-width: 0px; border-left-width: 1px; background-color: #eaf5ff">
                                            <table>
                                              <tr>
                                                  <td>Your Answer</td>
                                                  <td>&nbsp;:&nbsp;&nbsp;</td>
                                                  <td><%=feedback[i][2]%></td>
                                              </tr>  
                                              <tr>
                                                  <td>Correct Answer</td>
                                                  <td>&nbsp;:&nbsp;&nbsp;</td>
                                                  <td><%=feedback[i][1]%></td>
                                              </tr>
                                            </Table>
                                            
                                        </td>
                                    </tr>
                                    
                                    <tr>
                                        <td height="20px" style="border-width: 0px; border-bottom-width: 1px ; border-left-width: 1px ; background-color: #eaf5ff"></td>
                                    </tr>
                                    <%}}}%>
                                </table> 
                                
                            </td>
                        </tr>
                        
                    </table>
                    
                    
                </td>
                <td width="400px" style="vertical-align: top">
                    <table border="0">
                        <tr>
                            <td height="40px" width="400px" style=" text-align: right">
                                <a href="page_home.jsp"><img src="picture/exam_home.png" style="width:250px; height: 50px"></a>
                            </td>
                        </tr>
                        <tr>
                            <td height="420px">
                        <center><img src="<%if(message2.equals("Passed")){%>picture/passed.png<%}else{%>picture/failed.png<%}%>" style="width:300px; height:150px; margin-right: 0px" ></center>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
        
           
        
    </body>
</html>
