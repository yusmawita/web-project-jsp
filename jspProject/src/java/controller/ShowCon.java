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
import Entity.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jefry
 */
@WebServlet(name = "ShowCon", urlPatterns = {"/ShowCon"})
public class ShowCon extends HttpServlet {

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
            
            String id=(String)session.getAttribute("userid");
            String index=(String)request.getParameter("index");
            
            result[] listResult = resultProfile(id);
            String[][] resultList = new String[6][4];
            
            for (int i = 0; i < resultList.length; i++) {
                resultList[i][0] = "-";
                resultList[i][1] = "-";
                resultList[i][2] = "-";
                resultList[i][3] = "-";
            }
            
            for (int i = 0; i < listResult.length; i++) {
                if(listResult[i].getChapterid().equals("Q1")){
                    resultList[0][0] = ""+listResult[i].getScore();
                    resultList[0][1] = ""+listResult[i].getTaken_date();
                    resultList[0][2] = ""+listResult[i].getTotaltime();
                    resultList[0][3] = ""+listResult[i].getTimes();
                    }
                else if(listResult[i].getChapterid().equals("Q2")){
                    resultList[1][0] = ""+listResult[i].getScore();
                    resultList[1][1] = ""+listResult[i].getTaken_date();
                    resultList[1][2] = ""+listResult[i].getTotaltime();
                    resultList[1][3] = ""+listResult[i].getTimes();
                    }
                else if(listResult[i].getChapterid().equals("Q3")){
                    resultList[2][0] = ""+listResult[i].getScore();
                    resultList[2][1] = ""+listResult[i].getTaken_date();
                    resultList[2][2] = ""+listResult[i].getTotaltime();
                    resultList[2][3] = ""+listResult[i].getTimes();
                    }
                else if(listResult[i].getChapterid().equals("Q4")){
                    resultList[3][0] = ""+listResult[i].getScore();
                    resultList[3][1] = ""+listResult[i].getTaken_date();
                    resultList[3][2] = ""+listResult[i].getTotaltime();
                    resultList[3][3] = ""+listResult[i].getTimes();
                    }
                else if(listResult[i].getChapterid().equals("Q5")){
                    resultList[4][0] = ""+listResult[i].getScore();
                    resultList[4][1] = ""+listResult[i].getTaken_date();
                    resultList[4][2] = ""+listResult[i].getTotaltime();
                    resultList[4][3] = ""+listResult[i].getTimes();
                    }
                else if(listResult[i].getChapterid().equals("Q6")){
                    resultList[5][0] = ""+listResult[i].getScore();
                    resultList[5][1] = ""+listResult[i].getTaken_date();
                    resultList[5][2] = ""+listResult[i].getTotaltime();
                    resultList[5][3] = ""+listResult[i].getTimes();
                    }
            }
            session.setAttribute("resultList",resultList);
            
            
            if(index.equals("1")){
                member user = new member();
                user = exe.MemberProfile(id);
                if(!id.equals("")){
                    request.setAttribute("dataMember",user);
                    control=getServletContext().getRequestDispatcher("/page_profile.jsp");
                    control.forward(request, response);
                }
            }
            
            else if(index.equals("2")){
                member user = new member();
                user = exe.MemberProfile(id);
                if(!id.equals("")){
                    request.setAttribute("dataMember",user);
                    control=getServletContext().getRequestDispatcher("/page_editprofile.jsp");
                    control.forward(request, response);
                }
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

public result[] resultProfile(String userid){
    result[] resultMember = null;
    result dataMember = null;
    ArrayList resultList = new ArrayList();
   
   Connection con=null;
   ResultSet rs = null;
   String id="";
   koneksi conn = new koneksi();
   String sql="Select * from result where userid='"+userid+"'";
   try{
       con=conn.connect();
       rs=conn.executeQuery(sql); 
       while(rs.next()){
           dataMember= new result();
           dataMember.setUserid(rs.getString("userid"));
           dataMember.setChapterid(rs.getString("chapterid"));
           dataMember.setScore(Integer.parseInt(rs.getString("score")));
           dataMember.setTaken_date(rs.getString("taken_date"));
           dataMember.setTotaltime(rs.getString("totaltime"));
           dataMember.setTimes(Integer.parseInt(rs.getString("times")));
           resultList.add(dataMember);
       }
       resultMember = new result[resultList.size()];
       resultList.toArray(resultMember);
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
           return resultMember;
           }
       catch(SQLException e){
           e.printStackTrace();
           return null;
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
