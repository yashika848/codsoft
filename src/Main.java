import java.util.Scanner;
class GuessingGame {
    public static void main(String[] args) {
        int n = 6;
        int i, guess;
        int number = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the Guessing game");
        System.out.println(" you have to guess the number between 1 and 100 within 6 attempts");
        for (i = 0; i < n; i++) {
            System.out.println(" Guess the number");
            guess = sc.nextInt();
            if (guess == number) {
                System.out.println("congratulations you guessed the number");
                break;
            } else if (guess < number && i != n - 1) {
                System.out.println("This number less ");

            } else if (guess > number && i != n - 1) {
                System.out.println("This number greater ");
            }

        }
        if (i == n) {
            System.out.println("you try all your attempts ");
            System.out.println("The number was " + number);
        }
          System.out.println("Thanks for playing");

        }

    }

