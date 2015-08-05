package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.*;

public final class page_005fcreateForum_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("          \n");
      out.write("<!DOCTYPE html>\n");

    String id = (String)session.getAttribute("userid");

      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <link href=\"css_forum.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Create Forum</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"topdiv\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"25px\" width=\"1400px\"></td>\n");
      out.write("                <td width=\"150px\"><a href=\"http://localhost:8084/jspProject/ShowCon?index=1&userid=");
      out.print(id);
      out.write("\" style=\"text-decoration:none;\"><p class=\"a\" style=\"margin-top: 0px\">Hi,  \n");
      out.write("                    ");
      out.print(id);
      out.write("\n");
      out.write("                    </p></a></td>\n");
      out.write("                <td width=\"80px\"><a href=\"page_contact.jsp\"  style=\"text-decoration:none\"><p class=\"a\" style=\"margin-top: 0px\">Contact</p></a></td>\n");
      out.write("                <td width=\"80px\" ><a href=\"page_about.jsp\"  style=\"text-decoration:none\"><p class=\"a\" style=\"margin-top: 0px\"> About</p></a></td>\n");
      out.write("                <td width=\"80px\"><a href=\"http://localhost:8084/jspProject/UserCon?index=100\"  style=\"text-decoration:none\"><p class=\"a\" style=\"margin-top: 0px\">Logout</p></a></td>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("                </table> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                \n");
      out.write("                    <td height=\"130px\" width=\"1300px\" style=\"text-align: left\">\n");
      out.write("                        <table border=\"0\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td height=\"135px\" width=\"180px\"><a href=\"page_home.jsp\" class=\"picture\"><img class=\"button\" src=\"picture/home_button.png\"></a></td>\n");
      out.write("                                        <td width=\"180px\" ><a href=\"http://localhost:8084/jspProject/ShowCon?index=1&userid=");
      out.print(id);
      out.write("\" class=\"picture\"><img class=\"button\" src=\"picture/profile_button.png\"></a></td>\n");
      out.write("                                        <td  width=\"180px\" ><a href=\"page_index.jsp\" class=\"picture\"><img class=\"button\" src=\"picture/index_button.png\"></a></td>\n");
      out.write("                                        <td  width=\"180px\" ><a href=\"page_exam.jsp\" class=\"picture\"><img class=\"button\" src=\"picture/exam_button.png\"></a></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"1500px\" height=\"180px\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"30px\" style=\"text-align: right\"> <input type=\"button\" value=\"+ Create New Thread\" class=\"buttona\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"20px\"  style=\"text-align: right; padding-right: 145px\"><a href=\"http://localhost:8084/jspProject/ForumCon?index=1&index2=2\" style=\"text-decoration: none\">Show All Thread</a></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("           \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("           \n");
      out.write("        \n");
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
