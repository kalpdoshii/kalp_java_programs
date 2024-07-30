import java.util.*;
public class pr19 {
    public static void main(String[] args) {
        square S = new square();
        S.prints();
        S.printr();
    }
    
}
class shape{
    void prints(){
        System.out.println("This is this shape");
    }
}
class Rectangle extends shape{
    void printr(){
        System.out.println("This is rectangular shape");
    }
}
class circle extends shape{
    void printc(){
        System.out.println("This is circular shape");
    }

}
class square extends Rectangle{
    void printsq(){
        System.out.println("Square is a rectangle");
    }
}
