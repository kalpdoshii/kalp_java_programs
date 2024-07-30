import java.util.*;
public class pr7 {
    public static void main(String[] args) {
        System.out.println("23DIT011-KALP DOSHI");
        System.out.println("--------------------");
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        System.out.println("Enter Array");
        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            if(arr[i]==9){
                count++;
            }

        }
        System.out.println( "9 comes " + count + " times in array");

    }
}