package collectionFramework;

import java.lang.ref.WeakReference;

public class GC {
//    Garbage collection
public static void main(String[] args) {
    WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Moto", "Fusion"));
    System.out.println(phoneWeakReference.get());
    System.gc();
    try {
        Thread.sleep(10000);
    }catch (Exception ignored){
    }
    System.out.println(phoneWeakReference.get());
}

static class Phone {
    private String brand;

    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

}
