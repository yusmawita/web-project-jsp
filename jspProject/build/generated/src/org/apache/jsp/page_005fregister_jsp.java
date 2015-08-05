package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.swing.*;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;

public final class page_005fregister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
  String counter=(String)request.getAttribute("counter");
    String err2 =(String)request.getAttribute("err_userid");
    String err3 =(String)request.getAttribute("err_pass1");
    String err4 =(String)request.getAttribute("err_pass2");
    String err6 =(String)request.getAttribute("err_match");
    
    String fullname = request.getParameter("fullname");
    String userid = request.getParameter("userid");
    String email = request.getParameter("email");
    String location = request.getParameter("location");
    String bio = request.getParameter("bio");
    
    boolean flag = true;
    if(err2!=null || err3!=null || err4!=null | err6!=null){
        flag=false;
    }    

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css_register.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table border=\"0\">\n");
      out.write("            <tr><td height=\"200px\" width=\"1500px\"></td></tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        <table border=\"0\">  \n");
      out.write("        <tr>\n");
      out.write("        <td width=\"300px\"></td>\n");
      out.write("        <td height=\"400px\" width=\"1500px\">\n");
      out.write("        <center>\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <form action=\"http://localhost:8084/jspProject/UserCon\" method=\"post\">\n");
      out.write("                        <table border=\"0\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td height=\"10px\"></td>\n");
      out.write("                            </tr>    \n");
      out.write("                            <tr>\n");
      out.write("                                <td width=\"200px\"><p class=\"a\">Full Name</p></td>\n");
      out.write("                                <td width=\"10px\">:</td>\n");
      out.write("                                <td width=\"225px\" height=\"40px\">\n");
      out.write("                                <input required type=\"text\" name=\"fullname\" ");
 if(!flag && fullname!=null){
      out.write(" value=\"");
      out.print(fullname);
      out.write('"');
      out.write(' ');
}
      out.write("></td>\n");
      out.write("                                <td><p class=\"b\">*</p></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><p class=\"a\">User ID</p></td>\n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td height=\"40px\" ><input ");
 if(err2!=null){
      out.write(" class=\"er\" ");
}
      out.write(" required type=\"text\" name=\"userid\" ");
 if(err2==null && userid!=null){
      out.write(" value=\"");
      out.print(userid);
      out.write('"');
      out.write(' ');
}
      out.write("></td>\n");
      out.write("                                <td><p class=\"b\">*</p></td>\n");
      out.write("                                <td width=\"240px\"><p class=\"b\">");
 if(err2!=null){
      out.write("UserID is already being used");
}
      out.write("</p></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><p class=\"a\">Password</p></td>\n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td height=\"40px\"><input  ");
 if(err3!=null || err6!=null){
      out.write(" class=\"er\" ");
}
      out.write(" required type=\"password\" name=\"password1\" ></td>\n");
      out.write("                                <td><p class=\"b\">**</p></td>\n");
      out.write("                                <td rowspan=\"2\" width=\"240px\"><p class=\"b\">\n");
      out.write("                                                                ");
 if(err3!=null || err6!=null || err4!=null){
      out.write("\n");
      out.write("                                                                Invalid password or password didn't match<br>\n");
      out.write("                                                                Check again your password ");
}
      out.write("\n");
      out.write("                            \n");
      out.write("                                                               </p></td>\n");
      out.write("                            </tr>\n");
      out.write("                \n");
      out.write("                            <tr>\n");
      out.write("                                <td><p class=\"a\">Re-Type Password</p></td>\n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td height=\"40px\"><input  ");
 if(err4!=null || err6!=null){
      out.write(" class=\"er\" ");
}
      out.write(" required type=\"password\" name=\"password2\"></td>\n");
      out.write("                                <td><p class=\"b\">**</p></td>\n");
      out.write("                            </tr>\n");
      out.write("                \n");
      out.write("                            <tr>\n");
      out.write("                                <td><p class=\"a\">Gender</p></td>\n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td height=\"40px\"><select name=\"gender\"><option value=\"Male\">Male<option value=\"Female\">Female</select></td>\n");
      out.write("                                <td></td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td><p class=\"a\">Location</p></td>\n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td height=\"40px\"><input required type=\"text\" name=\"location\" ");
 if(!flag && location!=null){
      out.write(" value=\"");
      out.print(location);
      out.write('"');
      out.write(' ');
}
      out.write("></td>\n");
      out.write("                                <td>\n");
      out.write("                                <p class=\"b\">*</p>    \n");
      out.write("                        \n");
      out.write("                                </td>\n");
      out.write("                                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                            <tr>\n");
      out.write("                                <td><p class=\"a\">Email</p></td>\n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td height=\"40px\" ><input required type=\"email\" name=\"email\"");
 if(!flag && email!=null){
      out.write(" value=\"");
      out.print(email);
      out.write('"');
      out.write(' ');
}
      out.write("></td>\n");
      out.write("                                <td><p class=\"b\">*</p></td>\n");
      out.write("                            </tr>\n");
      out.write("                \n");
      out.write("                            <tr>\n");
      out.write("                                <td height=\"40px\" width=\"250px\"><p class=\"a\">Bio</p></td>\n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td ><textarea name=\"bio\">");
 if(!flag && bio!=null){
      out.print(bio);
      out.write(' ');
}
      out.write("</textarea></td>\n");
      out.write("                                <td></td>\n");
      out.write("                            </tr>\n");
      out.write("                 \n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td height=\"45px\" colspan=\"2\"><input type=\"submit\" value=\"Register\" class=\"button\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class=\"button\" type=\"reset\" value=\"Reset\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td height=\"10px\" colspan=\"4\"><p class=\"b\">*) Mandatory<br>**) Must be at least 5 alphanumeric characters</p></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        <input type=\"hidden\" name=\"index\" value=\"2\">\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </center>                \n");
      out.write("        </td></tr>\n");
      out.write("        </table>   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
