
import java.util.Random;
import java.util.Scanner;

public class HighorLow {

}

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Random rand = new Random();

            int randomNumber = rand.nextInt(10) + 1;
            int guess;

            do {
                System.out.print("Guess a number between 1 and 10: ");
                while (!input.hasNextInt()) {
                    System.out.println("Invalid input. Please enter an integer.");
                    input.next(); // consume the invalid input
                }
                guess = input.nextInt();

                if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! Your guess is on the money!: " + randomNumber);
                }
            } while (guess != randomNumber);
        }

