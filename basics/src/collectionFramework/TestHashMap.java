package collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> testHashMap = new HashMap<>();
        testHashMap.put(21, "Cartoon");
        testHashMap.put(28, "Andrew");
        testHashMap.put(29, "Jade");
        testHashMap.put(29, "John");
        // overwrites the value
        System.out.println(testHashMap);
        String student = testHashMap.get(21);
        System.out.println(student);
        System.out.println(testHashMap.containsKey(30));

        // get or set a default if not present
        String ifPresent = testHashMap.getOrDefault(30, "Not found");
        System.out.println("Value at key 28 : " + ifPresent);

        // if not present, then add
        testHashMap.putIfAbsent(29, "KC");
        testHashMap.putIfAbsent(30, "Drew");
        System.out.println(testHashMap);

        // Loop over
//        Set<Integer> keys = testHashMap.keySet();
//        for(Integer i : keys){
//            System.out.println(testHashMap.get(i));
//        }

        for (Integer entry : testHashMap.keySet()) {
            System.out.println(testHashMap.get(entry));
        }

        Set<Map.Entry<Integer, String>> entries = testHashMap.entrySet();
        // entries are of interface Map.Entry
        // Map.Entry is a interface with methods getKey() and getValue()

        // use alt + Enter to complete LHS
        for (Map.Entry<Integer, String> entry :entries){
//            System.out.println(entries);
//            System.out.println(entry.getKey() + " : " + entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
        }
//        testHashMap.remove(29);
        System.out.println(testHashMap);
        
        // Unordered collection
        // allows null keys and values or replaces the value
        // allows duplicate keys
        // Not synchronized : thread unsafe
        // performance: offers constant time performance for the basic operations (get and put),
        // assuming the hash function disperses the elements properly among the buckets
    }   
}
