package Amazon;

import java.util.Scanner;

class SortedArray {
    // write code here

    public static void main(String[] args)
    {
        getIntegers(6);
    }

    public static int[] getIntegers(int size)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the size of the array: ");
        size  = sc.nextInt();
        int[] userarray = new int[size];
        System.out.println("please Enters the element of your array ");
        for(int i:userarray){
            userarray[i]=sc.nextInt();

        }
        return userarray;
    }

    public static void printArray(int[] arr)
    {
        for(int i =0;i<arr.length-1;i++)
        {
            System.out.println("Element "+i +"contents"+arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arrs)
    {
        int len = arrs.length;
        int[] newArray = new int[arrs.length];
        for(int i =0;i<len-1;i++)
        {
            for(int j=1;j<len-1;j++)
            {
                if(arrs[i]<arrs[i+1]){
                    newArray[j]=arrs[i+1];
                }
            }
        }
        return newArray;
    }

}

