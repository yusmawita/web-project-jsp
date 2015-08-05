package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fquestion_jsp extends org.apache.jasper.runtime.HttpJspBase
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



      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <link href=\"css_exam.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <title>Question</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"topdiv\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"6\">\n");
      out.write("                        <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"25px\" width=\"1400px\"></td>\n");
      out.write("                <td width=\"150px\"></td>\n");
      out.write("                <td width=\"260px\" style=\"text-align: right; padding-right: 10px\"><p class=\"b\">\n");
      out.write("                    <a href=\"http://localhost:8084/jspProject/Admincon?index=100\" class=\"text\">Logout</a>\n");
      out.write("                    </p>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("                        </table> \n");
      out.write("                    </td>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td height=\"110px\" width=\"110px\"><a href=\"admin_home.jsp\" class=\"picture\"><img class=\"button\" src=\"picture/home_button.png\"></a></td>\n");
      out.write("                    <td height=\"110px\" width=\"110px\"><a href=\"http://localhost:8084/jspProject/Admincon?index=7\" class=\"picture\"><img class=\"button\" src=\"picture/member.png\"></a></td>\n");
      out.write("                    <td height=\"110px\" width=\"110px\"><a href=\"http://localhost:8084/jspProject/Admincon?index=3&index2=1\" class=\"picture\"><img class=\"button\" src=\"picture/thread.png\"></a></td>\n");
      out.write("                    <td height=\"110px\" width=\"110px\"><a href=\"http://localhost:8084/jspProject/Admincon?index=1\" class=\"picture\"><img class=\"button\" src=\"picture/contact.png\"></a></td>\n");
      out.write("                    <td width=\"2800\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("                    <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"1500px\" height=\"180px\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"30px\" style=\"text-align: right\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"20px\"  style=\"text-align: center\">\n");
      out.write("                    <form action=\"http://localhost:8084/jspProject/Admincon?index=9\" method=\"post\">\n");
      out.write("                    <select name=\"chapter\">\n");
      out.write("                                    <option value=\"ch1\">Chapter 1\n");
      out.write("                                        <option value=\"ch2\">Chapter 2\n");
      out.write("                                            <option value=\"ch3\">Chapter 3\n");
      out.write("                                                <option value=\"ch4\">Chapter 4\n");
      out.write("                                                    <option value=\"ch5\">Chapter 5\n");
      out.write("                                                        <option value=\"ch6\">Chapter 6\n");
      out.write("                                </select>\n");
      out.write("                                <input type=\"submit\" class=\"buttona\">\n");
      out.write("                                <input type=\"hidden\" name=\"index\" value=\"1\">\n");
      out.write("                    \n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("            <center>\n");
      out.write("                    <table border=\"1\" style=\"border-color: #000000; border-radius: 5px; border-style: double; border-spacing: 0px\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td width=\"150px\" style=\"border-width: 0px; border-bottom-width: 1px; background-color: #3399ff; padding: 0px;\">\n");
      out.write("                                    <center><p style=\" color: #ffffff; font-weight: bold\">User ID</p></center> \n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"200px\" style=\"border-width: 0px; border-bottom-width: 1px; border-left-width: 1px; background-color: #3399ff; padding: 0px;\">\n");
      out.write("                                    <center><p style=\" color: #ffffff; font-weight: bold\">Picture</p></center> \n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"150px\" style=\"border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;\">\n");
      out.write("                                        <center><p style=\" color: #ffffff; font-weight: bold\">Password</p></center>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"150px\" style=\"border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;\">\n");
      out.write("                                        <center><p style=\" color: #ffffff; font-weight: bold\">Full Name</p></center>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"100px\" style=\"border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;\">\n");
      out.write("                                        <center><p style=\" color: #ffffff; font-weight: bold\">Gender</p></center>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"130px\" style=\"border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;\">\n");
      out.write("                                        <center><p style=\" color: #ffffff; font-weight: bold\">Location</p></center>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"250px\" style=\"border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;\">\n");
      out.write("                                        <center><p style=\" color: #ffffff; font-weight: bold\">Email</p></center>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"200px\" style=\"border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; background-color: #3399ff;\">\n");
      out.write("                                        <center><p style=\" color: #ffffff; font-weight: bold\">Bio</p></center>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"80px\" style=\"border-width: 0px; border-left-width: 1px ; border-bottom-width: 1px; border-left-width: 1px; background-color: #3399ff;\">\n");
      out.write("                                        <center><p style=\" color: #ffffff; font-weight: bold\">Action</p></center>\n");
      out.write("                                        </td>\n");
      out.write("                                        \n");
      out.write("                                    </tr>\n");
      out.write("                                    \n");
      out.write("                                    <tr>\n");
      out.write("                                        <td height=\"10px\" style=\"border-width: 0px; border-bottom-width: 1px ; border-left-width: 1px ; background-color: #eaf5ff\"></td>\n");
      out.write("                                        <td style=\"border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff\"></td>\n");
      out.write("                                        <td style=\"border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff\"></td>\n");
      out.write("                                        <td style=\"border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff\"></td>\n");
      out.write("                                        <td style=\"border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff\"></td>\n");
      out.write("                                        <td style=\"border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff\"></td>\n");
      out.write("                                        <td style=\"border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff\"></td>\n");
      out.write("                                        <td style=\"border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff\"></td>\n");
      out.write("                                        <td style=\"border-width: 0px; border-left-width: 1px ;border-bottom-width: 1px; background-color: #eaf5ff\"></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    </table> \n");
      out.write("                </center>\n");
      out.write("                    \n");
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
