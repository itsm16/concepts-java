package exceptions;

public class Test {
    public static void main(String[] args) {
        int [] numerators = {100, 200, 300, 400};
        int [] denominators = {10, 20, 0, 40};
        for (int i = 0; i < numerators.length; i++) {
            System.out.println(divide(numerators[i], denominators[i]));
        }

    }

    public static int divide(int x, int y){ // adding static
        try {
            return x/y;
        } catch (ArithmeticException e) {
            System.out.printf("Case: %d / %d gives Error: %s, exits returning: ",x,y,e);
            return -1;
        }
    }
}
