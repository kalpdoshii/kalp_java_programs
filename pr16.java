public class pr16 {
    
    public static void main(String[] args) {
        child B = new child();
        B.m2();
}
}
class parent{
    void m1(){
        System.out.println("This is Parent Class");
    }
}
class child extends parent{
    void m2(){
        System.out.println("This is Child Class");
        parent A = new parent();
        A.m1();   
    }
}

    
