import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        int original = n,sum=0;
        while (n>0) {
            int digit=n%10;
            sum+=digit*digit*digit;
            n=n/10;


            
        }
        if (sum==original) {
            System.out.println("armstrong no");
        }
        else{
            System.out.println("not an armstrong no");
        }

    }
    
}
