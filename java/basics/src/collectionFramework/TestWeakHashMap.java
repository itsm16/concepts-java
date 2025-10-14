package collectionFramework;

import java.util.WeakHashMap;

public class TestWeakHashMap {
    public static void main(String[] args) {
        WeakHashMap<String, Image> testWeakHashMap = new WeakHashMap<>();
        testWeakHashMap.put(new String("key1"), new Image("Image1"));
        testWeakHashMap.put(new String("key2"), new Image("Image2"));
        System.out.println(testWeakHashMap);
        System.gc();
        simulate();
        System.out.println(testWeakHashMap);
        
    }

    public static void simulate(){
        try {
            System.out.println("Simulating run...\n ");
            Thread.sleep(10000);
        } catch (Exception ignore) {
            // TODO: handle exception
        }
    }

    public static class Image {
        private String name;

        public Image(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return name;
        }
        
    }
}
