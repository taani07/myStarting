package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class ArraysManipulation {

    public static void main(String[] args) {
        int[] arr = {1,0,3,7,8,0,3};
        int[] result = {arr.length};
        int[] arrNums = {-1,-2,4,3,-1}; //ans =5

        result = moveZerosII(arr);
        for(int nums:result)
        {
            System.out.println(nums);
        }

        System.out.println("max SubArray Sum is " +maxSubArray(arrNums));
        
    }

    public static int[] moveZerosI(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[count]=arr[i];
                count++;
            }}

            while(count<arr.length)
            {
                arr[count]=0;
                count++;
            }
        
    
        return arr;
    }

    public static int[] moveZerosII(int[] arr)
    {
        int left=0;
        //int right=0;

      for(int right=0;right<arr.length;right++)
        {
           // int[] arr = {1,0,3,7,8,0,3};
            if(arr[right]!=0)
            {
                int temp = arr[left];
                arr[left]= arr[right];
                arr[right]= temp;
                left++;
                
            }
        }
        return arr;
    }


    //int arr = {7,1,2,4,6,2} ans = 5
    public static int bestTimeToBuyStock(int[] arr)
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int sellPrice:arr)
        {
            if(sellPrice<minPrice)
            {
                minPrice = sellPrice;
            }else if (sellPrice-minPrice>maxProfit)
            {
                maxProfit= sellPrice -minPrice;
            }


        }
        return maxProfit;

    }

    //int[] arr = {-1,-2,4,3,-1}; ans =5
  //currentSum = Math.max(nums[i],currentSum+nums[i])
    //maxSum =Math.max(maxSum, currentSum)

    public static int maxSubArray(int[] arr)
    {
      int maxSum =0;
      int currentSum =0;

      for(int i=0;i<arr.length;i++)
      {
          currentSum = Math.max(arr[i],currentSum+arr[i]);
          maxSum = Math.max(currentSum,maxSum);
      }
      return maxSum;
    }

    //int[] arr ={2,3,6,5,2,6}

    public static Boolean noDuplicateProblem(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int nums:arr)
        {
            if(set.contains(nums))
            {
                return true;
            }
            set.add(nums);
            return false;
        }
        return false;
    }



}
