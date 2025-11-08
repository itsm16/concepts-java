package collectionFramework;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class TestIdentityHashMap {

    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");

        // hascode of class String will be same
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        // since identity hashcodes are diff they're added in identity hashmap
        System.out.println("------------------------------------------");

        Map<String, Integer> testHasMap = new HashMap<>();
        testHasMap.put(key1, 1);
        testHasMap.put(key2, 2);

        Map<String, Integer> testIdentityHasMap = new IdentityHashMap<>();
        testIdentityHasMap.put(key1, 1);
        testIdentityHasMap.put(key2, 2);

        System.out.println(testHasMap); // {key=2}
        // The HashMap will have only one entry.
// HashMap uses the .equals() and .hashCode() methods of the key objects to determine key equality.
// Since both key1 and key2 contain the same string "key" and are created using the String class,
// their .equals() comparison returns true, and their hash codes are also the same.
// When HashMap finds that both keys are equal, the second put() call replaces the first entry.


        System.out.println(testIdentityHasMap);// {key=2, key=1}
        // The IdentityHashMap will have two entries.
// IdentityHashMap uses reference equality (==) to compare keys and System.identityHashCode() for hashing.
// Since both key1 and key2 are created using 'new String("key")', they are two different objects in memory.
// Even though their contents are the same, key1 == key2 returns false, and their identity hash codes differ.
// Therefore, IdentityHashMap treats them as two distinct keys and stores both entries separately.


    }


}
