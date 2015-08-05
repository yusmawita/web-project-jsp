/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Jefry
 */
public class result {

   private String userid;
   private String chapterid;
   private int score;
   private String taken_date;
   private String totaltime;
   private int times;
   private String status;
   
   public String getStatus(){
       return status;
   }
   public void setStatus(String status){
       this.status = status;
   }
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getChapterid() {
        return chapterid;
    }

    public void setChapterid(String chapterid) {
        this.chapterid = chapterid;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTaken_date() {
        return taken_date;
    }

    public void setTaken_date(String taken_date) {
        this.taken_date = taken_date;
    }

    public String getTotaltime() {
        return totaltime;
    }

    public void setTotaltime(String totaltime) {
        this.totaltime = totaltime;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }
   
   
}
