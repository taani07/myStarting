package Amazon;

import java.util.Scanner;
import java.util.Arrays;


public class minimumElementArray {

    public static void main(String[] args) {
       int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));
        int minInt = findMin(returnedArray);
        System.out.println("min "+minInt);

        System.out.println(Arrays.toString(reverseArray(returnedArray)));

        System.out.println(Arrays.toString(reverseCopy(returnedArray)));

    }

    public static int[] readIntegers()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enters a list of integers , separated by comma: ");
        String input = sc.nextLine();
        String[] splits = input.split(",");
        int[] intArray = new int[splits.length];
        for(int i =0;i<splits.length;i++)
        {
            intArray[i]=Integer.parseInt(splits[i].trim());
        }
        return intArray;
    }

    private static int findMin(int[] array1)
    {
        int min = Integer.MAX_VALUE;
        for(int i:array1)
        {
            if(i<min)
            {
                min = i;
            }
        }
        return min;
    }

    private static int[] reverseArray(int[] arr1)
    {
        int[] reversedArray = new int[arr1.length];
        int maxIndex = arr1.length-1;
        for(int i=0;i<= arr1.length-1;i++)
        {
            reversedArray[maxIndex--] = arr1[i];

        }
        return reversedArray;
    }

    private static int[] reverseCopy(int[] arr1)
    {
        int[] reversedArray = new int[arr1.length];
        int maxIndex = arr1.length;
        for(int i:arr1)
        {
            System.out.println(maxIndex);
            reversedArray[maxIndex--]=arr1[i];

        }
        return reversedArray;
    }


}
