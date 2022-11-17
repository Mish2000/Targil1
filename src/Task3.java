import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Welcome to the diamond pattern generator!");
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a positive odd number that bigger than three:");
            number = scanner.nextInt();
        }
        while (number % 2 == 0 || number <= 3);


        int loop = number / 2;
        for (int i = loop; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (number - i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= loop + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (number - i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}//End of Task3 class.