package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page_005findex_005fch2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    String[] status = (String[])session.getAttribute("resultStatus");
    String message2="";
    if(status[1]!=null){
    message2 = status[1];
    }

      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <link href=\"css_index.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Chapter 2</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"chapter\">\n");
      out.write("        \n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function changeContent(y){\n");
      out.write("  \n");
      out.write("  switch(y){\n");
      out.write("      \n");
      out.write("      case 1: document.getElementById(\"ch1_tit\").innerHTML=\"Informal Table Setting\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"<table><tr><td><img src=picture/chapter/chapter2_informaltable.jpg></td>\\n\\\n");
      out.write("              <td><ul>\\n\\\n");
      out.write("                <li><b>Forks</b>, Both forks are placed on the left of the plate.<br> The fork furthest from the plate is for salad.<br>\\n\\\n");
      out.write("                <li><b>Dinner Plate</b>, The dinner plate is placed on the table <br>when the main course is served.<br>\\n\\\n");
      out.write("                <li><b>Salad Plate</b>, The salad plate is placed to the left of the forks.\\n\\\n");
      out.write("                <li><b>Spoon</b>, The soup spoon is on the far right of the outside knife.\\n\\\n");
      out.write("                <li><b>Napkin</b>, Place the napkin in the place setting's center, or left of the last fork.\\n\\\n");
      out.write("                </ul></td></tr></table>\";\n");
      out.write("                                       \n");
      out.write("      \n");
      out.write("      break;\n");
      out.write("      case 2: document.getElementById(\"ch1_tit\").innerHTML=\"Formal Table Setting\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"<center><img src=picture/chapter/chapter2_formaltable.jpg></center>\";\n");
      out.write("\n");
      out.write("      break;\n");
      out.write("      case 3: document.getElementById(\"ch1_tit\").innerHTML=\"Cups\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"The cup is made in seven sizes, each with a different volume capacity :<br><ul>\\n\\\n");
      out.write("                <li>Breakfast cup.<br>\\n\\\n");
      out.write("                <li>Mug.<br>\\n\\\n");
      out.write("                <li>Teacup.\\n\\\n");
      out.write("                <li>Coffee cup.\\n\\\n");
      out.write("                <li>Chocolate cup.\\n\\\n");
      out.write("                <li>After-dinner coffee cup.\\n\\\n");
      out.write("                <li>Demitasse cup.\\n\\\n");
      out.write("                </ul>\";\n");
      out.write("      \n");
      out.write("      break;\n");
      out.write("      case 4: document.getElementById(\"ch1_tit\").innerHTML=\"Serveware\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"Serveware comes from the Latin servire, to serve, and the Anglo-Saxon waru, meaning special merchandise.<br>\\n\\\n");
      out.write("                It is an inclusive term for bowls, beverage pots, compotes, nut bowls, platters, salt cellars and salt shakers,<br>\\n\\\n");
      out.write("                 pepper shakers and pepper mills, salvers, sauceboats and gravy boats, trays, and tureens.\\n\\\n");
      out.write("                <br><br>A basic set of serveware include the following :<br><ul>\\n\\\n");
      out.write("                <li>A large oval platter to serve a roast.<br>\\n\\\n");
      out.write("                <li>A small oval platter to serve chops or fish.<br>\\n\\\n");
      out.write("                <li>A small bowl for cold sauce, dips, nuts, and candy.\\n\\\n");
      out.write("                <li>A sauceboat to serve gravy and hot sauces.\\n\\\n");
      out.write("                <li>A medium-size pitcher for syrup, gravy, sauce, or honey.\\n\\\n");
      out.write("                <li>A large pitcher to serve water, iced tea, and other beveragesA beverage pot for coffee, tea or hot chocolate.\\n\\\n");
      out.write("                </ul>\";\n");
      out.write("      \n");
      out.write("      break;\n");
      out.write("      case 5: document.getElementById(\"ch1_tit\").innerHTML=\"Napkins\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"The Spartans were the first to use napkins. They wiped their hands with a lump of dough called apomagdalie.<br>\\n\\\n");
      out.write("                This practice later evolved with dinners using a sliced bread napkin to wipe their hands. Thankfully, in the US today, a cloth napkin is used.<br>\\n\\\n");
      out.write("                It is normally found to the left of the place setting. Europeans generally place napkins to the right of the spoon.<br><br>\\n\\\n");
      out.write("                The basic function of the napkin is to wipe your fingers and blot your mouth :<br><ul>\\n\\\n");
      out.write("                <li>After sitting, unfold your napkin and place it in your lap after the host or hostess has placed his or her napkin in their lap.<br>\\n\\\n");
      out.write("                <li>Small napkins are used an informal meals. They are completely unfolded.<br>\\n\\\n");
      out.write("                <li>Use the napkin to blot your lips as needed and before taking a drink.\\n\\\n");
      out.write("                <li>Place your napkin in your chair if leaving the table during the meal.\\n\\\n");
      out.write("                <li>When the meal is completed, the napkin is folded loosely and placed to the left of your plate.\\n\\\n");
      out.write("                </ul>\";\n");
      out.write("      \n");
      out.write("      break;\n");
      out.write("      case 6: document.getElementById(\"ch1_tit\").innerHTML=\"Glassware\";\n");
      out.write("              document.getElementById(\"ch1_con\").innerHTML=\"Stemware has a bowl that rests on a stem, anchored by a foot. The purpose of this design is to serve<br>\\n\\\n");
      out.write("                cool beverages, such as water, iced tea, and wine. The stem provides a way to hold cool drinks without warming the contents of the bowl.<br><br>\\n\\\n");
      out.write("                The bowls of contemporary stemware come in three main shapes :<br><ul>\\n\\\n");
      out.write("                <li><b>Bucket-Shaped Bowl</b>, the bucket-shaped bowl is similar to a bucket, with a horizontal base and almost vertical sides.<br>\\n\\\n");
      out.write("                <li><b>Tulip-Shaped Bowl</b>, the tulip-shaped bowl resembles a tulip, with a rounded base and sides that curve inward.<br>\\n\\\n");
      out.write("                <li><b>Flared Bowl</b>, the flared bowl is shaped like a trumpet or a funnel, a long, narrow form made with a pointed<br>or slightly rounded bowl that either flares outward at the top or remains straight\\n\\\n");
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
      out.write("                                                Table Setting\n");
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
      out.write("     \n");
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
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter2_1.png\" onmouseover=\"changeContent(1);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter2_2.png\"  onmouseover=\"changeContent(2);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter2_3.png\" onmouseover=\"changeContent(3);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter2_4.png\" onmouseover=\"changeContent(4);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter2_5.png\" onmouseover=\"changeContent(5);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"30px\"><center><img class=\"chapbutton\" src=\"picture/chapter/chapter2_6.png\" onmouseover=\"changeContent(6);\"></center></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td height=\"35px\"><center><a href=\"http://localhost:8084/jspProject/ExamCon?index=1&chapter=ch2\"><input type=\"button\" class=\"button\" value=\"Examination\"></a></center></td>\n");
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
      out.write("                                                         Cups\n");
      out.write("                                                        </p>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td width=\"980px\" height=\"400px\">\n");
      out.write("                                                        <p class=\"chap_con\" id=\"ch1_con\">\n");
      out.write("                                                       The cup is made in seven sizes, each with a different volume capacity : <br>\n");
      out.write("                                                       <br>Breakfast cup.<br>\n");
      out.write("                                                       <br>Mug.<br>\n");
      out.write("                                                       <br>Teacup.<br>\n");
      out.write("                                                       <br>Coffee cup.<br>\n");
      out.write("                                                       <br>Chocolate cup.<br>\n");
      out.write("                                                       <br>After-dinner coffee cup.<br>\n");
      out.write("                                                       <br>Demitasse cup.\n");
      out.write("                \n");
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
