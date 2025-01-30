public class fibbanciSeries {
    public static void main(String[] args) {
            long n =12;
            factorial(n);
        System.out.println(factorial(n));


    }

    public static long factorial(long n)
    {
        long factorial ;

        if(n==0)
            return 1;
        factorial   = n * factorial(n - 1);
        return factorial;
    }
}
