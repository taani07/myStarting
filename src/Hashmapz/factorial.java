package Hashmapz;

public class factorial {
    public static void main(String[] args) {
        int n =4;

        int sum = factorial(4);
        System.out.println(sum);
    }

    public static int factorial (int n)
    {
        int sum =0;
        if (n==1) return 1;
       sum = n*factorial(n-1);
       return sum;

    }
}
