package Practice;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoopIntegrateFunction {
    public static void main(String[] args) {

        boolean isContinuing = true;

        while (isContinuing) {
            printSimpleMenu();
            int option = getUserOption();
            if (option == 0) {
                isContinuing = false;
            } else if (option == 1) {
                System.out.println("your random number: " + new SecureRandom().nextInt(1000));
            } else {
                System.out.println("Input wrong");
            }
        }
            System.out.println("See you again");
        }
        public static void printSimpleMenu () {
            System.out.println("===========Game Menu===========");
            System.out.println("1. Generate random number");
            System.out.println("0. Exit");
        }
        public static int getUserOption () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("please select option: ");
            return scanner.nextInt();
        }

    }
