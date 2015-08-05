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
    if(status[5]!=null){
    message2 = status[5];
    }
%>
<html>
    
    <head>
        <link href="css_index.css" rel="stylesheet" type="text/css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chapter 6</title>
    </head>
    <body class="chapter">
        
    <script type="text/javascript">

function changeContent(y){
  
  switch(y){
      
      case 1: document.getElementById("ch1_tit").innerHTML="England";
              document.getElementById("ch1_con").innerHTML="Dining etiquette for utensils. The English do not switch knives and forks. The knife remains in the right hand,<br>\n\
              and the fork remains in the left. When the meal is finished, the knife and fork are laid<br>\n\
              parallel to each other across the right side of the plate. The fork is often held tines down,<br>\n\
              so that food is scooped up onto the backside of the fork; o this after much practice,<br>\n\
              or with foods that can stick to the back of the fork (like mashed potatoes and peas). Dining etiquette the place setting.<br>\n\
              The knife above the plate is used for butter; otherwise, always start from the outside<br>\n\
              and work your way in, course by course. Dining etiquette for hands.<br>\n\
              Hands are kept in your lap at the dinner table. Dining etiquette for passing food.<br>\n\
              At the table, pass all dishes to your left.<br><br>\n\
              Dining etiquette for seating. The most honored position is at the head of the table, with individuals of<br>\n\
              greatest importance seated first to the left and then the right of the head of the table; if there is a hosting couple,<br>\n\
              one will be at one end of the table, the other at the opposite end.";
                                       
      
      break;
      case 2: document.getElementById("ch1_tit").innerHTML="Indonesia";
              document.getElementById("ch1_con").innerHTML="Dining etiquette for utensils. In Indonesia, spoons and forks are used (never knives), or no utensils at all<br>\n\
              (mainly in more traditional Muslim restaurants). If you need to cut things, use the side of your spoon first,<br>\n\
              then move on to the fork, if necessary (most foods already come precut). <br>\n\
              Since the spoon is more important than the fork, if you are right-handed,<br>\n\
              keep the spoon in your right hand and put it down to switch to the fork if you need it.<br>\n\
              Dining etiquette for using your hands. Wash your hands before and after you eat. Use your right hand <br>\n\
              when picking up and eating food, never your left hand, Keep your left hand at your side.<br>\n\
              Do not place your left hand on the table, and do not pass food with your left hand. When eating banana-leaf food,<br>\n\
              reach into the rice, take some with your fingers, gently roll it between your index and middle fingers<br>\n\
              and thumb into a self-sticking ball, dip it into the sauce, and mix it with a vegetable or a piece of chicken, then pop the whole thing in your mouth.<br><br>\n\
              Dining etiquette for paying the bill. Usually the one who does the inviting pays the bill.";

      break;
      case 3: document.getElementById("ch1_tit").innerHTML="China";
              document.getElementById("ch1_con").innerHTML="Dining etiquette for chopsticks. China is one of the traditional chopstick cultures, along with Japan and Korea.<br>\n\
              There is one major difference, though; Chinese chopsticks are usually round, as opposed to<br>\n\
              the more square-sided Japanese kind, and do not come attached.<br><br>\n\
              Sauce may be mixed with the rice, and the main dish may be eaten with the rice. You are expected to hold the rice bowl by your mouth, take a bit of food and sauce from the plate below, hold it over the rice bowl, and shovel it all in together. If you're eating noodles or broth, it is not appropriate to slurp the food; however, hot tea may be slurped quietly to cool it off as it enters the mouth.<br><br>\n\
              Dining etiquette for toothpicks. Handle a toothpick by working it away at your teeth with one hand, while keeping the other hand in front of it over the mouth.";
      
      break;
      case 4: document.getElementById("ch1_tit").innerHTML="Brazil";
              document.getElementById("ch1_con").innerHTML="Dining etiquette for utensils. Brazilians do not switch knives and forks as they eat.\n\
                The knife remains in the right hand, and the fork remains in the left. When the meal is finished, the knife and fork are laid parallel\n\
                to each other horizontally across the center of the plate-make sure they do not cross each other.<br><br>\n\
                Dining etiquette for the place setting. The fork and spoon above your plate are for dessert. Always start from the outside and work your way in,\\n\
                course by course. There will be separate glasses provided at your setting for water and white and red wine or beer (after-dinner drink glasses come out after dinner).<br><br>\n\
                Dining etiquette for restaurants. In informal restaurants, you may be required to share a table. Waitstaff may be summoned by making eye contact.<br><br>\n\
                ";
      
      break;
      case 5: document.getElementById("ch1_tit").innerHTML="Egypt";
              document.getElementById("ch1_con").innerHTML="Dining etiquette for eating with Muslims. Islam prohibits eating pork. Meat must be prepared halal.\n\
                Do not eat in front of your Muslim colleagues, or invite them to join you for a meal, during the day during Ramadan.<br><br>\n\
                Dining etiquette for drinking. Always accept the cup of tea and/or coffee. Never pour your own drink. Be alert throughout\n\
                the meal as to whether or not your neighbor's cup or glass needs refilling. If it is less than half full, it needs refilling.\n\
                If your glass is less than half full, your neighbor or host is obliged to refill it. If he or she does not, do not refill it yourself.\n\
                Indicate your need by pouring a little more drink into your neighbor's glass, even if it doesn't really need it.<br><br>\n\
                Dining etiquette for guests. Do not fill your plate full at first. It is better to return for more.";
      
      break;
      case 6: document.getElementById("ch1_tit").innerHTML="Saudi Arabian";
              document.getElementById("ch1_con").innerHTML="Dining etiquette for utensils. Throughout the region, people use spoons, forks, and knives,\n\
                if necessary, or no utensils at all. Since the spoon is more important than the fork, if you are right-handed, keep the spoon in the right hand,\n\
                and put it down to switch to the fork if and when you need it. Never use your left hand for eating, especially if you are eating directly with your hands.<br><br>\n\
                Dining etiquette for using your hands. Wash your hands before you sit down to eat. Many restaurants have washrooms and sinks out in the open specifically for this purpose.\n\
                You will also need to wash your hands again at the end of the meal. Use your right hand when picking up and eating food: never your left hand. Keep your left hand at your side.\n\
                Do not place your left hand on the table, and do not pass food with your left hand.<br><br>\n\
                Alcohol will usually not be served with the meal.<br><br>\n\
                If men and women are dining together, women should not directly touch food that is being served to a Muslim male, other than those who are her immediate relatives.<";
      
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
                                            <p class="chap_banner" style="font-size:60px">
                                                International Dining
                                            </p>
                                        </td>
                                        
                                        <td height="130px" width="300px">
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
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter6_1.png" onmouseover="changeContent(1);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter6_2.png"  onmouseover="changeContent(2);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter6_3.png" onmouseover="changeContent(3);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter6_4.png" onmouseover="changeContent(4);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter6_5.png" onmouseover="changeContent(5);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter6_6.png" onmouseover="changeContent(6);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="35px"><center><a href="http://localhost:8084/jspProject/ExamCon?index=1&chapter=ch6"><input type="button" class="button" value="Examination"></a></center></td>
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
                                                         England
                                                        </p>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td width="980px" height="400px">
                                                        <p class="chap_con" id="ch1_con">
                                                         Dining etiquette for utensils. The English do not switch knives and forks. The knife remains in the right hand,<br>
              and the fork remains in the left. When the meal is finished, the knife and fork are laid<br>
              parallel to each other across the right side of the plate. The fork is often held tines down,<br>
              so that food is scooped up onto the backside of the fork; o this after much practice,<br>
              or with foods that can stick to the back of the fork (like mashed potatoes and peas). Dining etiquette the place setting.<br>
              The knife above the plate is used for butter; otherwise, always start from the outside<br>
              and work your way in, course by course. Dining etiquette for hands.<br>
              Hands are kept in your lap at the dinner table. Dining etiquette for passing food.<br>
              At the table, pass all dishes to your left.<br><br>
              Dining etiquette for seating. The most honored position is at the head of the table, with individuals of<br>
              greatest importance seated first to the left and then the right of the head of the table; if there is a hosting couple,<br>
              one will be at one end of the table, the other at the opposite end.

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
