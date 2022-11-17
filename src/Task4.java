import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Welcome to the prime numbers generator!");
        Scanner scanner = new Scanner(System.in);
        int amount;
        int counter = 1;
        int assistNum = 3;

        do {
            System.out.println("Please enter the amount of prime numbers that you wish to present:");
            amount = scanner.nextInt();
        }
        while (amount < 1);

        if (amount >= 1) {
            System.out.println("You asked for" + " " + amount + " " + "prime numbers:");
            System.out.print(2 + " ");
        }

        for (int i = 2; i <= amount; ) {
            for (int j = 2; j <= Math.sqrt(assistNum); j++) {
                if (assistNum % j == 0) {
                    counter = 0;
                    break;
                }
            }
            if (counter != 0) {
                System.out.print(assistNum + " ");
                i++;
            }
            counter = 1;
            assistNum++;
        }

    }
}//End of Task4 class.