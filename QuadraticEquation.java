import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("No real solutions.");
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("One real solution: " + root);
        } else {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Two real solutions: " + root1 + " and " + root2);
        }
    }
}

    

