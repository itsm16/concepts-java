package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        System.out.println("runs");
        ArrayList<Integer> list1 = new ArrayList<>();
        
        list1.add(1);
        list1.add(2);
        System.out.println(list1);

        // list using array
        String[] list2 = {"A", "B"};
        List<String> listTwo = Arrays.asList(list2);

        try {
            listTwo.add("C"); // cannot be modified
        } catch (UnsupportedOperationException e) {
            System.out.printf("%s : Cannot add element\n", e);
        }
        // gives exception
        System.out.println(listTwo);

    }
}
