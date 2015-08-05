<%-- 
    Document   : page_profile
    Created on : Jul 15, 2013, 7:59:03 PM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@page import="Entity.member"%>
<%
    String id = (String)session.getAttribute("userid");
    member Member = new member();
    Member = (member)request.getAttribute("dataMember");
    String fullname = Member.getName();
    String gender = Member.getGender();
    String location = Member.getLocation();
    String email = Member.getEmail();
    String bio = Member.getBio();
    String path = Member.getPhoto();
    session.removeAttribute("id_pic");
    String[][] resultList = (String[][])session.getAttribute("resultList");
    
%>
<html>
    
    <head>
        <link href="css_profile.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
    </head>
    <body>
        <table border="0">
            <tr>
                <td height="20px" width="1000px"></td>
                <td width="200px"><a href="http://localhost:8084/jspProject/ShowCon?index=1&userid=<%=id%>" style="text-decoration:none"><p class="a">Hi,  
                    <%=id%></p></a></td>
                <td width="300px"><p class="b">
                    <a href="page_contact.jsp" class="text">Contact</a>
                    <a href="page_about.jsp" class="text">About</a>
                    <a href="http://localhost:8084/jspProject/UserCon?index=100" class="text">Logout</a>
                    </p>
                </td>
            </tr>
        </table>
        <table border="0">
            <tr>
                <td width="1500px" height="600px">
                    
                    <table border="0">
                        <tr>
                            <td height="140px" colspan="2">
                                <table border="0">
                                    <tr>
                                        <td height="135px" width="180px" ></td>
                                        <td  width="180px"></td>
                                        <td  width="180px"></td>
                                        <td  width="180px"></td>
                                        <td  width="180px"><a href="page_home.jsp" class="picture"><img class="button" src="picture/home_button.png"></a></td>
                                        <td  width="180px"><a href="page_index.jsp" class="picture"><img class="button" src="picture/index_button.png"></a></td>
                                        <td  width="180px"><a href="http://localhost:8084/jspProject/ForumCon?index=1&index2=1" class="picture"><img class="button" src="picture/forum_button.png"></a></td>
                                        <td  width="180px"><a href="page_exam.jsp" class="picture"><img class="button" src="picture/exam_button.png"></a></td>
                                    </tr>
                                </table>
                                
                            </td>
                            
                        </tr>
                        <tr>
                            <td height="95px" style="vertical-align: top; text-align:right; padding-right:20px; padding-top: 5px; padding-bottom: 0px" colspan="2">
                                <a href="http://localhost:8084/jspProject/ShowCon?index=2&userid=<%=id%>&path=<%=path%>" ><input type="button" class="button" value="Edit Profile"></a>
                            </td>
                            
                        </tr>
                        <tr>
                            <td height="290px" >
                             
                                <table border="0">
                                    <tr>
                                        <td height="280px" rowspan="5" width="25px"></td>
                                        <td height="280px" rowspan="5" width="250px">
                                            <img src="pictureBase/<%=path%>" class="pict">    
                                         
                                        </td>
                                        <td height="52px" rowspan="5" width="15px"></td>
                                        <td height="52px" width="120px"><p class="a">User ID</p></td>
                                        <td width="10px"><p class="a">:</p></td>
                                        <td width="220px"><p class="a"><%=id%></p></td>
                                        
                                    </tr>
                                    <tr>
                                        <td height="52px"><p class="a">Name</p></td>
                                        <td width="10px"><p class="a">:</p></td>
                                        <td width="220px"><p class="a"><%=fullname%></p></td>
                                    </tr>
                                    <tr>
                                        <td height="52px"><p class="a">Gender</p></td>
                                        <td width="10px"><p class="a">:</p></td>
                                        <td width="220px"><p class="a"><%=gender%></p></td>
                                    </tr>
                                    <tr>
                                        <td height="52px"><p class="a">Location</p></td>
                                        <td width="10px"><p class="a">:</p></td>
                                        <td width="220px"><p class="a"><%=location%></p></td>
                                    </tr>
                                    <tr>
                                        <td height="52px"><p class="a">Email</p></td>
                                        <td width="10px"><p class="a">:</p></td>
                                        <td width="220px"><p class="a"><%=email%></p></td>
                                    </tr>
                                    
                                </table>
                            </td>
                            <td width="500px" rowspan="2" style="vertical-align: top">
                        <center>
                                <table border="0" ">
                                    <tr style="padding-bottom: 5px">
                                        <td><center><p class="a" style="font-size: 30px">Exam Data :</p></center></td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <table border="1" style="border-spacing: 0px; border-radius: 10px">
                                                <tr>
                                                    <td height="50px" width="100px" style="border-left-width: 0px; border-top-width: 0px"><center><p class="a" style="font-family: Raavi">Chapter</p></center></td>
                                                    <td width="50px"><center><p class="a" style="font-family: Raavi">Score</p></center></td>
                                                    <td width="100px"><center><p class="a" style="font-family: Raavi">Taken Date</p></center></td>
                                                    <td width="100px"><center><p class="a" style="font-family: Raavi">Time Used</p></center></td>
                                                    <td width="100px" style="border-right-width: 0px; border-top-width: 0px"><center><p class="a" style="font-family: Raavi">Total Taken</p></center></td>
                                                </tr>
                                                <%for (int i = 0; i < 6; i ++) {%>
                                                <tr>
                                                    <td height="35px"><center><p class="a">Chapter <%=(i+1)%></p></center></td>
                                                    <td><center><p class="a"><%=resultList[i][0]%></p></center></td>
                                                    <td><center><p class="a" style="font-size: 12px"><%=resultList[i][1]%></p></center></td>
                                                    <td><center><p class="a"><%=resultList[i][2]%></p></center></td>
                                                    <td><center><p class="a"><%=resultList[i][3]%></p></center></td>
                                                </tr>
                                                        
                                                 <%}%>
                                            </table>
                                        </td>
                                    </tr>
                                </table>
                        </center>    
                        </td>
                        </tr>
                        <tr>
                            <td height="80px">
                                <table border="0">
                                <tr>
                                        <td height="20px" rowspan="2" width="30px"></td>
                                        <td height="20px" width="120px"><p class="a">Bio :</p></td>
                                                                               
                                </tr>
                                <tr>
                                       <td width="220px" height="20px"><p class="a"><%=bio%></p></td>
                                </tr>
                                    
                               </table>
                                
                            </td>
                            
                        </tr>
                    </table>
                        
                    
                    
                </td>
                </tr>
            
            
        </table>
    </body>
</html>
