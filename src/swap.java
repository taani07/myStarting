public class swap {
    public static void main(String[] args) {
        int a=40;
        int b =10;
        swapNum(a,b);
    }

    public static void swapNum(int a , int b)
    {
        b = a+b;
        a = b-a;
        b = b-a;

        System.out.println("a is :"+a+" b is:"+b);
    }
}
