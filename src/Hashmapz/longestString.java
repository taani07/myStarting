package Hashmapz;

import java.util.Arrays;

public class longestString {
    public static void main(String[] args) {
        String[] arr = {"GHGHGGHGHG","FFF","HJHJHJ","GGJHJH"};
        String longestString =findLongestString(arr);
       // System.out.println(longestString);
        int[] arr1 ={1,1,1,2,2,3,4,4};  //4

        int newarrayLength = removesDuplicates(arr1);
        System.out.println(newarrayLength);

        int[] arr2 = {7,1,5,3,6,4}; //5

        System.out.println("maxProfit :"+maxProfit(arr2));

        int[] arr3 = {1,2,3,4,5,6,7};
        int k=3;
        rotate(arr3,k);
        System.out.println(Arrays.toString(arr3));
    }

    public static String findLongestString(String[] arr)
    {
        String longestString ="";
        for(String str : arr)
        {
          if(str.length()>longestString.length())
              longestString=str;

        }
        return longestString;
    }




    public static int removesDuplicates(int[] nums){
        if(nums.length==0) {
            return 0;
        }
        int index =0;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[index])
            {
                index++;
                nums[index] = nums[i];
            }
        }
        return index+1;
    }

    public static int maxProfit(int[] prices)
    {
      int maxProfit =0;
      int minPrice =Integer.MAX_VALUE;
      for(int i :prices)
      {
         minPrice =Math.min(minPrice,i);
         int Profit = i-minPrice;
         maxProfit = Math.max(Profit,maxProfit);

      }
        return maxProfit;
    }

    public static void rotate(int[] nums, int k)
    {
        k= k%nums.length;
        int length = nums.length;

        rot(nums,nums.length-1,0);
        rot(nums,k-1,0);
        rot(nums,nums.length-1,k);
    }


    public static void rot(int[] nums , int end , int start)
    {
       while(end>start)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }
    }

    public static int subArray(int[] nums){
        int maxSum=nums[0];

        int currentSum = nums[0];
        for(int i:nums)
        {
            currentSum = Math.max(i, i+currentSum);

            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;

    }

}
