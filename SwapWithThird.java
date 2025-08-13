import java.util.*;

public class SwapWithThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st no: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd no: ");
        int b = sc.nextInt();

        int temp = a; 
        a = b;        
        b = temp;     

        System.out.println("After swapping: a = " + a + ", b = " + b);
        
    }
}
