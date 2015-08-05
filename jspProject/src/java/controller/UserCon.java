/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import helper.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author Jefry
 */
@WebServlet(name = "UserCon", urlPatterns = {"/UserCon"})
public class UserCon extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            RequestDispatcher control=null;
            UserCon exe = new UserCon();
            HttpSession session = request.getSession();
            String index = request.getParameter("index");
            String[] status = new String[6];
            
            if(index.equals("1")){
                String userid = request.getParameter("userid");
                String pass = request.getParameter("password");
                
                if(userid.equals("adminEWS") && pass.equals("eatwithstyle")){
                    session.setAttribute("adminid","adminEWS");
                    control=getServletContext().getRequestDispatcher("/admin_home.jsp");
                    control.forward(request, response);
                }
                else{
                String id = exe.MemberLogin(userid, pass);
                if(!id.equals("")){
                    status = exe.resultStatus(userid);
                    session.setAttribute("resultStatus",status);
                    session.setAttribute("userid",id);
                    control=getServletContext().getRequestDispatcher("/page_home.jsp");
                    control.forward(request, response);
                }
                else{
                    request.setAttribute("message","Failed to Login");
                    request.setAttribute("counter","1");
                    control=getServletContext().getRequestDispatcher("/page_login.jsp");
                    control.forward(request, response);
                }
                }
            }
            
            else if(index.equals("2")){
                boolean flag=true;
                String fullname = request.getParameter("fullname");
                String userid = request.getParameter("userid");
                String pass1 = request.getParameter("password1");
                String pass2 = request.getParameter("password2");
                String gender = request.getParameter("gender");
                String location = request.getParameter("location");
                String email = request.getParameter("email");
                String bio = request.getParameter("bio");
                
                request.setAttribute("fullname",fullname);
                request.setAttribute("userid",userid);
                request.setAttribute("location",location);
                request.setAttribute("email",email);
                request.setAttribute("bio",bio);

                
                request.setAttribute("err_userid",null);
                request.setAttribute("err_pass1",null);
                request.setAttribute("err_pass2",null);
                request.setAttribute("err_match",null);
                
   for (int i = 0; i < pass1.length(); i++) {
    if(!Character.isLetterOrDigit(pass1.charAt(i))){
       flag=false;
       request.setAttribute("err_pass1","1");
    }                
   }
   for (int i = 0; i < pass2.length(); i++) {
    if(!Character.isLetterOrDigit(pass2.charAt(i))){
       flag=false;
       request.setAttribute("err_pass1","1");
    }                
   }
    if(pass1.equals("") || pass1.length()<5){
        flag=false;
        request.setAttribute("err_pass1","1");
    }
    if(pass2.equals("") || pass1.length()<5){
        flag=false;
        request.setAttribute("err_pass2","1");
    }
    if(!pass1.equals(pass2)){
        flag=false;
        request.setAttribute("err_match","1");
    }
    if(userid.equalsIgnoreCase("adminEWS")){
        flag=false;
        request.setAttribute("err_userid","1");
    }
    if(flag==false){
       control=getServletContext().getRequestDispatcher("/page_register.jsp");
       control.forward(request, response);
    }
    
    else{
        int a = exe.MemberRegister(userid, pass1, fullname, gender, location, email, bio);
        
        if(a==1){
            for (int i = 0; i < status.length; i++) {
               status[i]= " ";
            }
            session.setAttribute("resultStatus",status);
            session.setAttribute("userid",userid);
            control=getServletContext().getRequestDispatcher("/page_home.jsp");
            control.forward(request, response);   
        }
        else{
            request.setAttribute("err_userid","1");
            control=getServletContext().getRequestDispatcher("/page_register.jsp");
            control.forward(request, response);
            }
         
        }
            }
            else if(index.equals("99")){
            String msg= null;
            String counter = null;
            String userid = (String)session.getAttribute("userid");
            String comment = (String)request.getParameter("comment");
            int b = insertContact(userid,comment);
            if(b!=0){
                msg="Your message has been sent. Thank you for contact us";
                counter="1";
            }
            request.setAttribute("message",msg);
            request.setAttribute("counter",counter);
            control=getServletContext().getRequestDispatcher("/page_contact.jsp");
            control.forward(request, response);
            }
            else if(index.equals("100")){
            session.invalidate();
            control=getServletContext().getRequestDispatcher("/page_login.jsp");
            control.forward(request, response);
            }
            
            
        } finally {            
            out.close();
        }
    }
   
   public int insertContact(String userid, String comment){
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;
   String sql="insert into contact(userid,comment)  values('"+userid+"','"+comment+"')";
   try{
       con=conn.connect();
       b=conn.updateQuery(sql);    
   }
   catch(ClassNotFoundException e){
       e.printStackTrace();
   }
   catch(SQLException e){
       e.printStackTrace();
   }
   finally{
       try{
           conn.disconnect();
                      }
       catch(SQLException e){
           e.printStackTrace();
       }
   }
   return b;
} 
    
   public String MemberLogin(String userid, String password){
   Connection con=null;
   ResultSet rs = null;
   String id="";
   koneksi conn = new koneksi();
   String sql="Select * from member where userid='"+userid+"' and password='"+password+"'";
   try{
       con=conn.connect();
       rs=conn.executeQuery(sql); 
       if(rs.next()){
           id = rs.getString("userid");
       }   
       }
   catch(ClassNotFoundException e){
       e.printStackTrace();
   }
   catch(SQLException e){
       e.printStackTrace();
   }
   finally{
       try{
           conn.disconnect();
           return id;
           }
       catch(SQLException e){
           e.printStackTrace();
           return id;
       }
   }
}
   
   public int MemberRegister(String userid, String password,String fullname, String gender, String location, String email, String bio){
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;
   String pict = " ";
   if(gender.equals("Female")){
       pict="blank_female.jpg";
   }
   else{
       pict="blank_male.png";
   }
   String sql="insert into member  values('"+userid+"','"+password+"','"+fullname+"','"+pict+"','"+gender+"','"+location+"','"+email+"','"+bio+"')";
   try{
       con=conn.connect();
       b=conn.updateQuery(sql);    
   }
   catch(ClassNotFoundException e){
       e.printStackTrace();
   }
   catch(SQLException e){
       e.printStackTrace();
   }
   finally{
       try{
           conn.disconnect();
                      }
       catch(SQLException e){
           e.printStackTrace();
       }
   }
   return b;
}
   
   public String[] resultStatus(String userid){
   Connection con=null;
   ResultSet rs = null;
   String[] status= new String[6];
   koneksi conn = new koneksi();
   String sql="Select * from result where userid='"+userid+"'";
   try{
       con=conn.connect();
       rs=conn.executeQuery(sql); 
       while(rs.next()){
           if(rs.getString("chapterid").equals("Q1")){
           status[0] = rs.getString("status");}
           
           else if(rs.getString("chapterid").equals("Q2")){
           status[1] = rs.getString("status");}
           
           else if(rs.getString("chapterid").equals("Q3")){
           status[2] = rs.getString("status");}
           
           else if(rs.getString("chapterid").equals("Q4")){
           status[3] = rs.getString("status");}
           
           else if(rs.getString("chapterid").equals("Q5")){
           status[4] = rs.getString("status");}
           
           else if(rs.getString("chapterid").equals("Q6")){
           status[5] = rs.getString("status");}
       }
       }
   catch(ClassNotFoundException e){
       e.printStackTrace();
   }
   catch(SQLException e){
       e.printStackTrace();
   }
   finally{
       try{
           conn.disconnect();
           return status;
           }
       catch(SQLException e){
           e.printStackTrace();
           return status;
       }
   }
}
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
