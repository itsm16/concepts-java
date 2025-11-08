package arrays;

import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Config :-");
        int p = sc.nextInt();
        int q = sc.nextInt();

        int[][] twoDimArr = new int[p][q];

        for (int row = 0; row < p ; row++) {
            for (int col = 0; col < q ; col++) {
                int num = sc.nextInt();
                twoDimArr[row][col] = num;
            }
        }

        System.out.println("You entered:");
        for (int row = 0; row < p; row++) {
            for (int col = 0; col < q; col++) {
                System.out.print(twoDimArr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
