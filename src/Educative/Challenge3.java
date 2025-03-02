package Educative;

import java.util.HashMap;

public class Challenge3 {
     public static int[] twoSum(int[] arr, int target)
     {
         int temp=0;
         HashMap map = new HashMap();
         for(int i=0;i< arr.length;i++)
         {
             int compliment = target-arr[i];
             if(map.containsKey(compliment))
             {
                // return new int[]{map.get(compliment),i};
             }else
             {
                 map.put(i,arr[i]);
             }
         }
         return new int[]{};
     }

     public static int[] twoSum2(int[] arr, int target){
         for(int i=0;i< arr.length;i++)
         {
             for(int j=0;j< arr.length;j++)
             {
                 if( target-arr[i]==arr[j])

                     return new int[]{i,j};

             }
         }
         return new int[0];


     }
}
