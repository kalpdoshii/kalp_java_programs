import java.util.*;
public class pr17 {
    public static void main(String[] args) {
        System.out.println("Input for Employee");
        employee E = new employee();
        E.print();
        E.printsalary();
        E.get_spe();
        System.out.println("Input for Manager");
        manager M = new manager();
        M.print();
        M.printsalary();
        M.get_dept();

        System.out.println("EMPLOYEE");
        E.display();
        System.out.println("MANAGER");
        M.display();


    }
    
}    
class member{
    String name;
    int age;
    String phone_no;
    String address;
    Double salary;
    Scanner sc = new Scanner(System.in);

    void printsalary(){
       System.out.println("Salary : "+salary);
    }
    void print(){
       System.out.println("Enter Name : ");
       name = sc.nextLine();
       System.out.println("Enter age : ");
       age = sc.nextInt();
       System.out.println("Enter Phone no : ");
       sc.nextLine();
       phone_no = sc.nextLine();
       System.out.println("Enter Address : ");
       address = sc.nextLine();
       System.out.println("Enter Salary : ");
       salary = sc.nextDouble();
    }
    
          
    
}
class employee extends member{
    String specialization;
    void get_spe(){
        System.out.println("Enter specialization : ");
        specialization = sc.nextLine();
    }
    void display(){
        System.out.println(" Name : " +name);
        System.out.println(" age : " +age);
        System.out.println(" Phone no : " +phone_no);
        System.out.println("Address : " +address);
        System.out.println("Salary : " +salary);
        System.out.println("Specialization : " +specialization);
          
    }

}
class manager extends member{
    String department;
    void get_dept(){
        System.out.println("Enter department : ");
        department = sc.nextLine();
    }
    void display(){
        System.out.println(" Name : " +name);
        System.out.println(" age : " +age);
        System.out.println(" Phone no : " +phone_no);
        System.out.println("Address : " +address);
        System.out.println("Salary : " +salary);
        System.out.println("Department : "+department);
    }
}