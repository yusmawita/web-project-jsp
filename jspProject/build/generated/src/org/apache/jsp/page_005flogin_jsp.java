package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  String counter = (String)request.getAttribute("counter");
  String msg = (String)request.getAttribute("message");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css_login.css\" rel=\"stylesheet\" type=\"text/css\">      \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"height: 100%; width: 100%; position: fixed \">\n");
      out.write("        <form action=\"http://localhost:8084/jspProject/UserCon\" method=\"post\">\n");
      out.write("        <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"220px\" width=\"90px\"></td>\n");
      out.write("                <td height=\"220px\" width=\"1410px\" colspan=\"2\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td  height=\"30px\" width=\"90px\"></td>\n");
      out.write("                <td height=\"30px\" width=\"120px\"><p class=\"a\">UserID</p></td>\n");
      out.write("                <td height=\"30px\">\n");
      out.write("                    <p class=\"c\"> ");
if(counter!=null){ 
      out.write("\n");
      out.write("                    ");
      out.print(msg);
      out.write("\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    </p>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td  height=\"30px\" width=\"90px\"></td>\n");
      out.write("                <td height=\"30px\" width=\"1410px\" colspan=\"2\"><p class=\"a\"><input  style=\" padding-left: 8px; border-radius:10px; box-shadow: 0 1px 0 rgba(255,255,255,0.2) inset 0 1px 1px rgba(0,0,0,0.1)\" required type=\"text\" class=\"text\" name=\"userid\" placeholder=\"userID\" ></p></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td  height=\"30px\" width=\"90px\"></td>\n");
      out.write("                <td height=\"30px\" width=\"1410px\" colspan=\"2\"><p class=\"a\">Password</p></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td  height=\"30px\" width=\"90px\"></td>\n");
      out.write("                <td height=\"30px\" width=\"1410px\" colspan=\"2\"><p class=\"a\"><input style=\" padding-left: 8px; border-radius:10px; box-shadow: 0 1px 0 rgba(255,255,255,0.2) inset 0 1px 1px rgba(0,0,0,0.1)\" required type=\"password\" class=\"text\" name=\"password\" placeholder=\"password\" ></p></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"5px\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td width=\"120px\"><input style=\" padding-left: 8px; border-radius:10px; box-shadow: 0 1px 0 rgba(255,255,255,0.2) inset 0 1px 1px rgba(0,0,0,0.1)\" type=\"submit\" class=\"button\" value=\"Login\"></td>\n");
      out.write("                <td><p class=\"a\">or   <a href=\"page_register.jsp\" style=\"text-decoration: none\">Sign Up</a></p>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("            <input type=\"hidden\" name=\"index\" value=\"1\">\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
