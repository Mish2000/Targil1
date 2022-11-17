public class Task7 {
    public static void main(String[] args) {
        System.out.println("Welcome to the narcissistic numbers printer!");
        System.out.println("Here are the narcissistic numbers until 1000:");
        /*
         In the first loop the program prints all positive single digit numbers, because as humans, we can see
         that every number of that kind fits with the narcissistic numbers rule: x=x^1.
         */
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        for (int j = 100; j < 1000; j++) {
            if ((Math.pow(j % 10, 3) + Math.pow(j / 10 % 10, 3) + Math.pow(j / 100, 3)) == j) {
                System.out.println(j);
            }
        }
    }
}//End of Task7 class.
