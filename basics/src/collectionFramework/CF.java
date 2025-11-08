package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CF {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        System.out.println(list);
        
        // for (Integer i : list) {
        //     System.out.println(i);
        // }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // List<String> list1 = Arrays.asList("Apple", "Mango");

        // String[] allStrs = {"Mon", "Wed"};
        // List<String> list2 = Arrays.asList(allStrs);

        // List<String> list4 = new ArrayList<>(list2);


        // System.out.println(list.getClass().getName());
        // System.out.println(list1.getClass().getName());
        // System.out.println(list2.getClass().getName());
        

        // list4.add(1, "Tue");
        // System.out.println(list4);

        


    }

}
