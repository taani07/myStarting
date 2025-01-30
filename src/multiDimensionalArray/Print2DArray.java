package multiDimensionalArray;

public class Print2DArray {

    public static int sumof2DArray(int[][] arr)
    {
        int length = arr.length;
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of 2D array is:"+ sum);
        return sum;
    }

}