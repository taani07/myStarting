public class reverseaNumber {

    public static void main(String[] args) {
      reverseNum(789);
    }

    public static int reverseNum(int number)
    {
        int reverse =0;

        while(number !=0)
        {
            int digit = number % 10;
            reverse = reverse *10 + digit;
            number = number /10;

        }
        System.out.println("reversed number is " +reverse);
        return reverse;
    }
}
