package Practice;

import java.lang.module.FindException;
import java.net.BindException;

public class Arraylearning {
    public static void main(String[] args) {
        int arraylength = 5;
        int [] myIntArray = new int [arraylength];

        myIntArray [0] = 1;
        myIntArray [1] = 2;
        myIntArray [2] = 3;
        myIntArray [3] = 4;
        myIntArray [4] = 5;

        for (int index = 0; index < arraylength; index++) {
            System.out.printf("Element of the index %d has value %d\n", index, myIntArray[index]);
            
        }
    }
}
