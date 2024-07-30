import java.util.*;
public class pr14 {
    public static void main(String[] args) {
        System.out.println("23DIT011-KALP DOSHI");
        System.out.println("--------------------");
        System.out.println("Enter length");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter width");
        int y = sc.nextInt();

        area a = new area(x,y);
        a.returnarea();
    }
}
class area{
    int l,b;
    area(int x,int y){
   l=x;
   b=y;
    }

        
    
    int returnarea(){
        int area=l*b;
        System.out.println(area);
        return area;       
    }
}