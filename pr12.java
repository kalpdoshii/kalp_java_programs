import java.util.*;
public class pr12 {
    public static void main(String[] args) {
        System.out.println("23DIT011-KALP DOSHI");
        System.out.println("--------------------");

        employee e1 = new employee();
        e1.get();
        e1.raise();
        employee e2 = new employee();
        e2.get();
        e1.raise();

        System.out.println("Employee 1");
        e1.display();
        System.out.println("Employee 2");
        e2.display();
    }
}
class employee{
    String fname;
    String lname;
    double salary;
    employee(){
    
    }
        void get(){
            System.out.println("Enter First Name");
            Scanner sc = new Scanner(System.in);
            fname = sc.nextLine();
            System.out.println("Enter Last Name");
            lname = sc.nextLine();
            System.out.println("Enter Salary");
            Scanner s = new Scanner(System.in);
            salary = s.nextDouble();
            if(salary<0){
                salary=0;
            }
        }
        void display()
        {
            System.out.println("First Name: "+fname);
            System.out.println("Last Name: "+lname);
            System.out.println("Salary "+salary);
        }
        void raise()
        {
             salary=salary+salary*0.1;
             System.out.println("Raised Salary "+salary);
        }
    
}
