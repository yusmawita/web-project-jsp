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
import Entity.thread;
import Entity.comment;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Jefry
 */
@WebServlet(name = "ForumCon", urlPatterns = {"/ForumCon"})
public class ForumCon extends HttpServlet {

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
            ForumCon exe = new ForumCon();
            HttpSession session = request.getSession();
            String index = request.getParameter("index");
            String index2 = request.getParameter("index2");
            String userid = (String)session.getAttribute("userid");
            if(index.equals("1")){
            thread[]  dThread= getThread(index2);
            String[][] dataThread = new String[dThread.length][8];
                for (int i = 0; i < dataThread.length; i++) {
                    dataThread[i][0] = dThread[i].getthreadid();
                    dataThread[i][1] = dThread[i].getTitle();
                    dataThread[i][2] = dThread[i].getContent();
                    dataThread[i][3] = dThread[i].getcreatedate();
                    dataThread[i][4] = dThread[i].getlastpostdate();
                    dataThread[i][5] = dThread[i].getUserid();
                    dataThread[i][6] = ""+dThread[i].getView();
                    dataThread[i][7] = ""+dThread[i].getComment();
                }
            session.setAttribute("thread",dataThread);
            control=getServletContext().getRequestDispatcher("/page_forum.jsp");
            control.forward(request, response);    
            }
            else if(index.equals("2")){
            String title = (String)request.getParameter("title");
            String content = (String)request.getParameter("content");
            int b = createThread(title,content,userid);
            
            thread[]  dThread= getThread(index2);
            String[][] dataThread = new String[dThread.length][8];
                for (int i = 0; i < dataThread.length; i++) {
                    dataThread[i][0] = dThread[i].getthreadid();
                    dataThread[i][1] = dThread[i].getTitle();
                    dataThread[i][2] = dThread[i].getContent();
                    dataThread[i][3] = dThread[i].getcreatedate();
                    dataThread[i][4] = dThread[i].getlastpostdate();
                    dataThread[i][5] = dThread[i].getUserid();
                    dataThread[i][6] = ""+dThread[i].getView();
                    dataThread[i][7] = ""+dThread[i].getComment();
                }
            session.setAttribute("thread",dataThread);
            control=getServletContext().getRequestDispatcher("/page_forum.jsp");
            control.forward(request, response);   
            }
            else if(index.equals("3")){
                int threadno = Integer.parseInt(request.getParameter("threadno"));
                int threadid = Integer.parseInt(request.getParameter("threadid"));
                String id = (String)session.getAttribute("userid");
                
                comment[] dComment= getComment(threadid);
                String[][] dataComment = new String[dComment.length][3];
                for (int i = 0; i < dataComment.length; i++) {
                    dataComment[i][0] = dComment[i].getUserid();
                    dataComment[i][1] = dComment[i].getcomment();
                    dataComment[i][2] = dComment[i].getcommentdate();
                }
                
                
                thread[]  dThread= getThread(index2);
                String[][] dataThread = new String[dThread.length][8];
                for (int i = 0; i < dataThread.length; i++) {
                    dataThread[i][0] = dThread[i].getthreadid();
                    dataThread[i][1] = dThread[i].getTitle();
                    dataThread[i][2] = dThread[i].getContent();
                    dataThread[i][3] = dThread[i].getcreatedate();
                    dataThread[i][4] = dThread[i].getlastpostdate();
                    dataThread[i][5] = dThread[i].getUserid();
                    dataThread[i][6] = ""+dThread[i].getView();
                    dataThread[i][7] = ""+dThread[i].getComment();
                }
                session.setAttribute("thread",dataThread);
                session.setAttribute("comment",dataComment);
                request.setAttribute("threadno", threadno);
                request.setAttribute("threadid", threadid);
                control=getServletContext().getRequestDispatcher("/page_comment.jsp");
                control.forward(request, response);
                
            }
            else if(index.equals("4")){
                int threadid = Integer.parseInt(request.getParameter("threadid"));
                int threadno = Integer.parseInt(request.getParameter("threadno"));
                String comment = request.getParameter("content");
                int a = storeComment(userid,threadid,comment);
                int b = updateComment(threadid);
                int c = updateLastDate(threadid);
                control=getServletContext().getRequestDispatcher("/ForumCon?index=3&index2=1&threadno="+threadno+"&threadid="+threadid);
                control.forward(request, response);
            }
            
        } finally {            
            out.close();
        }
    }
  public int storeComment(String userid, int threadid,String comment){
   
   DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
   Calendar date = Calendar.getInstance();
   String myDate =  dateFormat.format(date.getTime());
   
   comment=comment.replaceAll("'","");
   
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;
   String sql="insert into comment values('"+threadid+"','"+userid+"','"+comment+"','"+myDate+"')";
   try{
       conn.disconnect();
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
      
   public comment[] getComment(int threadid){
   comment[] dataComment = null;
   comment tempComment = null;
   ArrayList listComment = new ArrayList();
   
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   String sql = "Select * from comment where id_thread='"+threadid+"'";

   try{
       con=conn.connect();
       rs=conn.executeQuery(sql); 
       while(rs.next()){
           tempComment = new comment();
           tempComment.setUserid(rs.getString("userid"));
           tempComment.setcomment(rs.getString("comment"));
           tempComment.setcommentdate(rs.getString("comment_date")); 
           listComment.add(tempComment);
       }
       dataComment = new comment[listComment.size()];
       listComment.toArray(dataComment);
       int b = updateView(threadid);
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
           return dataComment;
           }
       catch(SQLException e){
           e.printStackTrace();
           return dataComment;
       }
   }
} 
   public int updateComment(int threadid){
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;
   String sql = "update thread set tcomment=tcomment+1 where id_thread='"+threadid+"'";
   
   try{
       conn.disconnect();
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
     
   public int updateLastDate(int threadid){
   
   DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
   Calendar date = Calendar.getInstance();
   String myDate =  dateFormat.format(date.getTime());
       
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;
   String sql = "update thread set lastdate='"+myDate+"' where id_thread='"+threadid+"'";
   
   try{
       conn.disconnect();
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
     
   public int updateView(int threadid){
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;
   String sql = "update thread set tview=tview+1 where id_thread='"+threadid+"'";
   
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
   
   public thread[] getThread(String index2){
   thread[] dataThread = null;
   thread tempThread = null;
   ArrayList listThread = new ArrayList();
   
   Connection con=null;
   ResultSet rs = null;
   int count = 1;
   String id="";
   koneksi conn = new koneksi();
   String sql = "";
   
   if(index2.equals("1")){
       count = getCount();
       int newCount = (int)count/10;
       count = newCount+1;
       
       
       sql="Select * from thread where id_thread >= '"+count+"'";
   }
   else{
       sql="Select * from thread";
   }
   
   try{
       con=conn.connect();
       rs=conn.executeQuery(sql); 
       while(rs.next()){
           tempThread = new thread();
           tempThread.setthreadid(rs.getString("id_thread"));
           tempThread.setTitle(rs.getString("title"));
           tempThread.setContent(rs.getString("contenta"));
           tempThread.setcreatedate(rs.getString("createdate"));
           tempThread.setlastpostdate(rs.getString("lastdate"));
           tempThread.setUserid(rs.getString("userid"));
           tempThread.setView(Integer.parseInt(rs.getString("tview")));
           tempThread.setComment(Integer.parseInt(rs.getString("tcomment")));
           listThread.add(tempThread);
       }
       dataThread = new thread[listThread.size()];
       listThread.toArray(dataThread);
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
           return dataThread;
           }
       catch(SQLException e){
           e.printStackTrace();
           return dataThread;
       }
   }
}
   
   public int getCount(){
   Connection con=null;
   ResultSet rs = null;
   int count = 1;
   koneksi conn = new koneksi();
   String sql="SELECT COUNT(*) AS count FROM thread";
   
   try{
       con=conn.connect();
       rs=conn.executeQuery(sql); 
       if(rs.next()){
           count = Integer.parseInt(rs.getString("count"));
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
           return count;
           }
       catch(SQLException e){
           e.printStackTrace();
           return count;
       }
   }
}

   public int createThread(String title, String content,String userid){
   
   DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
   Calendar date = Calendar.getInstance();
   String myDate =  dateFormat.format(date.getTime());
   
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;
   String sql="insert into thread(title,contenta,createdate,lastdate,userid,tview,tcomment)  values('"+title+"','"+content+"','"+myDate+"','"+myDate+"','"+userid+"','0','0')";
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
