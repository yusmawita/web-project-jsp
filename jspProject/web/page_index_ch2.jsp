<%-- 
    Document   : page_index_ch1
    Created on : Jul 16, 2013, 1:27:28 AM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String id = (String)session.getAttribute("userid");
    String[] status = (String[])session.getAttribute("resultStatus");
    String message2="";
    if(status[1]!=null){
    message2 = status[1];
    }
%>
<html>
    
    <head>
        <link href="css_index.css" rel="stylesheet" type="text/css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chapter 2</title>
    </head>
    <body class="chapter">
        
    <script type="text/javascript">

function changeContent(y){
  
  switch(y){
      
      case 1: document.getElementById("ch1_tit").innerHTML="Informal Table Setting";
              document.getElementById("ch1_con").innerHTML="<table><tr><td><img src=picture/chapter/chapter2_informaltable.jpg></td>\n\
              <td><ul>\n\
                <li><b>Forks</b>, Both forks are placed on the left of the plate.<br> The fork furthest from the plate is for salad.<br>\n\
                <li><b>Dinner Plate</b>, The dinner plate is placed on the table <br>when the main course is served.<br>\n\
                <li><b>Salad Plate</b>, The salad plate is placed to the left of the forks.\n\
                <li><b>Spoon</b>, The soup spoon is on the far right of the outside knife.\n\
                <li><b>Napkin</b>, Place the napkin in the place setting's center, or left of the last fork.\n\
                </ul></td></tr></table>";
                                       
      
      break;
      case 2: document.getElementById("ch1_tit").innerHTML="Formal Table Setting";
              document.getElementById("ch1_con").innerHTML="<center><img src=picture/chapter/chapter2_formaltable.jpg></center>";

      break;
      case 3: document.getElementById("ch1_tit").innerHTML="Cups";
              document.getElementById("ch1_con").innerHTML="The cup is made in seven sizes, each with a different volume capacity :<br><ul>\n\
                <li>Breakfast cup.<br>\n\
                <li>Mug.<br>\n\
                <li>Teacup.\n\
                <li>Coffee cup.\n\
                <li>Chocolate cup.\n\
                <li>After-dinner coffee cup.\n\
                <li>Demitasse cup.\n\
                </ul>";
      
      break;
      case 4: document.getElementById("ch1_tit").innerHTML="Serveware";
              document.getElementById("ch1_con").innerHTML="Serveware comes from the Latin servire, to serve, and the Anglo-Saxon waru, meaning special merchandise.<br>\n\
                It is an inclusive term for bowls, beverage pots, compotes, nut bowls, platters, salt cellars and salt shakers,<br>\n\
                 pepper shakers and pepper mills, salvers, sauceboats and gravy boats, trays, and tureens.\n\
                <br><br>A basic set of serveware include the following :<br><ul>\n\
                <li>A large oval platter to serve a roast.<br>\n\
                <li>A small oval platter to serve chops or fish.<br>\n\
                <li>A small bowl for cold sauce, dips, nuts, and candy.\n\
                <li>A sauceboat to serve gravy and hot sauces.\n\
                <li>A medium-size pitcher for syrup, gravy, sauce, or honey.\n\
                <li>A large pitcher to serve water, iced tea, and other beveragesA beverage pot for coffee, tea or hot chocolate.\n\
                </ul>";
      
      break;
      case 5: document.getElementById("ch1_tit").innerHTML="Napkins";
              document.getElementById("ch1_con").innerHTML="The Spartans were the first to use napkins. They wiped their hands with a lump of dough called apomagdalie.<br>\n\
                This practice later evolved with dinners using a sliced bread napkin to wipe their hands. Thankfully, in the US today, a cloth napkin is used.<br>\n\
                It is normally found to the left of the place setting. Europeans generally place napkins to the right of the spoon.<br><br>\n\
                The basic function of the napkin is to wipe your fingers and blot your mouth :<br><ul>\n\
                <li>After sitting, unfold your napkin and place it in your lap after the host or hostess has placed his or her napkin in their lap.<br>\n\
                <li>Small napkins are used an informal meals. They are completely unfolded.<br>\n\
                <li>Use the napkin to blot your lips as needed and before taking a drink.\n\
                <li>Place your napkin in your chair if leaving the table during the meal.\n\
                <li>When the meal is completed, the napkin is folded loosely and placed to the left of your plate.\n\
                </ul>";
      
      break;
      case 6: document.getElementById("ch1_tit").innerHTML="Mini Games";
              document.getElementById("ch1_con").innerHTML="\n\
                    <param name=allowScriptAccess value=sameDomain/>\n\
                    <param name=movie value=picture/game.swf/>\n\
                                <param name=wmode value=transparent/>\n\
                                <param name=quality value=high />\n\
                                <embed src=picture/game.swf quality=high name=clock height=400px width=800px align=middle allowScriptAccess=sameDomain type=application/x-shockwave-flash pluginspage=http://www.macromedia.com/go/getflashplayer wmode=transparent/>";
      
      break;
  }
}
</script>    
        
        
        
     <table border="0">
            <tr>
                <td height="25px" width="1000px"></td>
                <td width="200px"><a href="http://localhost:8084/jspProject/ShowCon?index=1&userid=<%=id%>" style="text-decoration:none"><p class="a">Hi,  
                    <%=id%>
                    
                    </p></a></td>
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
                <td width="1500px" height="640px">
                    <table border="0">
                        <tr>
                            <td width="1500px" height="130px">
                                <table border="0">
                                    <tr>
                                        
                                        <td height="130px" width="150px"><a href="page_home.jsp" class="picture"><img class="button" src="picture/home_button.png"></a></td>
                                        <td height="130px" colspan="4" width="650px">
                                            <p class="chap_banner">
                                                Table Setting
                                            </p>
                                        </td>
                                        
                                        <td height="130px" width="320px">
                                        <%if(message2.equals("Passed")){%>
                                        <img src="picture/passed.png" style="width:150px; height:75px; margin-right: 0px" >
                                        <%}else if(message2.equals("Failed")){%>
                                        <img src="picture/failed.png" style="width:150px; height:75px; margin-right: 0px" >
                                        <%}%>     
                                        </td>
                                        <td height="130px" width="180px"></td>
                                        <td height="130px" width="180px"></td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td height="400px">
                                <table border="0">
                                    <tr>
                                        <td height="0px"></td>
                                        <td rowspan="8" width="360px">
                                            <table border="0">
                                                <tr>
                                                    <td height="50px" width="360px"><a href="page_index.jsp" class="picture"><center><img class="chap_button" src="picture/index_button.png"></center></a></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter2_1.png" onmouseover="changeContent(1);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter2_2.png"  onmouseover="changeContent(2);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter2_3.png" onmouseover="changeContent(3);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter2_4.png" onmouseover="changeContent(4);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter2_5.png" onmouseover="changeContent(5);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter2_6.png" onmouseover="changeContent(6);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="35px"><center><a href="http://localhost:8084/jspProject/ExamCon?index=1&chapter=ch2"><input type="button" class="button" value="Examination"></a></center></td>
                                                </tr>
                                            </table>
                                            
                                        </td>
                                    </tr>
                                    <tr>
                                        <td height="460px" width="1000px">
                                            <table border="0">
                                                <tr>
                                                    <td width="995px" height="40px">
                                                        <p class="chap_tit" id="ch1_tit">
                                                         Cups
                                                        </p>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td width="980px" height="400px">
                                                        <p class="chap_con" id="ch1_con">
                                                       The cup is made in seven sizes, each with a different volume capacity : <br>
                                                       <br>Breakfast cup.<br>
                                                       <br>Mug.<br>
                                                       <br>Teacup.<br>
                                                       <br>Coffee cup.<br>
                                                       <br>Chocolate cup.<br>
                                                       <br>After-dinner coffee cup.<br>
                                                       <br>Demitasse cup.
                
                                                        </p>
                                                    </td>
                                                </tr>
                                            </table>
                                            
                                            
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
