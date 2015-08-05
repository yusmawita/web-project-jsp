package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JOptionPane;

public final class page_005findex_005fch1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    String id = (String)session.getAttribute("userid");
    String[] status = (String[])session.getAttribute("resultStatus");
    String message2="";
    if(status[0]!=null){
    message2 = status[0];
    }
    

      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <link href=\"css_index.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Chapter 1</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"chapter\">\n");
      out.write("        \n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function changeContent(y){\n");
      out.write("  \n");
      out.write("  switch(y){\n");
      out.write("      \n");
      out.write("      case 1: document.getElementById(\"ch1_tit\").innerHTML=\"Handling Utensils\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"In most situations,<br> following the outside-in rule will tell you which knife, fork, or spoon to use at the dinner table.\\n\\\n");
      out.write("                 <br><br><b>American Style</b><br>\\n\\\n");
      out.write("                  Hold your fork like a pencil, with the shank extended between your thumb and index and middle fingers.<br>\\n\\\n");
      out.write("                  Your fourth and fifth fingers rest in your hand.\\n\\\n");
      out.write("                   <br>For leverage, the index finger is extended along the back of the fork, as far from the tines as possible.\\n\\\n");
      out.write("                   <br><img src=\"+'\"picture/chapter/chapter1_1a.png\"'+\"><br>\\n\\\n");
      out.write("                   Hold the knife with the handle cupped in the palm of your left hand, along with your third, fourth, and fifth fingers.<br>\\n\\\n");
      out.write("                   Place your second finger on the back of the blade. Hold your thumb against the side of the handle.\";\n");
      out.write("                                       \n");
      out.write("      \n");
      out.write("      break;\n");
      out.write("      case 2: document.getElementById(\"ch1_tit\").innerHTML=\"Napkin Etiquette\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"Placing the Napkin in Your Lap.<br>Wait for the host or hostess to take his or her napkin off the table and place it in his or her lap.<br>(An exception to this rule is buffet-style meals, where you should\\n\\\n");
      out.write(" unfold your napkin when you start eating)<br><br>Unfolding the Napkin.<br>Unfold your napkin in one smooth motion without snapping or shaking it open.<br><br>\\n\\\n");
      out.write("Tucking the Napkin.<br>Don't tuck a napkin into your collar, between the buttons of your shirt, or in your belt.\\n\\\n");
      out.write("<br><br>Using the Napkin.<br>Use your napkin frequently during the meal to blot or pat, not wipe, your lips.<br>Blot your lips before taking a drink of your beverage-especially if you're a woman wearing lipstick\";\n");
      out.write("\n");
      out.write("      break;\n");
      out.write("      case 3: document.getElementById(\"ch1_tit\").innerHTML=\"Passing Food\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"<ul>\\n\\\n");
      out.write("                <li>Food should be passed to the right - but the point is for the food to be moving in only one direction.<br>\\n\\\n");
      out.write("                <li>One diner either holds the dish as the next diner takes some food,<br> or he hands it to the person, who then serves herself.<br>\\n\\\n");
      out.write("                <li>Any heavy or awkward dishes are put on the table with each pass.\\n\\\n");
      out.write("                <li>Cream pitchers and other dishes with handles should be passed with<br>the handle toward the person receiving them.\\n\\\n");
      out.write("                <li>If a platter for sharing is present it is passed around the table,<br>with each diner holding it as the person next to him serves himself,using only the serving utensils provided.\\n\\\n");
      out.write("                </ul>\";\n");
      out.write("      \n");
      out.write("      break;\n");
      out.write("      case 4: document.getElementById(\"ch1_tit\").innerHTML=\"Salt and Pepper Etiquette\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"<b>Taste Before Salting</b><br> Be sure to taste the food before putting salt or pepper on it.\\n\\\n");
      out.write("                <br><b>Pass Salt and Pepper Together</b><br>Always pass salt and pepper together. If a person asks for just one, pass both anyway.\\n\\\n");
      out.write("                <br><b>Saltcellars</b><br>Some hostesses prefer to use saltcellars, which salt shakers have largely replaced.\\n\\\n");
      out.write("                <ul>\\n\\\n");
      out.write("                <li>If there is no spoon in the saltcellar, use the tip of a clean knife to take some salt.\\n\\\n");
      out.write("                <li>If the salt­cellar is for you alone, you may either use the tip of your knife or you may take a pinch with your fingers.\\n\\\n");
      out.write("                <li>If it is to be shared with others, never use your fingers or a knife that is not clean.\\n\\\n");
      out.write("                <li>Salt you have taken from the cellar should be put on the bread-and-butter plate<br>or on the rim of whatever plate is before you.\\n\\\n");
      out.write("                </ul>\";\n");
      out.write("      \n");
      out.write("      break;\n");
      out.write("      case 5: document.getElementById(\"ch1_tit\").innerHTML=\"Bread and Butter Etiquette\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"Bread is most often placed on the table in a basket that everyone shares.\\n\\\n");
      out.write("<br><br><ul>\\n\\\n");
      out.write("                <li>Don't butter the whole piece of bread and then take bites from it.\\n\\\n");
      out.write("                <li>Don't hold your bread in one hand and a drink in the other.\\n\\\n");
      out.write("                <li>Don't take the last piece of bread without first offering it to others. \\n\\\n");
      out.write("                </ul>\\n\\\n");
      out.write("<br><br>In some restaurants, olive oil is served with bread. Dip your bite-sized pieces of bread in the oil and eat.\\n\\\n");
      out.write("<br><br>Because butter is produced in rectangle form, and the butter knife is made with<br>a dull blade to slice butter and a pointed tip to transfer cubes of butter to the plate.\\n\\\n");
      out.write("\";\n");
      out.write("      \n");
      out.write("      break;\n");
      out.write("      case 6: document.getElementById(\"ch1_tit\").innerHTML=\"Serving Etiquette\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"<b>Formal Meals</b>\\n\\\n");
      out.write("                <br><ul>\\n\\\n");
      out.write("                <li>Food is brought to each diner at the table.\\n\\\n");
      out.write("                <li>The server presents the platter or bowl on the diner's left.\\n\\\n");
      out.write("                </ul>\\n\\\n");
      out.write("                <br><b>Casual Meals</b>\\n\\\n");
      out.write("                <br><ul>\\n\\\n");
      out.write("                <li>the host will dish food onto guests' plates to pass around the table.\\n\\\n");
      out.write("                <li>the diners help themselves to the food and pass it to others as necessary.\\n\\\n");
      out.write("                </ul>\\n\\\n");
      out.write("                <br><b>Using Serving Utensils</b>\\n\\\n");
      out.write("                <br><ul>\\n\\\n");
      out.write("                <li>Serving utensils are placed on the right side of serveware.\\n\\\n");
      out.write("                </ul>\";\n");
      out.write("      \n");
      out.write("      break;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("     <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"25px\" width=\"1000px\"></td>\n");
      out.write("                <td width=\"200px\"><a href=\"http://localhost:8084/jspProject/ShowCon?index=1&userid=");
      out.print(id);
      out.write("\" style=\"text-decoration:none\"><p class=\"a\">Hi,  \n");
      out.write("                    ");
      out.print(id);
      out.write("\n");
      out.write("                    \n");
      out.write("                    </p></a></td>\n");
      out.write("                <td width=\"300px\"><p class=\"b\">\n");
      out.write("                    <a href=\"page_contact.jsp\" class=\"text\">Contact</a>\n");
      out.write("                    <a href=\"page_about.jsp\" class=\"text\">About</a>\n");
      out.write("                    <a href=\"http://localhost:8084/jspProject/UserCon?index=100\" class=\"text\">Logout</a>\n");
      out.write("                    </p>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("     </table>   \n");
      out.write("     <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"1500px\" height=\"640px\">\n");
      out.write("                    <table border=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td width=\"1500px\" height=\"130px\">\n");
      out.write("                                <table border=\"0\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        \n");
      out.write("                                        <td height=\"130px\" width=\"150px\"><a href=\"page_home.jsp\" class=\"picture\"><img class=\"button\" src=\"picture/home_button.png\"></a></td>\n");
      out.write("                                        <td height=\"130px\" colspan=\"4\" width=\"650px\">\n");
      out.write("                                            <p class=\"chap_banner\">\n");
      out.write("                                                Table Manner\n");
      out.write("                                            </p>\n");
      out.write("                                        </td>\n");
      out.write("                                        \n");
      out.write("                                        <td height=\"130px\" width=\"320px\">\n");
      out.write("                                        ");
if(message2.equals("Passed")){
      out.write("\n");
      out.write("                                        <img src=\"picture/passed.png\" style=\"width:150px; height:75px; margin-right: 0px\" >\n");
      out.write("                                        ");
}else if(message2.equals("Failed")){
      out.write("\n");
      out.write("                                        <img src=\"picture/failed.png\" style=\"width:150px; height:75px; margin-right: 0px\" >\n");
      out.write("                                        ");
}
      out.write("   \n");
      out.write("                                        </td>\n");
      out.write("                                        <td height=\"130px\" width=\"180px\"></td>\n");
      out.write("                                        <td height=\"130px\" width=\"180px\"></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td height=\"400px\">\n");
      out.write("                                <table border=\"0\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td height=\"0px\"></td>\n");
      out.write("                                        <td rowspan=\"8\" width=\"360px\">\n");
      out.write("                                            <table border=\"0\">\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"50px\" width=\"360px\"><a href=\"page_index.jsp\" class=\"picture\"><center><img class=\"chap_button\" src=\"picture/index_button.png\"></center></a></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter1_1.png\" onmouseover=\"changeContent(1);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter1_2.png\"  onmouseover=\"changeContent(2);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter1_3.png\" onmouseover=\"changeContent(3);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter1_4.png\" onmouseover=\"changeContent(4);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter1_5.png\" onmouseover=\"changeContent(5);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter1_6.png\" onmouseover=\"changeContent(6);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"35px\"><center><a href=\"http://localhost:8084/jspProject/ExamCon?index=1&chapter=ch1\"><input type=\"button\" class=\"button\" value=\"Examination\"></a></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </table>\n");
      out.write("                                            \n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td height=\"460px\" width=\"1000px\">\n");
      out.write("                                            <table border=\"0\">\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td width=\"995px\" height=\"40px\">\n");
      out.write("                                                        <p class=\"chap_tit\" id=\"ch1_tit\">\n");
      out.write("                                                         Handling Utensils\n");
      out.write("                                                        </p>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td width=\"980px\" height=\"400px\">\n");
      out.write("                                                        <p class=\"chap_con\" id=\"ch1_con\">\n");
      out.write("                                                         In most situations,<br> following the outside-in rule will tell you which knife, fork, or spoon to use at the dinner table.<br>\n");
      out.write("                                                \n");
      out.write("                                                <br><b>American Style</b><br> \n");
      out.write("                                               \n");
      out.write("                                                Hold your fork like a pencil, with the shank extended between your thumb and index and middle fingers.<br>\n");
      out.write("                                                Your fourth and fifth fingers rest in your hand.\n");
      out.write("                                                <br>For leverage, the index finger is extended along the back of the fork, as far from the tines as possible.\n");
      out.write("                                                <br><img src=\"picture/chapter/chapter1_1a.png\"><br>\n");
      out.write("                                                Hold the knife with the handle cupped in the palm of your left hand, along with your third, fourth, and fifth fingers.<br>\n");
      out.write("                                                Place your second finger on the back of the blade. Hold your thumb against the side of the handle.\n");
      out.write("                                                \n");
      out.write("\n");
      out.write("                                                        </p>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </table>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                        </td>\n");
      out.write("                                        \n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                             </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
