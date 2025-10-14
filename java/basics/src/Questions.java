import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        Questions q = new Questions();
        int[] array = q.sumZero(4);
        for(int i : array){
            System.out.println(i);
        }
    }

    public int[] sumZero(int n) {
        Boolean even = n % 2 == 0;
        int[] arr = {0};
        if (even) {
            for (int i = 0; i < n; i++) {
                Arrays.fill(arr, 2);
            }
        }
        return arr;
    }
}
