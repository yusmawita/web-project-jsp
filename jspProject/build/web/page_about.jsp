<%-- 
    Document   : page_exam
    Created on : Jul 16, 2013, 3:37:48 AM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String id = (String)session.getAttribute("userid");  
%>
<html>
    
    <head>
        <link href="css_exam.css" rel="stylesheet" type="text/css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="keywords" content="about, WOW Slider, Joomla Slideshow, Wordpress Slideshow" />
	<meta name="description" content="about created with WOW Slider, a free wizard program that helps you easily generate beautiful web slideshow" />
	<!-- Start WOWSlider.com HEAD section -->
	<link rel="stylesheet" type="text/css" href="engine1/style.css" />
	<script type="text/javascript" src="engine1/jquery.js"></script>
	<!-- End WOWSlider.com HEAD section -->
        <title>About</title>
    </head>
    <body>
        <div id="topdiv">
            <table>
                <tr>
                    <td colspan="6">
                        <table border="0">
            <tr>
                <td height="25px" width="1400px"></td>
                <td width="150px"><a href="http://localhost:8084/jspProject/ShowCon?index=1&userid=<%=id%>" style="text-decoration:none;"><p class="a" style="margin-top: 0px">Hi,  
                    <%=id%>
                    
                    </p></a></td>
                <td width="260px"><p class="b">
                    <a href="page_contact.jsp" class="text">Contact</a>
                    <a href="page_about.jsp" class="text">About</a>
                    <a href="http://localhost:8084/jspProject/UserCon?index=100" class="text">Logout</a>
                    </p>
                </td>
                
            </tr>
                        </table> 
                    </td>
                
                <tr>
                    <td height="110px" width="110px"><a href="page_home.jsp" class="picture"><img class="button" src="picture/home_button.png"></a></td>
                    <td height="110px" width="110px"><a href="http://localhost:8084/jspProject/ShowCon?index=1&userid=<%=id%>" class="picture"><img class="button" src="picture/profile_button.png"></a></td>
                    <td height="110px" width="110px"><a href="page_index.jsp" class="picture"><img class="button" src="picture/index_button.png"></a></td>
                    <td height="110px" width="110px"><a href="http://localhost:8084/jspProject/ForumCon?index=1&index2=1" class="picture"><img class="button" src="picture/forum_button.png"></a></td>
                    <td  width="180px"><a href="page_exam.jsp" class="picture"><img class="button" src="picture/exam_button.png"></a></td>
                    <td width="2800"></td>
                </tr>
            </table>
        </div>
                    <div id="content">
                    <table border="0">
                        
                        <tr>
                            <td height="450px">
                                <!-- Start WOWSlider.com BODY section -->
	<div id="wowslider-container1">
	<div class="ws_images"><ul>
<li><img src="data1/images/a.jpg" alt="A" title="A" id="wows1_0"/></li>
<li><img src="data1/images/b.jpg" alt="B" title="B" id="wows1_1"/></li>
<li><img src="data1/images/c.jpg" alt="C" title="C" id="wows1_2"/></li>
</ul></div>
<div class="ws_bullets"><div>
<a href="#" title="A"><img src="data1/tooltips/a.jpg" alt="A"/>1</a>
<a href="#" title="B"><img src="data1/tooltips/b.jpg" alt="B"/>2</a>
<a href="#" title="C"><img src="data1/tooltips/c.jpg" alt="C"/>3</a>
</div></div>
<span class="wsl"><a href="http://wowslider.com">Javascript Slider</a> by WOWSlider.com v4.2</span>
	<div class="ws_shadow"></div>
	</div>
	<script type="text/javascript" src="engine1/wowslider.js"></script>
	<script type="text/javascript" src="engine1/script.js"></script>
	<!-- End WOWSlider.com BODY section -->
                            </td>
                        </tr>
                    </table>
                    </div>
        
           
        
    </body>
</html>
