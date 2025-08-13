import java.util.*;

public class Swap_withoutthird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st no: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd no: ");
        int b = sc.nextInt();

        a = a + b;  
        b = a - b;  
        a = a - b;  

        System.out.println("After swapping: a = " + a + ", b = " + b);
        
    }
}

