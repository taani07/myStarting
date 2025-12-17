package ReBirth;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.lang.model.util.ElementScanner14;

public class TwoPointers {
    
     public static void main(String[] args)
     {
          String str = "abcbaa";
          reverseString(str);
          subStr1(str);
     }
     

     //Using StringBuilder
     public static void reverseString(String s)
     {
          char[] ch= s.toCharArray();
          int left =0;
          int right = ch.length-1;
          while(left<right)
          {
           
            char temp= ch[left];
            ch[left]= ch[right];
            ch[right]=temp;
            left++;
            right--;
          }

          String reverseStr = new String(ch);
          System.out.println(reverseStr);
     }


     public static void subStr1(String str)
     {
        for(int i=0;i<str.length()-1;i++)
        {
          for(int j =i+1;j<=str.length();j++)
          {
               System.out.println(str.substring(i,j));
          }
        }
     }

     public static void subsTR2(String str) {
          List<String> listOfSubString = new ArrayList<String>();
          for(int i=0;i<str.length();i++)
          {
               for(int j=i+1;j<str.length();j++)
               {
                    listOfSubString.add(str.substring(i,j));
               }
          }

          
         
     }


     public static int[] twoSumWithTwoPointer(int[] arr, int target)
     {
          int ptr =0;
          int ptr2 = arr.length-1;
        while(ptr<ptr2)
          {
              if (target == arr[ptr]+ arr[ptr2])
              {
               return new int[]{ptr,ptr2};
              }else if ((arr[ptr] + arr[ptr2])>target)
              {
               ptr2--;
              }else{
                  ptr++;
              }
          

          }
          return new int[]{-1,-1};
     }

     public static int[] twoSum2(int[] arr, int target){
               Map<Integer, Integer> map = new HashMap<>();
               for(int i=0;i<arr.length;i++)
               {    int current =arr[i];
                    int complement = target-current;
                    if(map.containsKey(complement))
                    {
                         return new int[]{i,arr[i]};
                    }
                    map.put(i, arr[i]);
               }
               return null;

         // return new int[]{};
     }

     public static int[] twoSS(int[] arr , int target)
     {
          
          int right =0;
          int left = arr.length-1;
          while(left<right)
          {
               
               if(right+left==target)
               {
                    return new int[]{left,right};
               }else if (right+left>target) {
                   right--;
               }else {
                   left++;
               }
          }
          return null;
     }

     public static List<List<Integer>> threeSum(int[] arr)
     {

       List<List<Integer>> result = new ArrayList<>();
        if( arr ==null || arr.length<3)
        {
                 return result;
             }
         
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0;i<n-2;i++)
        {
           if (i>0 && arr[i]==arr[i-1])
           continue;

           int left = i+1;
           int right = arr.length-1;

           while(left<right)
           {
               int sum = arr[i]+ arr[left]+ arr[right];

               if(sum==0)
               {
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    while(left<right && arr[left]==arr[left+1]) left++;
                    while(left<right && arr[right]==arr[right-1]) right--;
                    left++;
                    right--;
               }
               else if(sum<0)
               {
                    left++;
               }else{
                    right--;
               }
           }
        }

return result;
     }
}
