import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Welcome to the digits to sum converter!");
        do {
            System.out.println("Please enter a positive integer:");
            number = scanner.nextInt();
        }
        while (number < 0);
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("The sum of the digits is:" + " " + sum);
    }
}//End of Task6 class.