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
    if(status[4]!=null){
    message2 = status[4];
    }
%>
<html>
    
    <head>
        <link href="css_index.css" rel="stylesheet" type="text/css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chapter 5</title>
    </head>
    <body class="chapter">
        
    <script type="text/javascript">

function changeContent(y){
  
  switch(y){
      
      case 1: document.getElementById("ch1_tit").innerHTML="Ordering Wine";
              document.getElementById("ch1_con").innerHTML="Before you place your order, there are several issues that must be resolved :<br>\n\
              <br><b>Wine lists and prices</b><br>The wine list may or may not offer useful guidance for selecting your wine. The detail on the lists <br>\n\
                   can range from descriptive language that gives you a general idea about the taste of the wine.\n\
              <br><br><b>Selecting the wine</b><br>Memorizing the different characteristics of each variety, region, and country can be daunting.<br>\n\
              <br><br><b>The Sommelier</b><br>The sommelier is a specially trained, knowledgeable wine specialist.\n\
              <br><br><b>Wine by The Glass</b><br>Most restaurants offer a smaller selection of wines by the glass, so that you don’t have to purchase an entire bottle";
                                       
      
      break;
      case 2: document.getElementById("ch1_tit").innerHTML="Pairings";
              document.getElementById("ch1_con").innerHTML="Matching wine and food is about finding their common flavors and textures. This is something you learn by experimenting.<br>\n\
              <ul>\n\
              <li><b>Sour</b><br>Foods that have a sour component are good matches for wines that are high in acid.<br>\n\
                    A salad with a vinaigrette dressing and a fish fillet with lemon both match well with a high-acid wine.\n\
              <li><b>Sweet</b><br>The sweeter the food, the less sweet a wine will taste. With dessert, drink a wine that's sweeter than your food.\n\
              <li><b>Bitter</b><br>When you eat food with a hint of bitterness and drink a wine with some bitterness , they cancel out each other's bitterness\n\
              <li><b>Salt</b><br>Drink high-acid wines - especially sparkling one, with salty food. The acid cuts the saltiness.";

      break;
      case 3: document.getElementById("ch1_tit").innerHTML="Testing";
              document.getElementById("ch1_con").innerHTML="<ul>\n\
                <li><b>Step 1 - Look</b><br> Begin by holding the wine glass up against a white background, such as a napkin or table cloth, to evaluate its color<br>and clarity.\n\
                    Red wines should range in color from deep purple to brick red. Red wines generally fade in color with age.<br>\n\
                    White wines should range in color from lemon gold to golden amber. White wines usually darken with age.<br>\n\
                    <li><b>Step 2 - Swirl</b><br> Swirl the wine in your glass to aerate it and release its aroma.<br>\n\
                <li><b>Step 3 - Smell</b><br> To properly smell your wine, put your nose in the glass and take a deep breath.<br>\n\
                    Pay attention to what the wine smells like. Older wines should have subtler aromas than younger ones\n\
                <li><b>Step 4 - Taste</b><br> To taste the wine, fill your mouth about ½ full and subtly swish the wine around.<br>\n\
                    Moving the wine in your mouth should release its aroma and coat your mouth.\n\
                </ul>";
      
      break;
      case 4: document.getElementById("ch1_tit").innerHTML="Wine Temperature";
              document.getElementById("ch1_con").innerHTML="<b>The right temperature to serve red wine</b><br>\n\
              To protect red wine against vaporization and loss of bouquet, it is served at a slightly cooler<br>\n\
              temperature than the average room, or around 65°F (18°C).<br><br>\n\
              <b>The right temperature to serve light-colored wines</b><br>\n\
              Light-bodied wines are served chilled. In general, the sweeter the table wine, the colder it is served<br>\n\
              this reduces the cloying taste. However, if chilled too long, light-colored wines lose their bouquet and taste.<br><br>\n\
              <b>Chilling wine in a freezer</b><br>\n\
              <ul>\n\
              <li>chill white wine, rose, and dessert wine for approximately 5 to 10 minutes\n\
              <li>champagne 10 to 20 minutes or until the bottles are cool to the touch.</ul>";
      
      break;
      case 5: document.getElementById("ch1_tit").innerHTML="Aeration";
              document.getElementById("ch1_con").innerHTML="Red wine is aerated by opening the bottle in advance of service. Aeration removes from the bottle<br>\n\
              musty odors, such as those from an unclean barrel<br><br>\n\
              The amount of time red wine needs for aeration depends on the age of the wine.<br><ul>\n\
              <li>Young red wines, usually those under 8 years old, are strong in tannic acid and require 1 to 2 hours to aerate.<br>\n\
              <li>Mature red wines, generally those over 8 years old, are mellow and need to breathe for approximately 30 minutes.<br>\n\
              <li>Very old red wines require no aeration.<br>\n\
              <li>Wines with delicate bouquets, such as white wine, rose, champagne, and sparkling wines are not aerated</ul>";
      
      break;
      case 6: document.getElementById("ch1_tit").innerHTML="Decanting Wine";
              document.getElementById("ch1_con").innerHTML="The narrow neck of the wine bottle may not permit sufficient aeration. If you really want to aerate your wine,<br>\n\
              pour it into your glass, swirl it around, and let it sit for a while.<br><br>\n\
              A wine can require decanting for two reasons :<br><ul>\n\
              <li>It needs aeration or it needs to be separated from sediment that has settled with aging. For breathing purposes,<br>\n\
                simply pour the bottle of wine into a decanter for serving.\n\
              <li>It's too tannic to drink. Pour it back and forth between two vessels a few times.</ul>";
      
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
                                                Wine Etiquette
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
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter5_1.png" onmouseover="changeContent(1);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter5_2.png"  onmouseover="changeContent(2);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter5_3.png" onmouseover="changeContent(3);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter5_4.png" onmouseover="changeContent(4);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter5_5.png" onmouseover="changeContent(5);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="30px"><center><img class="chapbutton" src="picture/chapter/chapter5_6.png" onmouseover="changeContent(6);"></center></td>
                                                </tr>
                                                <tr>
                                                    <td height="35px"><center><a href="http://localhost:8084/jspProject/ExamCon?index=1&chapter=ch5"><input type="button" class="button" value="Examination"></a></center></td>
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
                                                         Ordering Wine
                                                        </p>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td width="980px" height="400px">
                                                        <p class="chap_con" id="ch1_con">
                                                         Before you place your order, there are several issues that must be resolved :<br>
              <br><b>Wine lists and prices</b><br>The wine list may or may not offer useful guidance for selecting your wine. The detail on the lists <br>
                   can range from descriptive language that gives you a general idea about the taste of the wine.
              <br><br><b>Selecting the wine</b><br>Memorizing the different characteristics of each variety, region, and country can be daunting.<br>
              <br><br><b>The Sommelier</b><br>The sommelier is a specially trained, knowledgeable wine specialist.
              <br><br><b>Wine by The Glass</b><br>Most restaurants offer a smaller selection of wines by the glass, so that you don’t have to purchase an entire bottle
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
