package Practice;

import java.security.SecureRandom;
import java.text.BreakIterator;
import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
        int guessingTime = 0;
        int randomNumber = new SecureRandom().nextInt(5);
        System.out.println("random number is: " + randomNumber);

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your guessing number: ");
            int userInput = scanner.nextInt();

            if(userInput == randomNumber){
                System.out.println("Congrat!");
                break;

        }
            guessingTime++;

        } while (guessingTime < 3);

        System.out.println("See you again");
    }

}
