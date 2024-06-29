import java.util.Scanner;
class guessinggame {
    public static void main(String[] args) {
        int n = 6;
        int i, guess;
        Scanner Sc = new Scanner(System.in);
        int number = (int) (100 * Math.random());
        System.out.println("Enter a number between 1 and 100." + "Guess the the number within 6 attempts");
        for (i = 0; i < n; i++) {
            System.out.println("Guess the number");
            guess = Sc.nextInt();
            if (guess == number) {
                System.out.println(" hey cutie congratulation " + "you guessed the number. ");

            } else if (guess < number && i != n - 1) {
                System.out.println(" The number is Greater than" + " guess");
            } else if (guess > number && i != n - 1) {
                System.out.println("The number is less than" + " guess");
            }
        }

        if (i == n) {
            System.out.println(" Game Over " + " you use all your attempts ");
            System.out.println(" The number which has to be guessed is" + "=" + number);
        }
            System.out.println(" Thanks for playing ........");

        }
    }









