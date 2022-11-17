import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("Welcome to the quadratic equation solver!");
        do {
            System.out.println("Please enter an integer for 'a' parameter that is not equal to 0:");
            a = scanner.nextInt();
        } while (a == 0);
        System.out.println("Please enter an integer for 'b' parameter:");
        int b = scanner.nextInt();
        System.out.println("Please enter an integer for 'c' parameter:");
        int c = scanner.nextInt();
        double delta = Math.sqrt(b * b - 4 * a * c);
        double x1 = (-b + delta) / (2 * a);
        double x2 = (-b - delta) / (2 * a);
        if (b * b - 4 * a * c > 0) {
            System.out.println("The first solution is:\t" + x1);
            System.out.println("The second solution is:\t" + x2);
            return;
        }
        if (delta == 0)
            System.out.println("The solution is:\t" + x1);
        else
            System.out.println("There is no solutions for this equation.");
    }
}
//End of Task1 class.


