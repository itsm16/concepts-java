package collectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    // LRU using LinkedHashMap
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> testLRU = new LRUCache<>(3);
        testLRU.put(1, "Andrew"); // excluded
        testLRU.put(2, "Andy");
        testLRU.put(3, "Ada");
        testLRU.put(4, "Aiden");
//        testLRU.put(5, "Jade");
        System.out.println(testLRU);
        System.out.println("_______________________________________");
        LRUCache<Integer, String> testLRUOne = new LRUCache<>(3);
        testLRUOne.put(8, "Bob");
        testLRUOne.put(7, "Alice");
        testLRUOne.put(6, "Ram");
        testLRUOne.get(8); // Bob added again, alice removed
        // since we're trying to access 8 (latest use), it will be added
        testLRUOne.put(9, "V");
//        testLRUOne.get(8);
        // bob will not be found if we try to access here instead, removed when "V" was added
        System.out.println(testLRUOne);
    }
}
