
import java.util.*;
public class primeCheck{
 public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no: ");
        int num=sc.nextInt();
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }
        else{
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num+ "is a prime no");
        }
        else{
            System.out.println(num+"is not prime");
        }
    }

}

