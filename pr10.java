import java.util.*;
public class pr10 {
    public static void main(String[] args) {
        System.out.println("23DIT011-KALP DOSHI");
        System.out.println("--------------------");

        String S="CHARUSAT UNIVERSITY";
        int ch;
        
        do{
        System.out.println(":::LIST:::");
        System.out.println("1.Find Length");
        System.out.println("2.Replace H by FIRST LETTER OF YOUR NAME");
        System.out.println("3.Conver all character in lowercase");
        System.out.println("4.exit");
        Scanner sc = new Scanner(System.in);
        ch=sc.nextInt();
        switch(ch){
            case 1:
            int a = S.length();
            System.out.println(a);
            break;
            case 2:
            
            System.out.println("Enter your Name");
            Scanner s = new Scanner(System.in);
            String n = s.nextLine();
            for(int i=0;i<S.length();i++){
                if(S.charAt(i)=='H'){
                   S=S.replace(S.charAt(i),n.charAt(0));
            }
        }
        System.out.println(S);
                break;
                case 3:
                String b = S.toLowerCase();
                System.out.println(b);
                break;


            }
        }while(ch<5);
            
        }


} 

