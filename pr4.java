import java.util.Scanner;
public class pr4 {
    public static void main(String[] args) {
      System.out.println("23DIT011-KALP DOSHI");
      System.out.println("--------------------");
        String[] p_l = {"motor","fan","tube","wires","other"};
        double[] rate = {1000,500,200,100,300};
        double[] tax = {8,12,5,7.5,3};
        int q;
        int a;
        double t1=0,t2=0,t3=0,t4=0,t5=0;
        do{
        System.out.println("::::LIST::::");
        System.out.println("1.MOTOR");
        System.out.println("2.FAN");
        System.out.println("3.TUBE");
        System.out.println("4.WIRES");
        System.out.println("5.OTHER ITEMS");
        System.out.println("6.EXIT");

        Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
        
        switch (a) {
            case 1:
            System.out.println("Enter quantity");
                     q=sc.nextInt();
               t1 =((rate[0]) + (rate[0])*((tax[0])/100))*q; 
               System.out.println(t1);
                break;
                case 2:
                System.out.println("Enter quantity");
             q=sc.nextInt();
               t2 = ((rate[1]) + (rate[1])*((tax[1])/100))*q;
               System.out.println(t2);
               break;
               case 3:
               System.out.println("Enter quantity");
             q=sc.nextInt();
               t3 =((rate[2]) + (rate[2])*((tax[2])/100))*q; 
               System.out.println(t3);
               break;
               case 4:
               System.out.println("Enter quantity");
             q=sc.nextInt();
              t4 =((rate[3]) + (rate[3])*((tax[3])/100))*q;
              System.out.println(t4);
              break;
              case 5:
              System.out.println("Enter quantity");
             q=sc.nextInt();
              t5 =((rate[4]) + (rate[4])*((tax[4])/100))*q;
              System.out.println(t5);  
              break;
                
        }
    }while(a<6);
    System.out.println("Total : "+(t1+t2+t3+t4+t5));
    }
}
