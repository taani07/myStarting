import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        int number ,reversenumber=0;


        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

      while(number!=0)
      {
          reversenumber = reversenumber*10;
          reversenumber = reversenumber+ number%10;
          number = number/10;

      }

        System.out.println("Reverse Number is :" +reversenumber);
    }
}
