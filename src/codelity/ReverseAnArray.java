package codelity;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] array = {6,8,9,5,77};
       // reverse(array,5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array length");
        int n = sc.nextInt();
        int[] userInputArray = new int[4];
        for(int i=0;i<n;i++)
        {
            userInputArray[i]=sc.nextInt();
        }
        System.out.println("");

        String str = "SitaRamam";
    }

    public static int[] reverse(int[] arr , int n)
    {
        n = arr.length;
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr2[i]=arr[arr.length-1-i];
        }

        for (int i:arr2) {
            System.out.println("second array is "+i);
        }
        return arr2;
    }

    public static int[] stringreverse(int[] arr, int n) {

        for (int i = 0; i < n; i++){
            int temp =0;
            arr[i] = temp;
            arr[i] = arr[i+1];



        }
        return arr;
    }
}
