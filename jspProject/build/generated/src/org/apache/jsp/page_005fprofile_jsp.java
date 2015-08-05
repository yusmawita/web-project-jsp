package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entity.member;

public final class page_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String id = (String)session.getAttribute("userid");
    member Member = new member();
    Member = (member)request.getAttribute("dataMember");
    String fullname = Member.getName();
    String gender = Member.getGender();
    String location = Member.getLocation();
    String email = Member.getEmail();
    String bio = Member.getBio();
    

      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <link href=\"profile_css.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"1500px\" height=\"670px\">\n");
      out.write("                    \n");
      out.write("                    <table border=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td height=\"170px\">\n");
      out.write("                                <table border=\"0\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td height=\"150px\" width=\"180px\"></td>\n");
      out.write("                                        <td height=\"150px\" width=\"180px\"></td>\n");
      out.write("                                        <td height=\"150px\" width=\"180px\"></td>\n");
      out.write("                                        <td height=\"150px\" width=\"180px\"></td>\n");
      out.write("                                        <td height=\"150px\" width=\"180px\"><a href=\"page_home.jsp\" class=\"picture\"><img class=\"button\" src=\"picture/home_button.png\"></a></td>\n");
      out.write("                                        <td height=\"150px\" width=\"180px\"><a href=\"page_index.jsp\" class=\"picture\"><img class=\"button\" src=\"picture/index_button.png\"></a></td>\n");
      out.write("                                        <td height=\"150px\" width=\"180px\"><a href=\"page_forum.jsp\" class=\"picture\"><img class=\"button\" src=\"picture/forum_button.png\"></a></td>\n");
      out.write("                                        <td height=\"150px\" width=\"180px\"><a href=\"page_exam.jsp\" class=\"picture\"><img class=\"button\" src=\"picture/exam_button.png\"></a></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                                \n");
      out.write("                            </td>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td height=\"100px\"></td>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td height=\"290px\">\n");
      out.write("                             \n");
      out.write("                                <table border=\"0\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td height=\"52px\" rowspan=\"5\" width=\"25px\"></td>\n");
      out.write("                                        <td height=\"52px\" rowspan=\"5\" width=\"250px\">\n");
      out.write("                                            <img src=\"pictureBase/rosidah88.jpg\" class=\"pict\">    \n");
      out.write("                                         \n");
      out.write("                                        </td>\n");
      out.write("                                        <td height=\"52px\" rowspan=\"5\" width=\"15px\"></td>\n");
      out.write("                                        <td height=\"52px\" width=\"120px\"><p class=\"a\">User ID</p></td>\n");
      out.write("                                        <td width=\"10px\"><p class=\"a\">:</p></td>\n");
      out.write("                                        <td width=\"220px\"><p class=\"a\">");
      out.print(id);
      out.write("</p></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td height=\"52px\"><p class=\"a\">Name</p></td>\n");
      out.write("                                        <td width=\"10px\"><p class=\"a\">:</p></td>\n");
      out.write("                                        <td width=\"220px\"><p class=\"a\">");
      out.print(fullname);
      out.write("</p></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td height=\"52px\"><p class=\"a\">Gender</p></td>\n");
      out.write("                                        <td width=\"10px\"><p class=\"a\">:</p></td>\n");
      out.write("                                        <td width=\"220px\"><p class=\"a\">");
      out.print(gender);
      out.write("</p></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td height=\"52px\"><p class=\"a\">Location</p></td>\n");
      out.write("                                        <td width=\"10px\"><p class=\"a\">:</p></td>\n");
      out.write("                                        <td width=\"220px\"><p class=\"a\">");
      out.print(location);
      out.write("</p></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td height=\"52px\"><p class=\"a\">Email</p></td>\n");
      out.write("                                        <td width=\"10px\"><p class=\"a\">:</p></td>\n");
      out.write("                                        <td width=\"220px\"><p class=\"a\">");
      out.print(email);
      out.write("</p></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    \n");
      out.write("                                </table>\n");
      out.write("                                \n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td height=\"80px\">\n");
      out.write("                                <table border=\"0\">\n");
      out.write("                                <tr>\n");
      out.write("                                        <td height=\"20px\" rowspan=\"2\" width=\"30px\"></td>\n");
      out.write("                                        <td height=\"20px\" width=\"120px\"><p class=\"a\">Bio :</p></td>\n");
      out.write("                                                                               \n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                       <td width=\"220px\" height=\"20px\"><p class=\"a\">");
      out.print(bio);
      out.write("</p></td>\n");
      out.write("                                </tr>\n");
      out.write("                                    \n");
      out.write("                               <table>\n");
      out.write("                                \n");
      out.write("                            </td>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
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
