import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the arithmetic sequence generator!");
        System.out.println("Please enter the first element in the sequence:");
        int a1 = scanner.nextInt(); // a1 is the first element in the sequence.
        System.out.println("Please enter the difference between two elements of the sequence:");
        int d = scanner.nextInt(); // d is the difference between two elements of the sequence.
        System.out.println("Please enter the number of elements in the sequence:");
        int n = scanner.nextInt(); // n represents the number of elements in the sequence.
        if (n <= 0) {
            System.out.println("This arithmetic sequence does not exist. ");
            return;
        }
        System.out.println("The arithmetic sequence is:\t\n" + a1);
        for (int i = 1; i < n; i++) {
            a1 = a1 + d;
            System.out.println(a1);
        }


    }
}
//End of Task2 class.

