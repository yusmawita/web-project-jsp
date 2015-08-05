package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page_005findex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    session.removeAttribute("id_pic");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css_index.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Index</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                <table border=\"0\">\n");
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
      out.write("        </table>\n");
      out.write("        <table border=\"0\" >\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"1500px\" height=\"630px\">\n");
      out.write("                    <table border=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td width=\"1500px\" height=\"160px\">\n");
      out.write("                                <table border=\"0\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        \n");
      out.write("                                        <td height=\"130px\" width=\"180px\"><a href=\"page_home.jsp\" class=\"picture\"><img class=\"button\" src=\"picture/home_button.png\"></a></td>\n");
      out.write("                                        <td height=\"130px\" width=\"180px\"><a href=\"http://localhost:8084/jspProject/ShowCon?index=1&userid=");
      out.print(id);
      out.write("\" class=\"picture\"><img class=\"button\" src=\"picture/profile_button.png\"></a></td>\n");
      out.write("                                        <td height=\"130px\" width=\"180px\"><a href=\"http://localhost:8084/jspProject/ForumCon?index=1&index2=1\" class=\"picture\"><img class=\"button\" src=\"picture/forum_button.png\"></a></td>\n");
      out.write("                                        <td height=\"130px\" width=\"180px\"><a href=\"page_exam.jsp\" class=\"picture\"><img class=\"button\" src=\"picture/exam_button.png\"></a></td>\n");
      out.write("                                        <td height=\"130px\" width=\"180px\"></td>\n");
      out.write("                                        <td height=\"130px\" width=\"180px\"></td>\n");
      out.write("                                        <td height=\"130px\" width=\"180px\"></td>\n");
      out.write("                                        <td height=\"130px\" width=\"180px\"></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td height=\"20px\">\n");
      out.write("                                            \n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td height=\"450px\">\n");
      out.write("                                <param name=\"allowScriptAccess\" value=\"sameDomain\"/>\n");
      out.write("                                <param name=\"movie\" value=\"picture/index.swf\"/>\n");
      out.write("                                <param name=\"wmode\" value=\"transparent\"/>\n");
      out.write("                                <param name=\"quality\" value=\"high\" />\n");
      out.write("                                <embed src=\"picture/index.swf\" quality=\"high\" name=\"clock\" height=\"400px\" width=\"1200px\" align=\"middle\" allowScriptAccess=\"sameDomain\" type=\"application/x-shockwave-flash\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" wmode=\"transparent\"/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
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
