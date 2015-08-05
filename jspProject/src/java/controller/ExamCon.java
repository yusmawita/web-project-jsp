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
import Entity.exam;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Jefry
 */
@WebServlet(name = "ExamCon", urlPatterns = {"/ExamCon"})
public class ExamCon extends HttpServlet {

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
            ExamCon exe = new ExamCon();
            String index = (String)request.getParameter("index");
            String[][] question = new String[10][7];
            HttpSession session = request.getSession();
            if(index.equals("1")){  
            String op = (String)request.getParameter("chapter");
            
            
            String quesCode="";
            String colTitle="chapter";
            exam[] ex=null;
            
            if(op.equals("ch1")){
                quesCode="Q10";
                colTitle+="1";
            }
            else if(op.equals("ch2")){
                quesCode="Q20";
                colTitle+="2";
            }
            else if(op.equals("ch3")){
                quesCode="Q30";
                colTitle+="3";
            }
            else if(op.equals("ch4")){
                quesCode="Q40";
                colTitle+="4";
            }
            else if(op.equals("ch5")){
                quesCode="Q50";
                colTitle+="5";
            }
            else{
                quesCode="Q60";
                colTitle+="6";
            }
            ex = exe.getQuestionExam(quesCode);
            
            question = exe.conversion(ex,colTitle);
            
            String[] answer = new String[10];
                for(int i = 0; i < answer.length;i++){
                answer[i]=" ";
             }
            
            session.setAttribute("question",question);
            session.setAttribute("no_index", 0);
            session.setAttribute("answer", answer);
            session.setAttribute("timeses",1200);
            control=getServletContext().getRequestDispatcher("/page_exam2.jsp");
            control.forward(request, response);
            }
            else if(index.equals("2")){
                int counter = 0;
                String timestr = request.getParameter("timestr");
                question=(String[][])session.getAttribute("question");
                String[] answer = (String[])session.getAttribute("answer");
                int no_index = (Integer)session.getAttribute("no_index");
                String ans = (String)request.getParameter("ques"+(no_index+1));
                String[] corr = new String[10]; 
                String[][] feedback = new String[10][3];
                
                if(ans!=null){
                    answer[no_index] = ans;
                }
                
                for (int i = 0; i < question.length; i++) {
                    if(answer[i].equals(question[i][6])){
                        feedback[i][0] = " ";
                        feedback[i][1] = " ";
                        feedback[i][2] = " ";
                        corr[i] = "True";
                        counter++;
                        }
                    else{
                        feedback[i][0] = question[i][1];
                        if(question[i][6].equals("A")){
                            feedback[i][1] = question[i][2];
                        }
                        else if(question[i][6].equals("B")){
                            feedback[i][1] = question[i][3];
                        }
                        else if(question[i][6].equals("C")){
                            feedback[i][1] = question[i][4];
                        }
                        else if(question[i][6].equals("D")){
                            feedback[i][1] = question[i][5];
                        }
                        
                        if(answer[i].equals("A")){
                            feedback[i][2] = question[i][2];
                        }
                        else if(answer[i].equals("B")){
                            feedback[i][2] = question[i][3];
                        }
                        else if(answer[i].equals("C")){
                            feedback[i][2] = question[i][4];
                        }
                        else if(answer[i].equals("D")){
                            feedback[i][2] = question[i][5];
                        }
                        else{
                            feedback[i][2] = "no answer";
                        }
                        corr[i] = "False";
                    }
                }
                
                counter=counter*10;
                String[][] temp = (String[][])session.getAttribute("question");
                String check = temp[0][0].substring(0,2);
                String message = "";
                String message2="";
                String userid = (String)session.getAttribute("userid");
                if(counter>=80){
                    message2 = "Passed";
                }
                else{
                    message2 = "Failed";
                }
                
                
                int a = exe.storeResult(userid, timestr, counter, check);
                message = "Your score for ";
                if(check.equals("Q1")) message +="Chapter 1 ";
                if(check.equals("Q2")) message +="Chapter 2 ";
                if(check.equals("Q3")) message +="Chapter 3 ";
                if(check.equals("Q4")) message +="Chapter 4 ";
                if(check.equals("Q5")) message +="Chapter 5 ";
                if(check.equals("Q6")) message +="Chapter 6 ";
                
                
                message+=" examination is "+counter;
                
                for (int i = 0; i < answer.length; i++) {
                    answer[i]= "";
                }
                String[] status = new String[6];
                status = exe.resultStatus(userid);
                session.setAttribute("resultStatus",status);
                session.setAttribute("answer",answer);
                request.setAttribute("feedback",feedback);
                request.setAttribute("resultmes", message);
                request.setAttribute("resultmes2",message2);
                control=getServletContext().getRequestDispatcher("/page_examResult.jsp");
                control.forward(request, response);
                
            }
            else if(index.equals("3")){
                int timerem = Integer.parseInt(request.getParameter("timerem"));
                session.setAttribute("timeses", timerem);
                int oper = Integer.parseInt(request.getParameter("oper"));
                int no_index = (Integer)session.getAttribute("no_index");
                String ans = (String)request.getParameter("ques"+(no_index+1));
                String[] answer = (String[])session.getAttribute("answer");
                if(ans!=null){
                    answer[no_index] = ans;
                }
                
                if(oper==1 && no_index <9){
                    no_index = no_index+1;
                    session.setAttribute("no_index",no_index);
                }
                else if(oper==-1 && no_index > 0){
                    no_index = no_index-1;
                    session.setAttribute("no_index",no_index);
                }
                
                control=getServletContext().getRequestDispatcher("/page_exam2.jsp");
                control.forward(request, response);
            }
            
        } finally {            
            out.close();
        }
    }
    
   public exam[] getQuestionExam(String a){
   exam[] question = null;
   exam tempExam = null;
   ArrayList listQuestion = new ArrayList();
       
   Connection con=null;
   ResultSet rs = null;
   String id="";
   koneksi conn = new koneksi();
   String sql="Select * from exam where id_question like '"+a+"%'";
   
   try{
       con=conn.connect();
       rs=conn.executeQuery(sql);
       
       while(rs.next()){
           tempExam = new exam();
           tempExam.setquestionid(rs.getString("id_question"));
           tempExam.setquestion(rs.getString("question"));
           tempExam.setanswer(rs.getString("answer"));
           tempExam.settype(rs.getString("type"));
           listQuestion.add(tempExam);
       }
       
       question = new exam[listQuestion.size()];
       listQuestion.toArray(question);
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
           return question;
           }
       catch(SQLException e){
           e.printStackTrace();
           return null;
       }
   }
}
   
   public int storeResult(String userid, String timestr, int score, String check){
   
   DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
   Calendar date = Calendar.getInstance();
   String myDate =  dateFormat.format(date.getTime());
   
   
   String a = checkResult(userid,check);
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;
   String sql="";
   String status ="";
   if(score>=80){
       status="Passed";
   }
   else{
       status="Failed";
   }
   if(!a.equals(userid)){
     sql = "insert into result  values('"+userid+"','"+check+"','"+score+"','"+myDate+"','"+timestr+"','1','"+status+"')"; 
   }
   else{
      sql = "update result set score='"+score+"', taken_date='"+myDate+"', totaltime='"+timestr+"', times=times+1, status='"+status+"' where userid='"+userid+"' and chapterid='"+check+"'";
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
   
   public String checkResult(String userid, String chapter){
   Connection con=null;
   ResultSet rs = null;
   String id="";
   koneksi conn = new koneksi();
   String sql="Select * from result where userid='"+userid+"' and chapterid='"+chapter+"'";
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
           return "a";
       }
   }
   
}
   
public int checkQuestionID(String colTitle){
   Connection con=null;
   ResultSet rs = null;
   int a = 0;
   koneksi conn = new koneksi();
   String sql="Select * from chapter";
   try{
       con=conn.connect();
       rs=conn.executeQuery(sql); 
       if(rs.next()){
           a = Integer.parseInt(rs.getString(colTitle));
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
           return a;
           }
       catch(SQLException e){
           e.printStackTrace();
           return a;
       }
   }
   
}
   
public String[][] conversion(exam[] obj,String colTitle){
 int lastIndex = checkQuestionID(colTitle);
 int[] a = new int[10];
 String[][] q = new String[10][7];
    for (int i = 0; i < a.length; i++) {
        int b=(int)(Math.random()*lastIndex);
        boolean flag=true;
        for (int j = 0; j <= i; j++) {
            if(a[j]==b){
                flag=false;
                break;
            } 
        }
        if(flag==true){
            a[i]=b;
        }
        else{
            i--;
        }   
    }
  
    for (int i = 0; i < q.length; i++) {
        q[i][0] = obj[a[i]].getquestionid();
        String[] temp = obj[a[i]].getquestion().split("&");
        for (int j = 1; j <= temp.length; j++) {
           q[i][j] = temp[j-1];      
        }
        q[i][6] = obj[a[i]].getanswer();
     }
 return q;
  
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
