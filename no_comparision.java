import java.util.*;

public class no_comparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x,y and z");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x != y && y != z && x != z) {
            if (x < y && y < z) {
                System.out.println("Strictly Increasing");
            } else if (x > y && y > z) {
                System.out.println("Strictly Decreasing");
            } else if (y > x && y > z) {
                System.out.println("mid no is largest");
            } else {
                System.out.println("No specific pattern");
            }
        } else {
            System.out.println("no are same");
        }
        
    }
}
