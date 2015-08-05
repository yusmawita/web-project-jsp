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
    if(status[2]!=null){
    message2 = status[2];
    }
%>
<html>
    
    <head>
        <link href="css_index.css" rel="stylesheet" type="text/css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chapter 3</title>
    </head>
    <body class="chapter">
        
    <script type="text/javascript">

function changeContent(y){
  
  switch(y){
      
      case 1: document.getElementById("ch1_tit").innerHTML="Getting VIP Treatment";
              document.getElementById("ch1_con").innerHTML="Who doesn’t relish receiving VIP treatment in a restaurant? Once you learn the velvet ropes,<br>you can enjoy the red carpet normally unrolled for ambassadors, movie stars, and captains of industry.<br><br>\n\
              Hard to get reservations will become available. Maitre d’s, bartenders and waiters will greet you with a smile and your name. <br>You will be escorted to choice tables and be offered daily specials the hoi polloi will never know.<br>\n\
            Your requests will be handled with respect and dispatch. This reception cannot but impress your guests";
                                       
      
      break;
      case 2: document.getElementById("ch1_tit").innerHTML="Restaurant Personnel";
              document.getElementById("ch1_con").innerHTML="<b>Proprietor</b><br><ul>\n\
              <li>business suit, dress, or chef’s white outfit\n\
              <li>overall supervision</ul>\n\
              <b>Maitre D'</b><br><ul>\n\
              <li>Black tie and tuxedo\n\
              <li>Takes you reservation, greets you on arrival, escorts you to the table</ul>\n\
              <b>Captain</b><br><ul>\n\
              <li>Black or white tie, white or colored diner jacket, and black pants.  Sometimes a tuxedo.</ul>\n\
              <b>Sommelier</b><br>\n\
              <b>Waiter</b><br>\n\
              <b>Busboy</b><br>\n\
              ";

      break;
      case 3: document.getElementById("ch1_tit").innerHTML="Planning";
              document.getElementById("ch1_con").innerHTML="Reserve a table before you leave for the restaurant. This enables you to give special seating preferences<br>\n\
              such as a table in the garden or one in a quiet corner. You can ask about the dress code.<br>\n\
              You may want to reconfirm the reservation one or two days before the dinner has been planned.<br><br>\n\
              Ask your guests if they like or dislike certain ethnic foods (simply ask when extending the invitation).<br>\n\
              You could also give the guest a choice of two or three restaurants. If you're hosting a group,<br>\n\
              pick a restaurant with a wide range of foods so that everyone present will find something to his taste.";
      
      break;
      case 4: document.getElementById("ch1_tit").innerHTML="Arriving";
              document.getElementById("ch1_con").innerHTML="The better seats are those that look out on the restaurant or out a window onto scenery, not<br>\n\
              at a wall-something to keep in mind when you're hosting a meal or simply wish to give a fellow diner the better view.<br><br>\n\
              At a table with a banquette, women are traditionally seated on the banquette, the men on chairs opposite them.<br><br>\n\
              The host and hostess customarily sit opposite each other, and time was when couples were split<br>\n\
              up so that they would have a chance to chat with people other than their spouses.<br>Today, seating choices depend more on the preferences of the group.";
      
      break;
      case 5: document.getElementById("ch1_tit").innerHTML="The Bill";
              document.getElementById("ch1_con").innerHTML="If you are the host, tell the maitre d' or waiter in advance that you should receive the check.<br>\n\
                <br>Discretely review the check. Signal the waiter when you would like to pay by putting the check<br>\n\
                holder to the edge of the table, with the bills or the credit card sticking out.<br><br>\n\
                Tell the waiter if you would like them to keep the change.";
      
      break;
      case 6: document.getElementById("ch1_tit").innerHTML="Tipping";
              document.getElementById("ch1_con").innerHTML="<ul>\n\
                <li><b>Self-service restaurants</b>, 10%\n\
                <li><b>Extra accommodating waiters</b>, extra $5 for extra special service\n\
                <li><b>Lingering at your table on a busy night</b>, extra 10% to 15%\n\
                <li><b>Bartenders</b>, 15% to 20% of the total bill\n\
                <li><b>Sommeliers</b>, 15% to 20% of wine bill for specially helpfull\n\
                </ul>\n\
                ";
      
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
                                                Restaurant Etiquette
                                            </p>
                                        </td>
                                        
                                        <td height="130px" width="280px">
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
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter3_1.png" onmouseover="changeContent(1);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter3_2.png"  onmouseover="changeContent(2);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter3_3.png" onmouseover="changeContent(3);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter3_4.png" onmouseover="changeContent(4);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter3_5.png" onmouseover="changeContent(5);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter3_6.png" onmouseover="changeContent(6);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="35px"><center><a href="http://localhost:8084/jspProject/ExamCon?index=1&chapter=ch3"><input type="button" class="button" value="Examination"></a></center></td>
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
                                                         Getting VIP Treatment
                                                        </p>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td width="980px" height="400px">
                                                        <p class="chap_con" id="ch1_con">
                                                         Who doesn’t relish receiving VIP treatment in a restaurant? Once you learn the velvet ropes,<br>you can enjoy the red carpet normally unrolled for ambassadors, movie stars, and captains of industry.<br><br>
                                                         Hard to get reservations will become available. Maitre d’s, bartenders and waiters will greet you with a smile and your name. <br>You will be escorted to choice tables and be offered daily specials the hoi polloi will never know.<br>
                                                         Your requests will be handled with respect and dispatch. This reception cannot but impress your guests

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
