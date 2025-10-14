package methods;

public class Methods {
    public static void main(String[] args) {
        // int multiplied = (multiplyByTen(10));
        // int multipliedByTwo = (multiplyByTen(2, 10));
        // System.out.println("Multiplied: " + multiplied);
        // System.out.println("Multiplied by 2 and 10: " + multipliedByTwo);
        System.out.println("Var args: " + multiplyAll(1,2,3));

        Dog a = new Dog();
        a.name = "bob";
        Dog dog = makeDogUpperCase(a);
        System.out.println(dog.name);
        System.out.println(a.name);
    }

    public static Dog makeDogUpperCase(Dog dog){
        dog.name =  dog.name.toUpperCase();
        return dog;
    }





    public static int multiplyByTen(int x){
        return (x * 10);
    }

    // method overloading
    public static int multiplyByTen(int x, int y){
        return (x * y * 10);
    }

    public static int multiplyAll(int ...a){
        int res;
        int prevNum = a[0];
        for (int i = 1; i < a.length; i++) {
            prevNum = prevNum * a[i];
        }
        res = prevNum;
        return res;
    }
}
