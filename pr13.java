import java.util.*;
public class pr13{
   public static void main(String[] args) {
    System.out.println("23DIT011-KALP DOSHI");
        System.out.println("--------------------");
    date d1 = new date();

    d1.setday();
    d1.setmonth();
    d1.setyear();
    d1.getday();
    d1.getmonth();
    d1.getyear();
    d1.display();
    

   }
}
 class date{
    Scanner sc = new Scanner(System.in);
    int day,year,month;
    date(){
        day=0;
        month=0;
        year=0;
    }
    void setday(){
        System.out.println("Enter Day");
        day = sc.nextInt();
    }
    void setmonth(){
        System.out.println("Enter Month");   
        month = sc.nextInt();
     }
    void setyear(){
        System.out.println("Enter Year");
        year = sc.nextInt();
    }
    void getday(){
        System.out.println("Day is " +day);
    }
    void getmonth(){
        System.out.println("Month is " +month);
    }
    void getyear(){
        System.out.println("Year is " +year);
    }
    void display(){
        System.out.println(day+"/"+month+"/"+year);
    }

}