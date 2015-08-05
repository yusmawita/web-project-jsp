package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JOptionPane;

public final class page_005fexam2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    String[][] question = (String[][])session.getAttribute("question");
    String[] answer = (String[])session.getAttribute("answer");
    int no_index = (Integer)session.getAttribute("no_index");
    String timeses = (String)session.getAttribute("timeses");
    JOptionPane.showMessageDialog(null,timeses);

      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <link href=\"css_exam.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Exam</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <script >\n");
      out.write("        <!--\n");
      out.write("        ");

            String clock = timeses;
        
      out.write("\n");
      out.write("            var timeout = ");
      out.print(clock);
      out.write("\n");
      out.write("            function timer(){\n");
      out.write("                if ( --timeout > 0){\n");
      out.write("                document.forma.clock.value = timeout;\n");
      out.write("                window.setTimeout(\"timer()\",1000);\n");
      out.write("                }\n");
      out.write("                else{\n");
      out.write("                    document.forma.clock.value = \"Time over\";\n");
      out.write("                }\n");
      out.write("                }\n");
      out.write("            </script> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"topdiv\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"25px\" width=\"1350px\"></td>\n");
      out.write("                <td width=\"150px\"><a href=\"http://localhost:8084/jspProject/ShowCon?index=1&userid=");
      out.print(id);
      out.write("\" style=\"text-decoration:none;\"><p class=\"a\">Hi,  \n");
      out.write("                    ");
      out.print(id);
      out.write("\n");
      out.write("                    \n");
      out.write("                    </p></a></td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("     </table> \n");
      out.write("                    </td>\n");
      out.write("                <tr>\n");
      out.write("                </tr>\n");
      out.write("                    <td height=\"150px\" width=\"500px\">\n");
      out.write("                        <p class=\"title\">\n");
      out.write("                          Examination \n");
      out.write("                        </p>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"1500px\" height=\"180px\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"1500px\" height=\"490px\">\n");
      out.write("                    <form action=\"");
      out.print(request.getRequestURL());
      out.write("\" name=\"forma\">\n");
      out.write("                        <input type=\"text\" name=\"clock\" value=\"");
      out.print(clock);
      out.write("\">\n");
      out.write("                    </form>\n");
      out.write("                    <script>\n");
      out.write("                        <!--\n");
      out.write("                        timer();\n");
      out.write("                \n");
      out.write("                    </script>\n");
      out.write("                    <form name=\"e2\" method=\"post\" action=\"http://localhost:8084/jspProject/ExamCon?index=3\">\n");
      out.write("                        <table border=\"0\" >\n");
      out.write("                            <tr>\n");
      out.write("                                <td  height=\"420px \" rowspan=\"3\" class=\"quest2\"><p class=\"quest\">");
      out.print((no_index+1));
      out.write(".</p></td>\n");
      out.write("                                <td  colspan=\"4\" class=\"quest2\"><p class=\"quest\">");
      out.print(question[no_index][1]);
      out.write("</p></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"quest2\" style=\"padding-top:10px\" width=\"25px\"><input  ");
if(answer[no_index].equals("A")) {
      out.write("checked");
}
      out.write(" type=\"radio\" name=\"ques");
      out.print((no_index+1));
      out.write("\" value=\"A\"></td>\n");
      out.write("                                <td class=\"quest2\" width=\"700px\"><p class=\"quest\">");
      out.print(question[no_index][2]);
      out.write("</p></td>\n");
      out.write("                                \n");
      out.write("                                <td class=\"quest2\" style=\"padding-top:10px\" width=\"25px\"><input ");
if(answer[no_index].equals("C")) {
      out.write("checked");
}
      out.write(" type=\"radio\" name=\"ques");
      out.print((no_index+1));
      out.write("\" value=\"C\"></td>\n");
      out.write("                                <td class=\"quest2\" width=\"700px\"><p class=\"quest\">");
      out.print(question[no_index][4]);
      out.write("</p></td>\n");
      out.write("                                  \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"quest2\" style=\"padding-top:10px\"><input ");
if(answer[no_index].equals("B")) {
      out.write("checked");
}
      out.write(" type=\"radio\" name=\"ques");
      out.print((no_index+1));
      out.write("\" value=\"B\"></td>\n");
      out.write("                                <td class=\"quest2\"><p class=\"quest\">");
      out.print(question[no_index][3]);
      out.write("</p></td>\n");
      out.write("                                <td class=\"quest2\" style=\"padding-top:10px\" width=\"25px\"><input ");
if(answer[no_index].equals("D")) {
      out.write("checked");
}
      out.write(" type=\"radio\" name=\"ques");
      out.print((no_index+1));
      out.write("\" value=\"D\"></td>\n");
      out.write("                                <td class=\"quest2\"><p class=\"quest\">");
      out.print(question[no_index][5]);
      out.write("</p></td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            </table>\n");
      out.write("                            <table>\n");
      out.write("                            <tr>\n");
      out.write("                            <input type=\"hidden\" name=\"oper\" value=\"0\">\n");
      out.write("                            <td colspan=\"5\" height=\"40px\" width=\"1350px\"><center><input type=\"submit\" value=\"\" class=\"np\" formaction=\"http://localhost:8084/jspProject/ExamCon?index=3&oper=-1\" >&Tab;&Tab;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                                 <input type=\"submit\" value=\"\" class=\"nn\" formaction=\"http://localhost:8084/jspProject/ExamCon?index=3&oper=1\" ></center></td>\n");
      out.write("                            <td><input type=\"submit\" value=\"Submit\" class=\"button\" formaction=\"http://localhost:8084/jspProject/ExamCon?index=2\" >                                                    \n");
      out.write("                                \n");
      out.write("                        </tr>\n");
      out.write("                            \n");
      out.write("                            </table>\n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
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
