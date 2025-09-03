import java.util.*;
public class odd_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            if (i%2!=0) {
                System.out.println("all od no between 1 to" +n+ "is"+i);
                
            }
        }
    }
    
}
