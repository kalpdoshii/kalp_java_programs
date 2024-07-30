import java.util.*;
public class pr9 {
 public static void main(String[] args) {
    System.out.println("23DIT011-KALP DOSHI");
    System.out.println("--------------------");
    System.out.println("Enter the String:");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n;
    do{
    System.out.println(":::LIST:::");
    System.out.println("1.Length Of the String");
    System.out.println("2.Lowercase Of the String");
    System.out.println("3.Uppercase Of the String");
    System.out.println("4.Reverse String");
    System.out.println("5.Sort the String");
    System.out.println("6.Exit");
    System.out.println("CHOOSE");

    n = sc.nextInt();
    switch (n) {
        case 1:
            int l = s.length();
            System.out.println(l);
            break;
    
        case 2:
            String a = s.toLowerCase();
            System.out.println(a);
            break;
         case 3:
            String b = s.toUpperCase();
            System.out.println(b);
            break;
        case 4:
            for(int i = s.length()-1; i>=0;i--)
            {
                System.out.print(s.charAt(i));
            }
            break;
        case 5:
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String d = new String(c);
            System.out.println(d);
            break;
    }
    }while(n<6);
    
 }   
}
