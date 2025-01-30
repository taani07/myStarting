package PDFProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a =0;
        int b =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Big number: ");
        int n = sc.nextInt();
        String str1 = sc.nextLine();

        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();
        String str2 = sc.nextLine();


        BigInteger bigint = new BigInteger(str1);
        BigInteger bigInt2 = new BigInteger(str2);

        BigInteger sum ;

        sum = bigint.add(bigInt2);

        System.out.println(sum);


    }
    public static void swap (int a , int b)
    {
        int temp =0;
        temp = a;
        a =b;
        b=temp;
        System.out.println();
    }
}
