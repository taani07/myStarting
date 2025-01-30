package multiDimensionalArray;

import static multiDimensionalArray.Print2DArray.sumof2DArray;
import static multiDimensionalArray.mergedArray.mergedString;
import static multiDimensionalArray.mergedArray.mergedString2;
import static multiDimensionalArray.mergedArray.greatestDivisor;

public class Main {

    public static void main(String[] args) {
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i =0 ;i<array.length;i++)
        {
            for(int j =0;j<array[i].length;j++)
            {
                System.out.println(array[i][j] + "");
            }
            System.out.println();
        }

        sumof2DArray(array);

        String s1 = "Rama";
        String s2 ="Shyama";

        String s3=mergedString(s1,s2);
        System.out.println("Merged String "+s3);

        String s4 = mergedString2(s1,s2);
        System.out.println("Merged String2 "+s4);

        String s5 = "ABCABC";
        String s6 = "ABC";
        System.out.println("gcd of String:"+greatestDivisor(s5,s6));

    }
}
