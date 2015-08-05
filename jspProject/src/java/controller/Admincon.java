/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Entity.comment;
import Entity.contact;
import Entity.exam;
import Entity.member;
import Entity.thread;
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
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jefry
 */
@WebServlet(name = "Admincon", urlPatterns = {"/Admincon"})
public class Admincon extends HttpServlet {

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
            Admincon exe = new Admincon();
            HttpSession session = request.getSession();
            String index = request.getParameter("index");
            String[] status = new String[6];
            if(index.equals("1")){
                
                String adminid = request.getParameter("adminid");
                contact[] dContact = exe.getContact();
                String[][] dataContact = new String[dContact.length][3];
                for (int i = 0; i < dataContact.length; i++) {
                    dataContact[i][0] = dContact[i].getUserid();
                    dataContact[i][1] = dContact[i].getComment();
                    dataContact[i][2] = ""+dContact[i].getContactid();
                    
                }
                session.setAttribute("dataContact",dataContact);
                control=getServletContext().getRequestDispatcher("/admin_contact.jsp");
                control.forward(request, response); 
            }
            else if(index.equals("2")){
                String contactid = request.getParameter("contactid");
                int b = exe.deleteContact(contactid);
                control=getServletContext().getRequestDispatcher("/Admincon?index=1");
                control.forward(request, response);
            }
            
            else if(index.equals("3")){
            String index2 = request.getParameter("index2");
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
            control=getServletContext().getRequestDispatcher("/admin_thread.jsp");
            control.forward(request, response);    
            }
            else if(index.equals("4")){
                int threadid = Integer.parseInt(request.getParameter("threadid"));
                int b = exe.deleteThread(""+threadid);
                control=getServletContext().getRequestDispatcher("/Admincon?index=3&index2=1");
                control.forward(request, response);
            }
            else if(index.equals("5")){
                int threadno = Integer.parseInt(request.getParameter("threadno"));
                int threadid = Integer.parseInt(request.getParameter("threadid"));
                
                comment[] dComment= getComment(threadid);
                String[][] dataComment = new String[dComment.length][4];
                for (int i = 0; i < dataComment.length; i++) {
                    dataComment[i][0] = dComment[i].getUserid();
                    dataComment[i][1] = dComment[i].getcomment();
                    dataComment[i][2] = dComment[i].getcommentdate();
                    dataComment[i][3] = dComment[i].getCommentid();
                }
                
                session.setAttribute("comment",dataComment);
                request.setAttribute("threadno", threadno);
                request.setAttribute("threadid", threadid);
                control=getServletContext().getRequestDispatcher("/admin_comment.jsp");
                control.forward(request, response);
                
            }
            else if(index.equals("6")){
                String commentid = request.getParameter("commentid");
                int threadno = Integer.parseInt(request.getParameter("threadno"));
                int threadid = Integer.parseInt(request.getParameter("threadid"));
                int a = exe.deleteComment(commentid);
                int b = exe.updateComment(threadid);
                
                String[][] dataThread= (String[][])session.getAttribute("thread");
                dataThread[threadno][7] = ""+(Integer.parseInt(dataThread[threadno][7])-1);
                request.setAttribute("thread",dataThread);
                request.setAttribute("threadno", threadno);
                request.setAttribute("threadid", threadid);
                control=getServletContext().getRequestDispatcher("/Admincon?index=5&index2=1&threadno="+threadno+"&threadid="+threadid);
                control.forward(request, response);
            }
            else if(index.equals("7")){
                member[] dMember = getMember();
                String[][] dataMember = new String[dMember.length][8];
                for (int i = 0; i < dataMember.length; i++) {
                    dataMember[i][0] = dMember[i].getUserid();
                    dataMember[i][1] = dMember[i].getName();
                    dataMember[i][2] = dMember[i].getPassword();
                    dataMember[i][3] = dMember[i].getPhoto();
                    dataMember[i][4] = dMember[i].getGender();
                    dataMember[i][5] = dMember[i].getLocation();
                    dataMember[i][6] = dMember[i].getEmail();
                    dataMember[i][7] = dMember[i].getBio();
                }
                
                session.setAttribute("dataMember", dataMember);
                control=getServletContext().getRequestDispatcher("/admin_member.jsp");
                control.forward(request, response);
            }
            else if(index.equals("8")){
                String userid = request.getParameter("userid");
                int a = exe.deleteMember(userid);
                int b = exe.deleteResult(userid);
                control=getServletContext().getRequestDispatcher("/Admincon?index=7");
                control.forward(request, response);
            }
            else if(index.equals("9")){
                String userid = request.getParameter("userid");
                member[] dMember = getMemberByID(userid);
                String[][] dataMember = new String[dMember.length][8];
                for (int i = 0; i < dataMember.length; i++) {
                    dataMember[i][0] = dMember[i].getUserid();
                    dataMember[i][1] = dMember[i].getName();
                    dataMember[i][2] = dMember[i].getPassword();
                    dataMember[i][3] = dMember[i].getPhoto();
                    dataMember[i][4] = dMember[i].getGender();
                    dataMember[i][5] = dMember[i].getLocation();
                    dataMember[i][6] = dMember[i].getEmail();
                    dataMember[i][7] = dMember[i].getBio();
                }
                
                session.setAttribute("dataMember", dataMember);
                control=getServletContext().getRequestDispatcher("/admin_member.jsp");
                control.forward(request, response); 
            }
            
            else if(index.equals("10")){
             String op = (String)request.getParameter("chapter");
             String[][] question = new String[10][7];
             String quesCode="";
             exam[] ex=null;
            
            if(op.equals("ch1")){
                quesCode="Q10";
            }
            else if(op.equals("ch2")){
                quesCode="Q20";
            }
            else if(op.equals("ch3")){
                quesCode="Q30";
            }
            else if(op.equals("ch4")){
                quesCode="Q40";
            }
            else if(op.equals("ch5")){
                quesCode="Q50";
            }
            else{
                quesCode="Q60";
            }
            
            ex = exe.getQuestionExam(quesCode);
            question = exe.conversion(ex);
            request.setAttribute("counter","1");
            session.setAttribute("op", op);
            session.setAttribute("question",question);
            control=getServletContext().getRequestDispatcher("/admin_question.jsp");
            control.forward(request, response);
            
            }
            else if(index.equals("11")){
                 int questno = (Integer.parseInt(request.getParameter("questno")));
                 String op = (String)session.getAttribute("op");
                 String questid = (String)request.getParameter("questid");
                 String squestion = (String)request.getParameter("squestion");
                 String answera = "&A. "+((String)request.getParameter("answera").replaceAll("'",""));
                 String answerb = "&B. "+((String)request.getParameter("answerb").replaceAll("'",""));
                 String answerc = "&C. "+((String)request.getParameter("answerc").replaceAll("'",""));
                 String answerd = "&D. "+((String)request.getParameter("answerd").replaceAll("'",""));
                 String sanswer = (String)request.getParameter("sanswer").toUpperCase();
                 squestion = squestion + answera+answerb+answerc+answerd;
                 int a = exe.updateQuestion(questid, squestion, sanswer);
                 control=getServletContext().getRequestDispatcher("/Admincon?index=10&chapter="+op);
                 control.forward(request, response);
            }
            else if(index.equals("12")){
                String questid = (String)request.getParameter("questid");
                String op = (String)session.getAttribute("op");
                int a = exe.deleteQuestion(questid);
                control=getServletContext().getRequestDispatcher("/Admincon?index=10&chapter="+op);
                control.forward(request, response);
            }
            else if(index.equals("13")){
                String op = (String)session.getAttribute("op");
                 String questid = (String)request.getParameter("questid");
                 String squestion = (String)request.getParameter("squestion");
                 String answera = "&A. "+((String)request.getParameter("answera").replaceAll("'",""));
                 String answerb = "&B. "+((String)request.getParameter("answerb").replaceAll("'",""));
                 String answerc = "&C. "+((String)request.getParameter("answerc").replaceAll("'",""));
                 String answerd = "&D. "+((String)request.getParameter("answerd").replaceAll("'",""));
                 String sanswer = (String)request.getParameter("sanswer").toUpperCase();
                 squestion = squestion + answera+answerb+answerc+answerd;
                 
                 String colTitle = "";
                 String questionid = "";
                 if(op.equals("ch1")){
                colTitle="chapter1";
                questionid = "Q1";
                }
                else if(op.equals("ch2")){
                colTitle="chapter2";
                questionid = "Q2";
                }
                else if(op.equals("ch3")){
                colTitle="chapter3";
                questionid = "Q3";
                 }
                else if(op.equals("ch4")){
                colTitle="chapter4";
                questionid = "Q4";
                }
                else if(op.equals("ch5")){
                colTitle="chapter5";
                questionid = "Q5";
                }
                else{
                colTitle="chapter6";
                questionid = "Q6";
                }
                 
                int lastIndex = exe.getQuestionID(colTitle);
                if(lastIndex>=100){
                    
                }else if(lastIndex>=10){
                    questionid+="0";
                }
                else if(lastIndex>=1){
                    questionid+="00";
                }
                questionid += ""+(lastIndex+1);
                int a = exe.insertQuestion(questionid, squestion, sanswer);
                int b = exe.updateChapter(colTitle);
                 control=getServletContext().getRequestDispatcher("/Admincon?index=10&chapter="+op);
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
   
   public String[][] conversion(exam[] obj){

   String[][] q = new String[obj.length][7];

   for (int i = 0; i < q.length; i++) {
        q[i][0] = obj[i].getquestionid();
        String[] temp = obj[i].getquestion().split("&");
        for (int j = 1; j <= temp.length; j++) {
           q[i][j] = temp[j-1];      
        }
        q[i][6] = obj[i].getanswer();
     }
    return q;
  
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
   
   public member[] getMember(){
   member[] dataMember = null;
   member tempMember = null;
   ArrayList listMember = new ArrayList();
   
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   String sql = "Select * from member";

   try{
       con=conn.connect();
       rs=conn.executeQuery(sql); 
       while(rs.next()){
           tempMember = new member();
           tempMember.setUserid(rs.getString("userid"));
           tempMember.setName(rs.getString("name"));
           tempMember.setPassword(rs.getString("password"));
           tempMember.setPhoto(rs.getString("path"));
           tempMember.setGender(rs.getString("gender"));
           tempMember.setLocation(rs.getString("location"));
           tempMember.setEmail(rs.getString("email"));
           tempMember.setBio(rs.getString("bio"));
           listMember.add(tempMember);
       }
       dataMember = new member[listMember.size()];
       listMember.toArray(dataMember);
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
           return dataMember;
       }
   }
}
   public member[] getMemberByID(String userid){
   member[] dataMember = null;
   member tempMember = null;
   ArrayList listMember = new ArrayList();
   
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   String sql = "Select * from member where userid like '%"+userid+"%'";

   try{
       con=conn.connect();
       rs=conn.executeQuery(sql); 
       while(rs.next()){
           tempMember = new member();
           tempMember.setUserid(rs.getString("userid"));
           tempMember.setName(rs.getString("name"));
           tempMember.setPassword(rs.getString("password"));
           tempMember.setPhoto(rs.getString("path"));
           tempMember.setGender(rs.getString("gender"));
           tempMember.setLocation(rs.getString("location"));
           tempMember.setEmail(rs.getString("email"));
           tempMember.setBio(rs.getString("bio"));
           listMember.add(tempMember);
       }
       dataMember = new member[listMember.size()];
       listMember.toArray(dataMember);
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
           return dataMember;
       }
   }
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
           tempComment.setCommentid(rs.getString("commentid"));
           listComment.add(tempComment);
       }
       dataComment = new comment[listComment.size()];
       listComment.toArray(dataComment);
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
   public contact[] getContact(){
   contact[] dataContact = null;
   contact tempContact = null;
   ArrayList listContact = new ArrayList();
   
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   String sql = "Select * from contact";

   try{
       con=conn.connect();
       rs=conn.executeQuery(sql); 
       while(rs.next()){
           tempContact = new contact();
           tempContact.setUserid(rs.getString("userid"));
           tempContact.setComment(rs.getString("comment"));
           tempContact.setContactid(Integer.parseInt(rs.getString("contactid")));
           listContact.add(tempContact);
       }
       dataContact = new contact[listContact.size()];
       listContact.toArray(dataContact);
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
           return dataContact;
           }
       catch(SQLException e){
           e.printStackTrace();
           return dataContact;
       }
   }
}
   
   public int getQuestionID(String colTitle){

   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int a = 0;
   String sql = "Select * from chapter";

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
   
   public int deleteContact(String contactid){
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;

   String sql="delete from contact where commentid='"+contactid+"'";
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
   
   public int deleteQuestion(String questionid){
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;

   String sql="delete from exam where id_question='"+questionid+"'";
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
   
   public int deleteResult(String userid){
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;

   String sql="delete from result where userid='"+userid+"'";
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
   
   public int deleteMember(String userid){
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;

   String sql="delete from member where userid='"+userid+"'";
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
   
   public int deleteComment(String commentid){
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;

   String sql="delete from comment where commentid='"+commentid+"'";
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
   
   public int updateComment(int threadid){
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;
   String sql = "update thread set tcomment=tcomment-1 where id_thread='"+threadid+"'";
   
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
 
   public int updateQuestion(String questionid, String squestion, String sanswer){
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;
   String sql = "update exam set question='"+squestion+"', answer='"+sanswer+"' where id_question='"+questionid+"'";
   
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
   public int insertQuestion(String questionid, String squestion, String sanswer){
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;
   String sql = "insert into exam values('"+questionid+"','"+squestion+"','"+sanswer+"','text')";
   
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
   
   public int updateChapter(String colTitle){
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;
   String sql = "update chapter set "+colTitle+"="+colTitle+"+1";
   
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
   
   public int deleteComment2(String threadid){
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;

   String sql="delete from comment where id_thread='"+threadid+"'";
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
 
   public int deleteThread(String threadid){
   Connection con=null;
   ResultSet rs = null;
   koneksi conn = new koneksi();
   int b=0;
   int a = deleteComment2(threadid);
   String sql="delete from thread where id_thread='"+threadid+"'";
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
