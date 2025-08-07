
import java.util.*;
public class calc {
    public static void main(String[] args) {
        System.out.println("enter 1st no");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter 2nd no");
        Scanner ac=new Scanner(System.in);
        int b=sc.nextInt();
        System.out.println("enter operation +,-,*,/");
        Scanner bc=new Scanner(System.in);
        char operator=sc.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
            result= a+b;
            System.out.println("result is "+ result);
             default:
                break;
        }
        switch (operator) {
            case '-':
            result=a-b;
            System.out.println("result is "+ result);
             default:
                break;
        }
        switch (operator) {
            case '*':
            result=a*b;
            System.out.println("result is"+ result);
             default:
                break;
        }
        switch (operator) {
            case '/':
            result=a/b;
            System.out.println("result is "+ result);
             default:
                break;
        }
            
        }
        

        
           
        }
        
    
    


    

