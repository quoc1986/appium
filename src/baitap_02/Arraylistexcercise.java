package baitap_02;

import java.util.*;

public class Arraylistexcercise {
    public static void main(String[] args) {

        List <Integer> myArrayList = new ArrayList<>();

        boolean isContinuing = true;

        while (isContinuing) {
            printSimpleMenu();
            int option = getUserOption();
            switch (option) {
                case 0:
                    isContinuing = false;
                    System.out.println("Exited the program");
                case 1:
                    System.out.println("Please input a number to add: ");
                    Scanner scanner1 = new Scanner(System.in);
                    int userInputNumber = scanner1.nextInt();
                    myArrayList.add(userInputNumber);
                    break;
                case 2:
                    System.out.println("the numbers list: " + myArrayList);
                    break;
                case 3:
                    Integer max = Collections.max(myArrayList);
                    System.out.println("ArrayList values : " + myArrayList);
                    System.out.println("ArrayList max value : " + max);
                    break;
                case 4:
                    Integer min = Collections.min(myArrayList);
                    System.out.println("ArrayList values : " + myArrayList);
                    System.out.println("ArrayList min value : " + min);
                    break;
                case 5:
                    if (myArrayList.isEmpty()) {
                        System.out.println("List has no value!");
                    } else {
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.print("Please enter a number to search: ");
                        int searchNum = scanner2.nextInt();
                        if (myArrayList.contains(searchNum)) {
                            System.out.println("The number " + searchNum + " is at index " + myArrayList.indexOf(searchNum));
                        } else {
                            System.out.println("The number " + searchNum + " does not exist in the array");
                        }
                    }
                    break;
                default:
                    System.out.println("this option is not available");
            }

        }
    }

    private static void printSimpleMenu() {
        System.out.println("===========Game Menu===========");
        System.out.println("1. Add a number into Array");
        System.out.println("2. Print numbers");
        System.out.println("3. Print maximum number");
        System.out.println("4. Print minimum number");
        System.out.println("5. Find a number");
        System.out.println("0. Exit");

    }
    public static int getUserOption () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please select option: ");
        return scanner.nextInt();
    }

}

