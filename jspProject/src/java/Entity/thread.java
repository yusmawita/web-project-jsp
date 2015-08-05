/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Jefry
 */
public class thread {
   private String id_thread;
   private String title;
   private String content;
   private String create_date;
   private String lastPost_date;
   private String userid;
   private int view;
   private int comment;
   
   public void setView(int a){
       this.view=a;
   }
   
   public int getView(){
       return this.view;
   }
   
   public void setComment(int a){
       this.comment=a;
   }
   
   public int getComment(){
       return this.comment;
   }
   
   public void setUserid(String a){
       this.userid=a;
   }
   
   public String getUserid(){
       return this.userid;
   }
   
   public void setContent(String a){
       this.content=a;
   }
   
   public String getContent(){
       return this.content;
   }
   
   public void setthreadid(String a){
       this.id_thread=a;
   }
   
   public String getthreadid(){
       return this.id_thread;
   }
   
   public void setTitle(String a){
       this.title=a;
   }
   
   public String getTitle(){
       return this.title;
   }
   
   public void setcreatedate(String a){
       this.create_date=a;
   }
   
   public String getcreatedate(){
       return this.create_date;
   }
   
   public void setlastpostdate(String a){
       this.lastPost_date=a;
   }
   
   public String getlastpostdate(){
       return this.lastPost_date;
   }
}
