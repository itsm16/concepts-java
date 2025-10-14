package arrays;

public class Jagged {
    public static void main(String[] args) {
        // Step 1: Declare number of rows
        int[][] jagged = new int[3][];

        // Step 2: Initialize each row with a different length
        jagged[0] = new int[2]; // 2 columns
        jagged[1] = new int[3]; // 3 columns
        jagged[2] = new int[2]; // 2 columns

        // Step 3: Assign values
        jagged[0][0] = 1;
        jagged[0][1] = 2;

        jagged[1][0] = 3;
        jagged[1][1] = 4;
        jagged[1][2] = 1;

        jagged[2][0] = 5;
        jagged[2][1] = 6;

        // Step 4: Print
        for (int row = 0; row < jagged.length; row++) {
            for (int col = 0; col < jagged[row].length; col++) {
                System.out.print(jagged[row][col] + " ");
            }
            System.out.println();
        }
    }
}
