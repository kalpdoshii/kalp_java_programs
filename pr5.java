import java.util.*;

public class pr5{
    public static void main(String[] args) {
      System.out.println("23DIT011-KALP DOSHI");
      System.out.println("--------------------");
        Random r = new Random();
         int random = r.nextInt(100);
         Scanner sc = new Scanner(System.in);
         int n;
         do { 
            System.out.println("Enter number");
             n = sc.nextInt();
             if(n==random)
             {
               System.out.println("Yor number is correct");
               break;
             }
             else if(n>random)
             {
                System.out.println("Your number is grater than random number ");
             }
             else if(n<random)
             {
                System.out.println("Your number is less than random number");
             }
         } while (n>=0);
         System.out.println(n + " : is your number");
    }
}