package Practice;

import java.security.SecureRandom;
import java.util.Iterator;

public class FunctionLearning {

    public static void main(String[] args) {
       printNumber();
        System.out.println("you have reach your magic number");
    }

    public static int getARandomNumber(int boundary) {
        int randomNumber = new SecureRandom().nextInt(boundary);
        return randomNumber;
    }

    public static void printNumber() {
        for (int i = 0; i < 10; i++) {
            if (i == 8) return;
            else System.out.println(i);
        }

        }
    }
