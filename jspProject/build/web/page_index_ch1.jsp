<%-- 
    Document   : page_index_ch1
    Created on : Jul 16, 2013, 1:27:28 AM
    Author     : Jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.swing.JOptionPane" %>
<!DOCTYPE html>
<%
    String id = (String)session.getAttribute("userid");
    String[] status = (String[])session.getAttribute("resultStatus");
    String message2="";
    if(status[0]!=null){
    message2 = status[0];
    }
    
%>
<html>
    
    <head>
        <link href="css_index.css" rel="stylesheet" type="text/css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chapter 1</title>
    </head>
    <body class="chapter">
        
    <script type="text/javascript">

function changeContent(y){
  
  switch(y){
      
      case 1: document.getElementById("ch1_tit").innerHTML="Handling Utensils";
              document.getElementById("ch1_con").innerHTML="In most situations,<br> following the outside-in rule will tell you which knife, fork, or spoon to use at the dinner table.\n\
                 <br><br><b>American Style</b><br>\n\
                  Hold your fork like a pencil, with the shank extended between your thumb and index and middle fingers.<br>\n\
                  Your fourth and fifth fingers rest in your hand.\n\
                   <br>For leverage, the index finger is extended along the back of the fork, as far from the tines as possible.\n\
                   <br><img src="+'"picture/chapter/chapter1_1a.png"'+"><br>\n\
                   Hold the knife with the handle cupped in the palm of your left hand, along with your third, fourth, and fifth fingers.<br>\n\
                   Place your second finger on the back of the blade. Hold your thumb against the side of the handle.";
                                       
      
      break;
      case 2: document.getElementById("ch1_tit").innerHTML="Napkin Etiquette";
              document.getElementById("ch1_con").innerHTML="Placing the Napkin in Your Lap.<br>Wait for the host or hostess to take his or her napkin off the table and place it in his or her lap.<br>(An exception to this rule is buffet-style meals, where you should\n\
 unfold your napkin when you start eating)<br><br>Unfolding the Napkin.<br>Unfold your napkin in one smooth motion without snapping or shaking it open.<br><br>\n\
Tucking the Napkin.<br>Don't tuck a napkin into your collar, between the buttons of your shirt, or in your belt.\n\
<br><br>Using the Napkin.<br>Use your napkin frequently during the meal to blot or pat, not wipe, your lips.<br>Blot your lips before taking a drink of your beverage-especially if you're a woman wearing lipstick";

      break;
      case 3: document.getElementById("ch1_tit").innerHTML="Passing Food";
              document.getElementById("ch1_con").innerHTML="<ul>\n\
                <li>Food should be passed to the right - but the point is for the food to be moving in only one direction.<br>\n\
                <li>One diner either holds the dish as the next diner takes some food,<br> or he hands it to the person, who then serves herself.<br>\n\
                <li>Any heavy or awkward dishes are put on the table with each pass.\n\
                <li>Cream pitchers and other dishes with handles should be passed with<br>the handle toward the person receiving them.\n\
                <li>If a platter for sharing is present it is passed around the table,<br>with each diner holding it as the person next to him serves himself,using only the serving utensils provided.\n\
                </ul>";
      
      break;
      case 4: document.getElementById("ch1_tit").innerHTML="Salt and Pepper Etiquette";
              document.getElementById("ch1_con").innerHTML="<b>Taste Before Salting</b><br> Be sure to taste the food before putting salt or pepper on it.\n\
                <br><b>Pass Salt and Pepper Together</b><br>Always pass salt and pepper together. If a person asks for just one, pass both anyway.\n\
                <br><b>Saltcellars</b><br>Some hostesses prefer to use saltcellars, which salt shakers have largely replaced.\n\
                <ul>\n\
                <li>If there is no spoon in the saltcellar, use the tip of a clean knife to take some salt.\n\
                <li>If the salt­cellar is for you alone, you may either use the tip of your knife or you may take a pinch with your fingers.\n\
                <li>If it is to be shared with others, never use your fingers or a knife that is not clean.\n\
                <li>Salt you have taken from the cellar should be put on the bread-and-butter plate<br>or on the rim of whatever plate is before you.\n\
                </ul>";
      
      break;
      case 5: document.getElementById("ch1_tit").innerHTML="Bread and Butter Etiquette";
              document.getElementById("ch1_con").innerHTML="Bread is most often placed on the table in a basket that everyone shares.\n\
<br><br><ul>\n\
                <li>Don't butter the whole piece of bread and then take bites from it.\n\
                <li>Don't hold your bread in one hand and a drink in the other.\n\
                <li>Don't take the last piece of bread without first offering it to others. \n\
                </ul>\n\
<br><br>In some restaurants, olive oil is served with bread. Dip your bite-sized pieces of bread in the oil and eat.\n\
<br><br>Because butter is produced in rectangle form, and the butter knife is made with<br>a dull blade to slice butter and a pointed tip to transfer cubes of butter to the plate.\n\
";
      
      break;
      case 6: document.getElementById("ch1_tit").innerHTML="Serving Etiquette";
              document.getElementById("ch1_con").innerHTML="<b>Formal Meals</b>\n\
                <br><ul>\n\
                <li>Food is brought to each diner at the table.\n\
                <li>The server presents the platter or bowl on the diner's left.\n\
                </ul>\n\
                <br><b>Casual Meals</b>\n\
                <br><ul>\n\
                <li>the host will dish food onto guests' plates to pass around the table.\n\
                <li>the diners help themselves to the food and pass it to others as necessary.\n\
                </ul>\n\
                <br><b>Using Serving Utensils</b>\n\
                <br><ul>\n\
                <li>Serving utensils are placed on the right side of serveware.\n\
                </ul>";
      
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
                                                Table Manner
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
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter1_1.png" onmouseover="changeContent(1);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter1_2.png"  onmouseover="changeContent(2);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter1_3.png" onmouseover="changeContent(3);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter1_4.png" onmouseover="changeContent(4);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter1_5.png" onmouseover="changeContent(5);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter1_6.png" onmouseover="changeContent(6);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="35px"><center><a href="http://localhost:8084/jspProject/ExamCon?index=1&chapter=ch1"><input type="button" class="button" value="Examination"></a></center></td>
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
                                                         Handling Utensils
                                                        </p>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td width="980px" height="400px">
                                                        <p class="chap_con" id="ch1_con">
                                                         In most situations,<br> following the outside-in rule will tell you which knife, fork, or spoon to use at the dinner table.<br>
                                                
                                                <br><b>American Style</b><br> 
                                               
                                                Hold your fork like a pencil, with the shank extended between your thumb and index and middle fingers.<br>
                                                Your fourth and fifth fingers rest in your hand.
                                                <br>For leverage, the index finger is extended along the back of the fork, as far from the tines as possible.
                                                <br><img src="picture/chapter/chapter1_1a.png"><br>
                                                Hold the knife with the handle cupped in the palm of your left hand, along with your third, fourth, and fifth fingers.<br>
                                                Place your second finger on the back of the blade. Hold your thumb against the side of the handle.
                                                

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
