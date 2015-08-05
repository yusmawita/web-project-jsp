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
import Entity.member;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jefry
 */
@WebServlet(name = "EditCon", urlPatterns = {"/EditCon"})
public class EditCon extends HttpServlet {

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
            ShowCon exe = new ShowCon();
            HttpSession session = request.getSession();
            String index=(String)session.getAttribute("index");
            String index2=(String)request.getParameter("index2");
            String id=(String)session.getAttribute("userid");
            String id_pic=(String)session.getAttribute("id_pic");
            String fullname = (String)request.getParameter("fullname");
            String userid = request.getParameter("userid");
            String gender = request.getParameter("gender");
            String location = request.getParameter("location");
            String email = request.getParameter("email");
            String bio = request.getParameter("bio");
            String path = request.getParameter("path");
            
            if(index2!=null){
                index=index2;
            }
           if(index.equals("1")){
               
                member user = new member();
                user = exe.MemberProfile(id);
                
                if(!id.equals("")){
                    request.setAttribute("dataMember",user);
                    control=getServletContext().getRequestDispatcher("/page_editprofile.jsp");
                    control.forward(request, response);
                }
            }
           else if(index.equals("2")){
                int res = 0;
                member user = new member();
                res = UpdateMember(userid,fullname,gender,location,email,bio,id,id_pic,path);
                if(res!=0){
                    session.setAttribute("userid",userid);
                    user.setUserid(userid);
                    user.setName(fullname);
                    user.setGender(gender);
                    user.setLocation(location);
                    user.setEmail(email);
                    user.setBio(bio);
                    if(id_pic==null){
                       user.setPhoto(path);
                    }else{
                      user.setPhoto(id_pic);  
                    }
                    
                }
                
                    request.setAttribute("dataMember",user);
                    control=getServletContext().getRequestDispatcher("/page_profile.jsp");
                    control.forward(request, response);
                
            }
        } finally {            
            out.close();
        }
    }
public member MemberProfile(String userid){
   member dataMember = null;
   
   Connection con=null;
   ResultSet rs = null;
   String id="";
   koneksi conn = new koneksi();
   String sql="Select * from member where userid='"+userid+"'";
   try{
       conn.disconnect();
       con=conn.connect();
       rs=conn.executeQuery(sql); 
       if(rs.next()){
           dataMember= new member();
           dataMember.setUserid(rs.getString("userid"));
           dataMember.setName(rs.getString("name"));
           dataMember.setGender(rs.getString("gender"));
           dataMember.setEmail(rs.getString("email"));
           dataMember.setLocation(rs.getString("location"));
           dataMember.setBio(rs.getString("bio"));
           dataMember.setPhoto(rs.getString("path"));
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
           return dataMember;
           }
       catch(SQLException e){
           e.printStackTrace();
           return null;
       }
   }
}

public int UpdateMember(String userid, String fullname, String gender, String location, String email, String bio, String id,String id_pic,String path){
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;
   
   String sql="";
   if(id_pic==null){
    sql =   "update member set userid='"+userid+"', name='"+fullname+"', gender='"+gender+"', location='"+location+"', email='"+email+"', bio='"+bio+"', path='"+path+"' where userid='"+id+"'";
   }
   else{
     sql = "update member set userid='"+userid+"', name='"+fullname+"', gender='"+gender+"', location='"+location+"', email='"+email+"', bio='"+bio+"', path='"+id_pic+"' where userid='"+id+"'";
   }
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
