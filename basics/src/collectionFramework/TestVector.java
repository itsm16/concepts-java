package collectionFramework;

import java.util.Arrays;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector<Integer> testVector1 = new Vector<>(12);
        testVector1.add(1);
        testVector1.add(2);
        System.out.println(testVector1.capacity());

        Integer[] arr = {1, 2, 3};
        Vector<Integer> testVector2 = new Vector<>(Arrays.asList(2,3,4));
        System.out.println(testVector2);

        // capacity increase
        Vector<Integer> testVector3 = new Vector<>(3, 2);
        System.out.println(testVector3.capacity());
        testVector3.add(1);
        testVector3.add(2);
        testVector3.add(3);
        testVector3.add(4);
        System.out.println(testVector3.capacity());
    }
}
