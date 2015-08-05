/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Jefry
 */
public class member {
   private String userid;
   private String password;
   private String name;
   private String photo;
   private String gender;
   private String location;
   private String email;
   private String bio;
   
   public void setUserid(String a){
       this.userid=a;
   }
   
   public String getUserid(){
       return this.userid;
   }
   
   public void setPassword(String a){
       this.password=a;
   }
   
   public String getPassword(){
       return this.password;
   }
   
   public void setName(String a){
       this.name=a;
   }
   
   public String getName(){
       return this.name;
   }
   
   public void setPhoto(String a){
       this.photo=a;
   }
   
   public String getPhoto(){
       return this.photo;
   }
   
   public void setGender(String a){
       this.gender=a;
   }
   
   public String getGender(){
       return this.gender;
   }
   
   public void setLocation(String a){
       this.location=a;
   }
   
   public String getLocation(){
       return this.location;
   }
   
   public void setEmail(String a){
       this.email=a;
   }
   
   public String getEmail(){
       return this.email;
   }
   
   public void setBio(String a){
       this.bio=a;
   }
   
   public String getBio(){
       return this.bio;
   }
}
