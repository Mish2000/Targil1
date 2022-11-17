import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the fibonacci element checker!");
        System.out.println("Please insert a number to start the check:");
        int number = scanner.nextInt();
        int num1 = 0;
        int num2 = 1;
        if (number == num1 || number == num2) {
            System.out.println("The number is a part of the sequence.");
            return;
        }
        int num3 = num1 + num2;
        while (num3 < number) {
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
        }
        if (num3 == number) {
            System.out.println("The number is a part of the sequence.");
        } else {
            System.out.println("The number is not a part of the sequence.");
        }
    }
}//End of task 5 class.