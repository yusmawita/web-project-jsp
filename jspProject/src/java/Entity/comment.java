/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Jefry
 */
public class comment {
   private String id_thread;
   private String comment;
   private String comment_date;
   private String userid;
   private String commentid;

    public String getCommentid() {
        return commentid;
    }

    public void setCommentid(String commentid) {
        this.commentid = commentid;
    }
   
   public void setUserid(String a){
       this.userid=a;
   }
   
   public String getUserid(){
       return this.userid;
   }
   
   public void setthreadid(String a){
       this.id_thread=a;
   }
   
   public String getthreadid(){
       return this.id_thread;
   }
   
   public void setcomment(String a){
       this.comment=a;
   }
   
   public String getcomment(){
       return this.comment;
   }
   
   public void setcommentdate(String a){
       this.comment_date=a;
   }
   
   public String getcommentdate(){
       return this.comment_date;
   } 
}
