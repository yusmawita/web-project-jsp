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
    String id_pic = (String)session.getAttribute("id_pic");
    member Member = new member();
    Member = (member)request.getAttribute("dataMember");
    String fullname = Member.getName();
    String gender = Member.getGender();
    String location = Member.getLocation();
    String email = Member.getEmail();
    String bio = Member.getBio();
    String path = Member.getPhoto();
    
%>
<html>
    
    <head>
        <link href="css_profile.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile</title>
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
                            <td height="140px">
                                <table border="0">
                                    <tr>
                                        <td height="135px" width="180px"></td>
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
                            <td height="95px" style="vertical-align: top; text-align:right; padding-right:20px; padding-top: 5px; padding-bottom: 0px">
                                <input type="button" class="button" onclick="editprofile.submit();" value="Done">
                            </td>
                            
                        </tr>
                        <tr>
                            <td height="380px">
                             
                                <table border="0">
                                    <tr>
                                        <td   height="375px" width="25px"></td>
                                        <td   width="250px">
                                            <table border="0">
                                                <tr>
                                                    <td>
                                                        <img style="vertical-align: top ; padding-top: 0px;"src="pictureBase/<%if(id_pic==null){%><%=path%><%} else{%><%=id_pic%><%}%>" class="pictb">
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <form name="upload" action="upload.jsp" method="post" enctype="multipart/form-data">
                                                            <input type="file" name="aa" class="bd" onchange="upload.submit();">
                                                        </form>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td height="55px">
                                                        
                                                    </td>
                                                </tr>
                                            </table>
                                                
                                         
                                   </td>
                                        <td height="52px"  width="15px"></td>
                                        <td>
                                            <form name="editprofile" action="http://localhost:8084/jspProject/EditCon" method="POST">
                                            
                                            <table border="0">
                                                <tr>
                                                  <td height="52px" width="120px"><p class="a">User ID</p></td>
                                        <td width="10px"><p class="a">:</p></td>
                                        <td width="220px"><input required type="text" class="edi" value="<%=id%>" name="userid"></td>  
                                                </tr>
                                                <tr>
                                        <td height="52px"><p class="a">Name</p></td>
                                        <td width="10px"><p class="a">:</p></td>
                                        <td width="220px"><input required type="text" class="edi" value="<%=fullname%>" name="fullname"></td>
                                    </tr>
                                    <tr>
                                        <td height="52px"><p class="a">Gender</p></td>
                                        <td width="10px"><p class="a">:</p></td>
                                        <td width="220px"><select name="gender"><option value="Male">Male<option value="Female">Female</select></td>
                                    </tr>
                                    <tr>
                                        <td height="52px"><p class="a">Location</p></td>
                                        <td width="10px"><p class="a">:</p></td>
                                        <td width="220px"><input required type="text" class="edi" value="<%=location%>" name="location"></td>
                                    </tr>
                                    <tr>
                                        <td height="52px"><p class="a">Email</p></td>
                                        <td width="10px"><p class="a">:</p></td>
                                        <td width="220px"><input type="email" class="edi" value="<%=email%>" name="email"></td>
                                    </tr>
                                    <tr>
                                        <td colspan="3" width="15px">
                                            
                                        </td>
                                    </tr>
                                    <tr>
                                        <td height="20px" width="120px" ><p class="a">Bio</p></td>
                                        <td width="10px"><p class="a">:</p></td>
                                        <td width="220px" height="20px"><textarea name="bio"><%=bio%></textarea></td>
                                </tr>
                                            
                                            </table>
                                           <input type="hidden" name="index2" value="2">
                                           <input type="hidden" name="path" value="<%=path%>">
                                            </form>
                                        </td>
                                        
                                        
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
