import java.util.*;
public class pr18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length : ");
        float x = s.nextFloat();
        System.out.println("Enter the width : ");
        float y = s.nextFloat();
       square S = new square(x);
       rectangle R = new rectangle(x, y);
       R.printarea();
       R.printperimeter();
       
     

     
    }
}
class rectangle{
    float l,b;
    Scanner sc = new Scanner(System.in);
     
    rectangle(float x,float y ){
        l = x;
        b = y;
    }
    void printarea(){
        System.out.println("Area of rectangle is "+(l*b));
    }
    void printperimeter(){
        System.out.println("Perimeter of rectangle is "+(2*(l+b)));
    }
}
class square extends rectangle{
    square(float x){
            super(x,x);
            System.out.println("Area of square is "+x*x);
            System.out.println("Perimeter of square is "+4*x);

    }
}
