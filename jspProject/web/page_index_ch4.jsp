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
    if(status[3]!=null){
    message2 = status[3];
    }
%>
<html>
    
    <head>
        <link href="css_index.css" rel="stylesheet" type="text/css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chapter 4</title>
    </head>
    <body class="chapter">
        
    <script type="text/javascript">

function changeContent(y){
  
  switch(y){
      
      case 1: document.getElementById("ch1_tit").innerHTML="Eating at The Office";
              document.getElementById("ch1_con").innerHTML="<b>Mess/Clutter.</b> Don't let your workspace look like the buffet line at an all-you-can-eat restaurant. Keep it clean.<br>\n\
              If you eat at your desk, keep some Clorex wipes near by and wipe it down afterwards.<br><br>\n\
              <b>Smell.</b>Don't eat pungent foods at work. There most likely won't be a window to open the air things out.<br><br>\n\
              <b>Location.</b> Eat in the break room or an outdoor space if available (avoid eating at your desk if possible).<br><br>\n\
              <b>Eat before you are on the clock.</b> Many workers think the first 30 minutes of the workday is meant for them to grab a cup of coffee and snack to eat at their desk.<br><br>\n\
              <b>Timing.</b> If eating at your cubicle, do so when most other employees are absent and out on their own meal <br> break: 11:30 a.m. to 12:15 p.m., 5 p.m. to 5:40 p.m., or 10:45 to 11:12 p.m.<br><br>\n\
              <b>Noise.</b> Don't loudly smack your lips or burp. In a cubicle, even chewing food can disturb coworkers.";
                                             
      break;
      case 2: document.getElementById("ch1_tit").innerHTML="Business Meal Etiquette";
              document.getElementById("ch1_con").innerHTML="<ul>\n\
              <li><b>Invite well in advance</b>, You or your assistant should arrange any business meal at least a week in advance.\n\
              <li><b>Choose a restaurant you know</b>,If possible, pick one restaurant and frequent it.\n\
              <li><b>Local custom will generally dictate the time of the lunch</b>,  In large cities, lunches might be planned at 1 P.M.\n\
              <li><b>Make it clear that you are the host.</b>\n\
              <li><b>Tell your guest what to expect</b> to allow your guest to prepare and bring any pertinent materials.\n\
              <li><b>Confirm</b> the time and place and repeat the details of the invitation later in the conversation.\n\
              <li><b>Reserve a table ahead of time.</b> If you have a preference for seating (a spot that's quiet) tell the person taking the reservation.\n\
              <li><b>Reconfirm with your guest.</b> Call on the morning of a lunch or dinner; if you've scheduled breakfast, call the day before.</ul>";

      break;
      case 3: document.getElementById("ch1_tit").innerHTML="Interview Etiquette";
              document.getElementById("ch1_con").innerHTML="<b>Before the meal</b><br><ul>\n\
              <li>Confirm the location and time.\n\
              <li>Visit the restaurant before the interview\n\
              </ul><br><b>During the meal</b><ul>\n\
              <li>Focus on the interviewer\n\
              <li>Remain professional\n\
              </ul><br><b>Dining etiquette tips</b><ul>\n\
              <li>Don't order alcohol\n\
              <li>Do not change your order or send food back.</ul>";
      
      break;
      case 4: document.getElementById("ch1_tit").innerHTML="Corporate Events";
              document.getElementById("ch1_con").innerHTML="<b>Drinks and Hors D'Oeuvres</b><br>\n\
              At a business event with a formal dinner as its centerpiece, pre-dinner drinks and hors d'oeuvres will probably be served.<br>\n\
              Our recruiting event section discusses these dining etiquette topics in detail, the concepts are the same here.<br><br>\n\
              <b>Receiving Lines</b><br>\n\
              If your function has more than sixty (60) people, a receiving line will speed introductions.<br>\n\
              Guests may hold a drink while standing in the line, but should set their glasses down before they go through.<br>\n\
              There are usually servers with trays standing by to take glasses - if not, find a table to leave your glass.<br><br>\n\
              <b>Greeting The Host</b><br>\n\
              Find the host and thank him or her for the evening. If you are unable to thank the host personally, send a note the following day, <br>\n\
              thanking them and giving your regrets that you weren't able to thank him or her in person.";
      
      break;
      case 5: document.getElementById("ch1_tit").innerHTML="Business Entertaining";
              document.getElementById("ch1_con").innerHTML="<b>Dinner Party Planning</b><br>\n\
              The perfect dinner party won't happen on its own, it must be planned.<br>The first step is to determine what form of entertainment is appropriate.<br>\n\
              <br><b>Invitation Etiquette</b><br>\n\
              The situation will dictate how formal invitations should be. A phone call will do for inviting a client that<br>\n\
              is in town for a few days or local customers - although proper etiquette may require you to include spouses or partners.<br><br>\n\
              <b>Meeting and Greeting Etiquette</b><br>\n\
              Your spouse isn't expected to join you as you greet arriving guests at the door.<br>Instead, introduce him or her as soon as the opportunity arises.<br>\n\
              You (or your spouse or partner) should then take newly arrived guests around the room,<br>introducing them to anyone they haven't met.";
      
      break;
      case 6: document.getElementById("ch1_tit").innerHTML="Business Toasts";
              document.getElementById("ch1_con").innerHTML="\n\
              The host toasts first. Gain the crowd's attention by standing and raising your glass;<br>\n\
              banging on a glass with a knife should be considered a measure of last resort.<br><br>\n\
              At formal occasions, the toaster stands, as do the people toasting; the person being toasted remains seated.<br>\n\
              The guests respond by taking a sip of their drinks - but never emptying the glass.<br><br>\n\
              A person who doesn't drink alcohol should join in as well, toasting with a soft drink or even water.<br><br>\n\
              The person being toasted does not drink to himself.<br><br>\n\
              After the toast, the person who is being toasted rises and says thank you. He may also raise his own<br>\n\
              glass to propose a toast to the host, the chef, or anyone else he sees fit to honor.<br><br>\n\
              At private or small informal dinners, it is acceptable for everyone-toaster and toastee included -to remain seated.";
      
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
                                        <td height="130px" colspan="4" width="700px">
                                            <p class="chap_banner" style="font-size:45px">
                                                Business Dining Etiquette
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
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter4_1.png" onmouseover="changeContent(1);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter4_2.png"  onmouseover="changeContent(2);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter4_3.png" onmouseover="changeContent(3);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter4_4.png" onmouseover="changeContent(4);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter4_5.png" onmouseover="changeContent(5);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter4_6.png" onmouseover="changeContent(6);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="35px"><center><a href="http://localhost:8084/jspProject/ExamCon?index=1&chapter=ch4"><input type="button" class="button" value="Examination"></a></center></td>
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
                                                         Eating at The Office
                                                        </p>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td width="980px" height="400px">
                                                        <p class="chap_con" id="ch1_con">
                                                         <b>Mess/Clutter.</b> Don't let your workspace look like the buffet line at an all-you-can-eat restaurant. Keep it clean.<br>
              If you eat at your desk, keep some Clorex wipes near by and wipe it down afterwards.<br><br>
              <b>Smell.</b>Don't eat pungent foods at work. There most likely won't be a window to open the air things out.<br><br>
              <b>Location.</b> Eat in the break room or an outdoor space if available (avoid eating at your desk if possible).<br><br>
              <b>Eat before you are on the clock.</b> Many workers think the first 30 minutes of the workday is meant for them to grab a cup of coffee and snack to eat at their desk.<br><br>
              <b>Timing.</b> If eating at your cubicle, do so when most other employees are absent and out on their own meal <br> break: 11:30 a.m. to 12:15 p.m., 5 p.m. to 5:40 p.m., or 10:45 to 11:12 p.m.<br><br>
              <b>Noise.</b> Don't loudly smack your lips or burp. In a cubicle, even chewing food can disturb coworkers.
                                                

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
