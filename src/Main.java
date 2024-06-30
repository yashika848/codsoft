import java.util.Random;
import java.util.Scanner;
class GuessingGame{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a random number between 1 and 100 !");
        Random random = new Random();
        int number = new random.nextInt(100)+1;

    }

}
