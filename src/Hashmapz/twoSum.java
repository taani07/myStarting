package Hashmapz;

import java.util.HashMap;
import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
      int[] arr1 = {2,3,4,1,8};

      int k =9;

      int[] arr2 = new int[2];
     // arr2 = twosum2(arr1,k);
        arr2 = twosum(arr1,k);

        System.out.println(Arrays.toString(arr2));
    }



    public static int[] twosum2(int[] arr, int k){
        for(int i =0;i< arr.length;i++)
        {
            for(int j=0;j< arr.length;j++)
            {
                if (k-arr[j]==arr[i])
                    return new int[]{i,j};
            }
        }
        return new int[] {};
    }


    public static int[] twosum(int[] arr, int k){
        HashMap<Integer, Integer> maps = new HashMap<>();
        for(int i =0;i< arr.length;i++)
        {
            int compliment = k - arr[i];
            if(maps.containsKey(compliment))
            {
                return new int[]{maps.get(compliment),i};
            }
            maps.put(arr[i],i );
        }

        return new int[]{};
    }
}
