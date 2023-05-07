package baitap_01;

import java.util.Scanner;

public class BMIexcercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please input your height: ");
        float clientHeight = scanner.nextFloat();
        System.out.print("please input your weight: ");
        float clientWeight = scanner.nextFloat();
        float clientBMI = clientWeight / (clientHeight * 2);
        System.out.println("your IBM is: " + clientBMI);

        if (clientBMI <= 18.5) {
            float clientWeightincrease = 18.5f - clientBMI;
            System.out.println("please increase weight: " + clientWeightincrease + "kg");
        } else if (clientBMI <= 24.9) {
            System.out.println("you are perfect");
        } else if (clientBMI <= 29.9) {
            float clientWeightdecrease = clientBMI - 18.5f;
            System.out.println("you are overweight, please decrease: " + clientWeightdecrease + "kg");
        } else {
            float clientWeightdecrease = clientBMI - 18.5f;
            System.out.println("Obesity, please decrease: " + clientWeightdecrease + "kg");
        }

    }
}
