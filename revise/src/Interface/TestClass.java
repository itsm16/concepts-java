package Interface;

interface ImplementationOne{
    // interface / abstract methods do not have body
    // in java 8 with default keyword body methods were added
    void add(int a, int b);

    void sub(int a, int b);
}

interface ImplementationTwo{
    void mult(int a, int b);
}

class AnotherClass{
    void div(int a, int b){

    };
}

public class TestClass extends AnotherClass implements ImplementationOne {
    @Override
    void div(int a, int b) {
        int div = a/b;
        System.out.println("from one: "+ div);
    }

    @Override
    public void add(int a, int b) {
        int added = a + b;
        System.out.println("from one: "+ added);
    }

    @Override
    public void sub(int a, int b) {
        int sub = a-b;
        System.out.println("from one: "+ sub);
    }
}

class TestClassOne implements ImplementationOne{
    @Override
    public void add(int a, int b) {
        int added = a + b;
        System.out.println("from two: "+ added);
    }

    @Override
    public void sub(int a, int b) {
        int sub = a-b;
        System.out.println("from two: "+ sub);
    }

    public static void main(String[] args) {
        ImplementationTwo classOne = new TestClassTwo();
        classOne.mult(1, 3);

//        ImplementationOne classTwo = new TestClass();
//        AnotherClass classTwo = new TestClass();
        TestClass classTwo = new TestClass();
        classTwo.div(4, 2);
    }
}

class TestClassTwo implements ImplementationOne, ImplementationTwo{
    @Override
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    @Override
    public void sub(int a, int b) {
        System.out.println(a - b);
    }

    @Override
    public void mult(int a, int b) {
        System.out.println(a * b);
    }
}