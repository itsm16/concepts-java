package collectionFramework;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class TestIdentityHashMap {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        Map<String, Integer> testHashMap= new HashMap<>();
        Map<String, Integer> testIdentityHashMap= new IdentityHashMap<>();
        testHashMap.put(key1, 1);
        testHashMap.put(key2, 2);

        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());

        System.out.println("-------------------------------");
        //identity
        testIdentityHashMap.put(key1, 1);
        testIdentityHashMap.put(key2, 2);

        System.out.println(testHashMap);
        System.out.println(testIdentityHashMap);

    }
}
