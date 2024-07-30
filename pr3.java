import java.util.Scanner;
public class pr3 {
    public static void main(String[] args) {
        System.out.println("23DIT011-KALP DOSHI");
        System.out.println("--------------------");
        System.out.println("Enter Mobile Number");
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        System.out.println("SYSTEM OPERATOR : " + m.substring(0,2));
        System.out.println("MOBILE SWITCHING CODE : " + m.substring(2, 5));
        System.out.println("UNIQUE : " + m.substring(5, 9));
       
    }
}
