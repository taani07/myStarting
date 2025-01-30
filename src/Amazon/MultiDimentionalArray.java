package Amazon;

import java.util.Arrays;

public class MultiDimentionalArray {
    public static void main(String[] args)
    {
        int[][] arr1 = new int[4][4];
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.deepToString(arr1));

        for (int i=0;i<= arr1.length-1;i++) {

            for(int j=0;j< arr1[i].length;j++)
            {
                System.out.print(arr1[i][j] +" ");
                arr1[0][1]=2;
                arr1[0][2]=3;
            }
            System.out.println();
        }
    }

}
