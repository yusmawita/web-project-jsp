package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fmember_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    String counter = (String)request.getAttribute("counter");
    String msg = (String)request.getAttribute("message");

      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <link href=\"css_exam.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <title>Contact</title>\n");
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
      out.write("                    <td height=\"110px\" width=\"110px\"><a href=\"admin_question.jsp\" class=\"picture\"><img class=\"button\" src=\"picture/question.png\"></a></td>\n");
      out.write("                    <td height=\"110px\" width=\"110px\"><a href=\"http://localhost:8084/jspProject/Admincon?index=3&index2=1\" class=\"picture\"><img class=\"button\" src=\"picture/thread.png\"></a></td>\n");
      out.write("                    <td height=\"110px\" width=\"110px\"><a href=\"http://localhost:8084/jspProject/Admincon?index=1\" class=\"picture\"><img class=\"button\" src=\"picture/contact.png\"></a></td>\n");
      out.write("                    <td width=\"2800\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("            <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"1500px\" height=\"180px\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"30px\" style=\"text-align: right\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"20px\"  style=\"text-align: right; padding-right: 145px\">\n");
      out.write("                    <form action=\"\" method=\"post\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Search userid...\" required name=\"search\"><input type=\"submit\" value=\"\" style=\"background-color: transparent; background-image:url(picture/search_icon.png)\">\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            \n");
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
