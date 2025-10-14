package OOPS.interfaces.animals;

public interface Animal {
    public abstract void eat();
    void sleep();

    default void drinking(){
        System.out.println("Drinking water");
    }

    default void run(){
        this.eat();
    }
}
