package Hashmapz;

import java.util.Arrays;

public class findMaxMin {
    public static void main(String[] args) {

       int[] nums= {3,2,1,5,6,9};
       int[] newnums = new int[2];
       newnums= findMinMax(nums);
        System.out.println(Arrays.toString(newnums));

    }

    public static int[] findMinMax(int[] nums){
        int max = nums[0];
        int min = nums[0];

        for(int i:nums)
        {
            if(i>max)
            {
               max= i ;
            }else if(i<min)
            {
                min =i;
            }
        }
        return new int[]{max,min};

    }
}
