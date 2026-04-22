package SubString;

import java.util.HashSet;

public class LongestnonrepeativeSubString {

    //Method1 

    public static void main(String[] args) {
        
    }

    public static int lengthofLongestNonRepeatative(String str)
    {
        //str ="abcsabtf" answer = 3

        HashSet<Character> set = new HashSet<>();
        int left =0;
        int maxLen = 0;

        for(int right=0;right<str.length();right++){

            while(set.contains(str.charAt(right))){
                 set.remove(str.charAt(left));
                 left++;
        }

        set.add(str.charAt(right));
        maxLen = Math.max(maxLen, right-left+1);

    }
        return maxLen;


    }

    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }

        return n*factorial(n-1);
    }

    public static int fibnoci(int n)
    {
        if (n==0) return 0;
        if (n==1) return 1;
        
        return fibnoci(n-2) + fibnoci(n-1);
    }

    // int[] nums = {1,0,4,0,0,6,7} sol = {1,4,6,7,0,0,0}

    public static int[] moveZeros(int[] nums)
    {
        int count=0;
        //maintain the sequence for non zero numbers
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[count]=nums[i];
                count++;

            }

            while(count<nums.length)
            {
                nums[count]=0;
                count++;
            }
        }
        return nums;
    }

}
