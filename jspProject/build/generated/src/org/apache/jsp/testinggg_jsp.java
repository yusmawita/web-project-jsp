package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.*;

public final class testinggg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
int ia = 0;
    
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function changeContent(y){\n");
      out.write("    var a = y;\n");
      out.write("document.getElementById(\"ch1_tit\").innerHTML=\"Handling Utensils\";\n");
      out.write("docuemnt.getElementById(\"oper\").value=10;\n");
      out.write("}\n");
      out.write("</script>    \n");
      out.write("                \n");
      out.write("                <form method=\"post\" action=\"javascript:changeContent(1);\">\n");
      out.write("                    <p id=\"ch1_tit\">\n");
      out.write("                        aaa\n");
      out.write("                    </p>\n");
      out.write("                    <input type=\"submit\">\n");
      out.write("                </form>\n");
      out.write("<a href=\"javascript:changeContent(-1);\">aaaa</a>\n");
      out.write("<input type=\"text\" value=\"0\" name=\"oper\">\n");
      out.write("<table border=\"1\">\n");
      out.write("    <tr>\n");
      out.write("        <td rowspan=\"3\" width=\"50px\">\n");
      out.write("            <p style=\"font-size: 30px\">aaaaaaaaaaaaa</p>\n");
      out.write("        </td>\n");
      out.write("        <td colspan=\"2\" width=\"50px\">aaaaaaaaa </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td width=\"50px\">aaaaaaaa</td>\n");
      out.write("        <td width=\"50px\">aaaaaa</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td width=\"50px\">aaaaaaa</td>\n");
      out.write("        <td width=\"50px\">aaaaaaaaaa</td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<input type=\"button\" style=\"background-image: picture/next_button.png\">\n");
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
