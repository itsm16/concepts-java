package collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> testLinkedHashMap = new LinkedHashMap<>(11, 0.3f, true);
        // subclass of HashMap
        // ordered
        // doubly linked list internally
        // stores entries in order as inserted
        // this causes linkedHashmap to slow down a lil than hashmap
        // linkedhasmap takes capacity, load factor, access order
        // by default access order is false
        // if access order is true, then it will maintain the order of access
        // if access order is false, then it will maintain the order of insertion

        testLinkedHashMap.put("apple", 10);
        testLinkedHashMap.put("orange", 20);
        testLinkedHashMap.put("guava", 20);
        testLinkedHashMap.get("apple");
        testLinkedHashMap.get("orange");
        // whatever we're trying to access will go at the end
        // lastly accessed orange comes at the end
        // least recently used will be at the start
        System.out.println(testLinkedHashMap);

        //loop
        for (Map.Entry<String, Integer> entry: testLinkedHashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //creating a linkedhashmap from another hash map
        HashMap<Integer, String> hashMapOne = new HashMap<>();
        hashMapOne.put(1, "One");
        hashMapOne.put(2, "Two");
        hashMapOne.put(3, "Three");

        LinkedHashMap<Integer, String> testLinkedHashMapOne = new LinkedHashMap<>(hashMapOne);
        System.out.println(testLinkedHashMapOne);

        // also have getOrDefault and putIfAbsent methods

        // LRU
        // linkedhashmap also have removeEldestEntry method
        // it is a protected method
        // we can override it to remove the eldest entry
    }
}
