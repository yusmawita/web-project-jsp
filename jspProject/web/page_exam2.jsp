<%-- 
    Document   : page_exam2
    Created on : Jul 16, 2013, 5:46:35 AM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.swing.JOptionPane" %>
<!DOCTYPE html>
<%
    String id = (String)session.getAttribute("userid"); 
    String[][] question = (String[][])session.getAttribute("question");
    String[] answer = (String[])session.getAttribute("answer");
    int no_index = (Integer)session.getAttribute("no_index");
    int timeses = (Integer)session.getAttribute("timeses");
%>
<html>
    
    <head>
        <link href="css_exam.css" rel="stylesheet" type="text/css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exam</title>
    </head>
    <body>
        
        <script >
        <!--
        <%
            int clock = timeses;
        %>
            var timeout = <%=clock%>
            var stopwatch = 1200-timeout;
            var timeStrb = " ";
            
            function timer(){
                if ( --timeout > 0){
                stopwatch++;
                UpdateTimer();
                UpdateTimer2();
                getTimeData();
                window.setTimeout("timer()",1000);
                
                }
                else{
                    document.forma.clock.value = "Time over";
                    document.e2.submit();
                }
                
                }
             
                
                function UpdateTimer() {
                var Seconds = timeout;

                var Days = Math.floor(Seconds / 86400);
                Seconds -= Days * 86400;

                var Hours = Math.floor(Seconds / 3600);
                Seconds -= Hours * (3600);

                var Minutes = Math.floor(Seconds / 60);
                Seconds -= Minutes * (60);


                var TimeStr = "Time remaining : "+((Days > 0) ? Days + " days " : "") + LeadingZero(Hours) + ":" + LeadingZero(Minutes) + ":" + LeadingZero(Seconds);
                document.forma.clock.value = TimeStr;
                }
                
                function UpdateTimer2() {
                var Seconds = stopwatch;

                var Days = Math.floor(Seconds / 86400);
                Seconds -= Days * 86400;

                var Hours = Math.floor(Seconds / 3600);
                Seconds -= Hours * (3600);

                var Minutes = Math.floor(Seconds / 60);
                Seconds -= Minutes * (60);


                timeStrb = ((Days > 0) ? Days + " days " : "") + LeadingZero(Hours) + ":" + LeadingZero(Minutes) + ":" + LeadingZero(Seconds);
                document.forma.clock2.value = timeStrb;
                }
                
                function LeadingZero(Time) {

                return (Time < 10) ? "0" + Time : + Time;

                }
                
                function getTimeData(){
                    document.e2.timerem.value = timeout;
                    document.e2.timestr.value = timeStrb;
                }
            </script> 
        
        
        <div id="topdiv">
            <table border="0">
                <tr>
                    <td colspan="2">
                        <table border="0">
            <tr>
                <td height="25px" width="1350px"></td>
                <td width="150px"><a href="http://localhost:8084/jspProject/ShowCon?index=1&userid=<%=id%>" style="text-decoration:none;"><p class="a">Hi,  
                    <%=id%>
                    
                    </p></a></td>
                
            </tr>
                </table> 
                    </td>
                </tr>
                <tr>
                
                    <td height="130px" width="1300px">
                        <p class="title">
                          Examination 
                        </p>
                    </td>
                    <td width="200px" style="vertical-align: bottom; padding-bottom: 13px">
                        <form action="<%=request.getRequestURL()%>" name="forma">
                        <input type="text" name="clock" value="<%=clock%>" class="tmr">
                        <input type="hidden" name="clock2" value="<%=clock%>">
                    </form>
                    
                    </td>
                </tr>
                
            </table>
        </div>
        <table border="0">
            <tr>
                <td width="1500px" height="180px"></td>
            </tr>
            <tr>
                <td width="1500px" height="490px">
                    
                    <form name="e2" method="post" action="http://localhost:8084/jspProject/ExamCon?index=2">
                        <table border="0" >
                            <tr>
                                <td  height="420px " rowspan="3" class="quest2"><p class="quest"><%=(no_index+1)%>.</p></td>
                                <td  colspan="4" class="quest2"><p class="quest"><%=question[no_index][1]%></p></td>
                            </tr>
                            <tr>
                                <td class="quest2" style="padding-top:10px" width="25px"><input  <%if(answer[no_index].equals("A")) {%>checked<%}%> type="radio" name="ques<%=(no_index+1)%>" value="A"></td>
                                <td class="quest2" width="700px"><p class="quest"><%=question[no_index][2]%></p></td>
                                
                                <td class="quest2" style="padding-top:10px" width="25px"><input <%if(answer[no_index].equals("C")) {%>checked<%}%> type="radio" name="ques<%=(no_index+1)%>" value="C"></td>
                                <td class="quest2" width="700px"><p class="quest"><%=question[no_index][4]%></p></td>
                                  
                            </tr>
                            <tr>
                                <td class="quest2" style="padding-top:10px"><input <%if(answer[no_index].equals("B")) {%>checked<%}%> type="radio" name="ques<%=(no_index+1)%>" value="B"></td>
                                <td class="quest2"><p class="quest"><%=question[no_index][3]%></p></td>
                                <td class="quest2" style="padding-top:10px" width="25px"><input <%if(answer[no_index].equals("D")) {%>checked<%}%> type="radio" name="ques<%=(no_index+1)%>" value="D"></td>
                                <td class="quest2"><p class="quest"><%=question[no_index][5]%></p></td>
                            </tr>
                            
                            </table>
                            <table>
                            <tr>
                            <input type="hidden" name="oper" value="0">
                            <td colspan="5" height="40px" width="1350px"><center><input type="submit" value="" class="np" formaction="http://localhost:8084/jspProject/ExamCon?index=3&oper=-1" >&Tab;&Tab;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                                 <input type="submit" value="" class="nn" formaction="http://localhost:8084/jspProject/ExamCon?index=3&oper=1" ></center></td>
                            <td><input type="submit" value="Submit" class="button" formaction="http://localhost:8084/jspProject/ExamCon?index=2" >                                                    
                                
                        </tr>
                            
                            </table>
                            
                        
                            <input type="hidden" name="timerem" value="0">
                            <input type="hidden" name="timestr" value=" ">
                    </form>
                            <script>
                        <!--
                        timer();
                
                    </script>
                </td>
            </tr>
        </table>
        
           
        
    </body>
</html>
