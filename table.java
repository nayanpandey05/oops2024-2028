import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no: ");
        int n=sc.nextInt();
        System.out.println("table is :");
        for(int i=1;i<=10;i++){
            System.out.println(n+ "*"+ i +"=" + (n*i));
        }
    }
}
