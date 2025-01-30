package Arrays;

public class RotatingArray {
    public static void main(String[] args) {
        int[] array1 = {2,3,6,7,8,1};
      //  rotate1(array1,2);
        rotate2(array1,1);
    }

    public  static void rotate1(int[] nums, int k){
        if(k> nums.length)
            k = k % nums.length;

        int[] result = new int[nums.length];
        for(int i =0;i<k ;i++){
            result[i] = nums[nums.length-k+1];
        }
        int j=0;
        for(int i=k;i<nums.length;i++)
        {
            result[i]= nums[j];
            j++;
        }
        System.arraycopy(result,0,nums,0,nums.length);
    }


    public static void rotate2(int[] nums, int k)
    {
        if(nums == null || k <0)
        {
            throw new IllegalArgumentException("Illegal argument exception");
        }

        for(int i =0;i<k;i++)
        {
            for(int j= nums.length-1;j>0;j--)
            {
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
            }

        }
    }
}
