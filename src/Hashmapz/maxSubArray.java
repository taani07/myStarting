package Hashmapz;

public class maxSubArray {
    public static void main(String[] args) {
       int[] nums = {2,3,4,5,-1,-3,6,2}; //14 //18
       int maxSum = maxSubArray(nums);
        System.out.println(maxSum);
    }


    //iterate through array
    //see if all
    public static int maxSubArray(int[] nums)
    {
       int currentSum = nums[0];
       int maxSum = nums[0];
       for (int i=1;i<nums.length;i++)
       {
           currentSum = Math.max(nums[i],currentSum+nums[i]);
           maxSum = Math.max(maxSum,currentSum);

       }
       return maxSum;
    }

}
