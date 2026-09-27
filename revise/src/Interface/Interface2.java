package Interface;

interface Demo1{
    void disp();
}

interface Demo2 extends Demo1{
    double pi = 3.14;
    void show();

    default void add(int a, int b){
        int sum = a + b;
        System.out.println("default method: " + sum);
    };
}

class SomeClass implements Demo2{
//    default void div(int a, int b){
//
//    }

    @Override
    public void add(int a, int b) {
        System.out.println(a * b * 2);;
    }

    @Override
    public void show() {

    }

    @Override
    public void disp() {

    }
}

public class Interface2{
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();

//        Demo2.pi = 3;
        someClass.add(1,2);

        // static - stuck to interface
        System.out.println(Demo2.pi);
    }
}

