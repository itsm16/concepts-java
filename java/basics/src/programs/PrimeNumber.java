package programs;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }


    public static boolean isPrime(int num){
        int res = 0;
        for (int i = 1; i < num/2; i++) {
            if(num % i == 0){
                res++;
            }
        }
        return res == 1;
    }

}
