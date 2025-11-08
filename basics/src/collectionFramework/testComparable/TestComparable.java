package collectionFramework.testComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {
        List<Employee> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(1);

        list1.add(new Employee(1, "Ada", 40000.00));
        list1.add(new Employee(2, "Deacon", 50000.00));

        System.out.println(list1);


        Collections.sort(list2);
        System.out.println(list2);
    }
}
