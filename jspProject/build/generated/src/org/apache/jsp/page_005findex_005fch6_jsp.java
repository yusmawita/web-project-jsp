package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page_005findex_005fch6_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

    String id = (String)session.getAttribute("userid");  

      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <link href=\"css_index.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Chapter 6</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"chapter\">\n");
      out.write("        \n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function changeContent(y){\n");
      out.write("  \n");
      out.write("  switch(y){\n");
      out.write("      \n");
      out.write("      case 1: document.getElementById(\"ch1_tit\").innerHTML=\"England\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"Dining etiquette for utensils. The English do not switch knives and forks. The knife remains in the right hand,<br>\\n\\\n");
      out.write("              and the fork remains in the left. When the meal is finished, the knife and fork are laid<br>\\n\\\n");
      out.write("              parallel to each other across the right side of the plate. The fork is often held tines down,<br>\\n\\\n");
      out.write("              so that food is scooped up onto the backside of the fork; o this after much practice,<br>\\n\\\n");
      out.write("              or with foods that can stick to the back of the fork (like mashed potatoes and peas). Dining etiquette the place setting.<br>\\n\\\n");
      out.write("              The knife above the plate is used for butter; otherwise, always start from the outside<br>\\n\\\n");
      out.write("              and work your way in, course by course. Dining etiquette for hands.<br>\\n\\\n");
      out.write("              Hands are kept in your lap at the dinner table. Dining etiquette for passing food.<br>\\n\\\n");
      out.write("              At the table, pass all dishes to your left.<br><br>\\n\\\n");
      out.write("              Dining etiquette for seating. The most honored position is at the head of the table, with individuals of<br>\\n\\\n");
      out.write("              greatest importance seated first to the left and then the right of the head of the table; if there is a hosting couple,<br>\\n\\\n");
      out.write("              one will be at one end of the table, the other at the opposite end.\";\n");
      out.write("                                       \n");
      out.write("      \n");
      out.write("      break;\n");
      out.write("      case 2: document.getElementById(\"ch1_tit\").innerHTML=\"Indonesia\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"Dining etiquette for utensils. In Indonesia, spoons and forks are used (never knives), or no utensils at all<br>\\n\\\n");
      out.write("              (mainly in more traditional Muslim restaurants). If you need to cut things, use the side of your spoon first,<br>\\n\\\n");
      out.write("              then move on to the fork, if necessary (most foods already come precut). <br>\\n\\\n");
      out.write("              Since the spoon is more important than the fork, if you are right-handed,<br>\\n\\\n");
      out.write("              keep the spoon in your right hand and put it down to switch to the fork if you need it.<br>\\n\\\n");
      out.write("              Dining etiquette for using your hands. Wash your hands before and after you eat. Use your right hand <br>\\n\\\n");
      out.write("              when picking up and eating food, never your left hand, Keep your left hand at your side.<br>\\n\\\n");
      out.write("              Do not place your left hand on the table, and do not pass food with your left hand. When eating banana-leaf food,<br>\\n\\\n");
      out.write("              reach into the rice, take some with your fingers, gently roll it between your index and middle fingers<br>\\n\\\n");
      out.write("              and thumb into a self-sticking ball, dip it into the sauce, and mix it with a vegetable or a piece of chicken, then pop the whole thing in your mouth.<br><br>\\n\\\n");
      out.write("              Dining etiquette for paying the bill. Usually the one who does the inviting pays the bill.\";\n");
      out.write("\n");
      out.write("      break;\n");
      out.write("      case 3: document.getElementById(\"ch1_tit\").innerHTML=\"China\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"Dining etiquette for chopsticks. China is one of the traditional chopstick cultures, along with Japan and Korea.<br>\\n\\\n");
      out.write("              There is one major difference, though; Chinese chopsticks are usually round, as opposed to<br>\\n\\\n");
      out.write("              the more square-sided Japanese kind, and do not come attached.<br><br>\\n\\\n");
      out.write("              Sauce may be mixed with the rice, and the main dish may be eaten with the rice. You are expected to hold the rice bowl by your mouth, take a bit of food and sauce from the plate below, hold it over the rice bowl, and shovel it all in together. If you're eating noodles or broth, it is not appropriate to slurp the food; however, hot tea may be slurped quietly to cool it off as it enters the mouth.<br><br>\\n\\\n");
      out.write("              Dining etiquette for toothpicks. Handle a toothpick by working it away at your teeth with one hand, while keeping the other hand in front of it over the mouth.\";\n");
      out.write("      \n");
      out.write("      break;\n");
      out.write("      case 4: document.getElementById(\"ch1_tit\").innerHTML=\"Brazil\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"Dining etiquette for utensils. Brazilians do not switch knives and forks as they eat.\\n\\\n");
      out.write("                The knife remains in the right hand, and the fork remains in the left. When the meal is finished, the knife and fork are laid parallel\\n\\\n");
      out.write("                to each other horizontally across the center of the plate-make sure they do not cross each other.<br><br>\\n\\\n");
      out.write("                Dining etiquette for the place setting. The fork and spoon above your plate are for dessert. Always start from the outside and work your way in,\\\\n\\\n");
      out.write("                course by course. There will be separate glasses provided at your setting for water and white and red wine or beer (after-dinner drink glasses come out after dinner).<br><br>\\n\\\n");
      out.write("                Dining etiquette for restaurants. In informal restaurants, you may be required to share a table. Waitstaff may be summoned by making eye contact.<br><br>\\n\\\n");
      out.write("                \";\n");
      out.write("      \n");
      out.write("      break;\n");
      out.write("      case 5: document.getElementById(\"ch1_tit\").innerHTML=\"Egypt\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"Dining etiquette for eating with Muslims. Islam prohibits eating pork. Meat must be prepared halal.\\n\\\n");
      out.write("                Do not eat in front of your Muslim colleagues, or invite them to join you for a meal, during the day during Ramadan.<br><br>\\n\\\n");
      out.write("                Dining etiquette for drinking. Always accept the cup of tea and/or coffee. Never pour your own drink. Be alert throughout\\n\\\n");
      out.write("                the meal as to whether or not your neighbor's cup or glass needs refilling. If it is less than half full, it needs refilling.\\n\\\n");
      out.write("                If your glass is less than half full, your neighbor or host is obliged to refill it. If he or she does not, do not refill it yourself.\\n\\\n");
      out.write("                Indicate your need by pouring a little more drink into your neighbor's glass, even if it doesn't really need it.<br><br>\\n\\\n");
      out.write("                Dining etiquette for guests. Do not fill your plate full at first. It is better to return for more.\";\n");
      out.write("      \n");
      out.write("      break;\n");
      out.write("      case 6: document.getElementById(\"ch1_tit\").innerHTML=\"Saudi Arabian\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"Dining etiquette for utensils. Throughout the region, people use spoons, forks, and knives,\\n\\\n");
      out.write("                if necessary, or no utensils at all. Since the spoon is more important than the fork, if you are right-handed, keep the spoon in the right hand,\\n\\\n");
      out.write("                and put it down to switch to the fork if and when you need it. Never use your left hand for eating, especially if you are eating directly with your hands.<br><br>\\n\\\n");
      out.write("                Dining etiquette for using your hands. Wash your hands before you sit down to eat. Many restaurants have washrooms and sinks out in the open specifically for this purpose.\\n\\\n");
      out.write("                You will also need to wash your hands again at the end of the meal. Use your right hand when picking up and eating food: never your left hand. Keep your left hand at your side.\\n\\\n");
      out.write("                Do not place your left hand on the table, and do not pass food with your left hand.<br><br>\\n\\\n");
      out.write("                Alcohol will usually not be served with the meal.<br><br>\\n\\\n");
      out.write("                If men and women are dining together, women should not directly touch food that is being served to a Muslim male, other than those who are her immediate relatives.<\";\n");
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
      out.write("                                        <td height=\"130px\" width=\"180px\"><a href=\"page_home.jsp\" class=\"picture\"><img class=\"button\" src=\"picture/home_button.png\"></a></td>\n");
      out.write("                                        <td height=\"130px\" colspan=\"4\" width=\"720px\">\n");
      out.write("                                            <p class=\"chap_banner\" style=\"font-size:50px\">\n");
      out.write("                                                International Dining\n");
      out.write("                                            </p>\n");
      out.write("                                        </td>\n");
      out.write("                                        \n");
      out.write("                                        <td height=\"130px\" width=\"180px\"></td>\n");
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
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter6_1.png\" onmouseover=\"changeContent(1);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter6_2.png\"  onmouseover=\"changeContent(2);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter6_3.png\" onmouseover=\"changeContent(3);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter6_4.png\" onmouseover=\"changeContent(4);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter6_5.png\" onmouseover=\"changeContent(5);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter6_6.png\" onmouseover=\"changeContent(6);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"35px\"><center><a href=\"http://localhost:8084/jspProject/ExamCon?index=1&chapter=ch6\"><input type=\"button\" class=\"button\" value=\"Examination\"></a></center></td>\n");
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
      out.write("                                                         England\n");
      out.write("                                                        </p>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td width=\"980px\" height=\"400px\">\n");
      out.write("                                                        <p class=\"chap_con\" id=\"ch1_con\">\n");
      out.write("                                                         Dining etiquette for utensils. The English do not switch knives and forks. The knife remains in the right hand,<br>\n");
      out.write("              and the fork remains in the left. When the meal is finished, the knife and fork are laid<br>\n");
      out.write("              parallel to each other across the right side of the plate. The fork is often held tines down,<br>\n");
      out.write("              so that food is scooped up onto the backside of the fork; o this after much practice,<br>\n");
      out.write("              or with foods that can stick to the back of the fork (like mashed potatoes and peas). Dining etiquette the place setting.<br>\n");
      out.write("              The knife above the plate is used for butter; otherwise, always start from the outside<br>\n");
      out.write("              and work your way in, course by course. Dining etiquette for hands.<br>\n");
      out.write("              Hands are kept in your lap at the dinner table. Dining etiquette for passing food.<br>\n");
      out.write("              At the table, pass all dishes to your left.<br><br>\n");
      out.write("              Dining etiquette for seating. The most honored position is at the head of the table, with individuals of<br>\n");
      out.write("              greatest importance seated first to the left and then the right of the head of the table; if there is a hosting couple,<br>\n");
      out.write("              one will be at one end of the table, the other at the opposite end.\n");
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
