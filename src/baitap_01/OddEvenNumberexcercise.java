package baitap_01;

import java.util.Scanner;

public class OddEvenNumberexcercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please input a number: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber % 2 == 1) {
            System.out.printf("your number is an odd number");
        }else {
            System.out.println("your number is an even number");
        }
    }
}