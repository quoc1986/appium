package Practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();

        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        for (int index = 0; index < myArrayList.size(); index++) {
            System.out.println("your list number: " + myArrayList.get(index));
        }

    }
}
