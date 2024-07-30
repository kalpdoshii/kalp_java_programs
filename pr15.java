import java.util.*;
public class pr15 {
    public static void main(String[] args) {
        System.out.println("23DIT011-KALP DOSHI");
        System.out.println("--------------------");
       complex c = new complex();
       c.getcomplex1();
       c.getcompex2();
       c.sum();
       c.product();
    }
}
class complex{
    Scanner sc = new Scanner(System.in);
    int r1,r2,i1,i2;
    void getcomplex1(){
        System.out.println("Enter real part(r1)");
        r1 = sc.nextInt();
        System.out.println("Enter imaginary part(i1)");
        i1 = sc.nextInt();
        System.out.println(r1+ " + i("+i1+")");
    }
    void getcompex2(){
        System.out.println("Enter real part(r2)");
        r2 = sc.nextInt();
        System.out.println("Enter imaginary part(r1)");
        i2 = sc.nextInt();
        System.out.println(r2+ " + i("+i2+")");

    }
    void sum(){
        int sum_r = r1+r2;
        int sum_i = i1+i2;
        System.out.println("SUM");
        System.out.println(sum_r+ " + i("+sum_i+")");
    }
    void product(){
        int product1 = ((r1*r2)-(i1*i2));
        int product2 = ((r1*i2)+(i1*r2));
        System.out.println("PRODUCT");
        System.out.println(product1+ " +  i("+product2+")");
    }
    

}