package arrays;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Loops:-");
        
        int[] numArray = new int[5];
        numArray[1] = 2;
        numArray[3] = 4;
        numArray[4] = 6;
//        int[] numbers = {1,2,3};
//        String[] fruits = {"mango", "orange", "apple"};
//        String[] strArray = new String[3];

        for (int i = numArray.length-1; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
