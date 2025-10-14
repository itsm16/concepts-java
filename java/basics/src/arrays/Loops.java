package arrays;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int[] numArray = new int[5];

        for (int i = 0; i < numArray.length; i++) {
            int num = sc.nextInt();
            numArray[i] = num;
        }
        System.out.println("-----------------------------------------------");
        System.out.print("[");
//        for (int x: numArray){
//            System.out.print(x + ", ");
//        }
        for (int i=0; i < numArray.length; i++){
//            System.out.print(numArray[i] + ", ");
            System.out.print(numArray[i]);
            if(i != numArray.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("\n");
    }
}
