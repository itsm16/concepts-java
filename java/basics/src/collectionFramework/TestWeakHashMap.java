package collectionFramework;

import java.util.WeakHashMap;

public class TestWeakHashMap {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache= new WeakHashMap<>();
        imageCache.put(new String("img1"), new Image("Image1"));
        imageCache.put(new String("img2"), new Image("Image2"));
        System.out.println(imageCache);
        System.gc();
        simulateRun();
        System.out.println(imageCache); // now prints { } empty
        // {}


    }

    public static void simulateRun(){
        try {
            System.out.println("Simulating run...");
            Thread.sleep(10000);
        }catch (Exception ignore){

        }
    }

    static class Image{
        String name;

        public Image(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
