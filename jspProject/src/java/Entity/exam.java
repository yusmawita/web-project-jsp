/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Jefry
 */
public class exam {
   private String id_question;
   private String question;
   private String answer;
   private String picture;
   private String type;
   
   public void setquestionid(String a){
       this.id_question=a;
   }
   
   public String getquestionid(){
       return this.id_question;
   }
   
   public void setquestion(String a){
       this.question=a;
   }
   
   public String getquestion(){
       return this.question;
   }
   
   public void setanswer(String a){
       this.answer=a;
   }
   
   public String getanswer(){
       return this.answer;
   }
   
   public void setpicture(String a){
       this.picture=a;
   }
   
   public String getpicture(){
       return this.picture;
   }
   
      public void settype(String a){
       this.type=a;
   }
   
   public String gettype(){
       return this.type;
   }
   
}
