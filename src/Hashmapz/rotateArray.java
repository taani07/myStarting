package Hashmapz;
import java.util.Arrays;

public class rotateArray {

    public static int[] rotate(int[] nums,int k)
    {
        int n=nums.length;
        k= k%n;
        int last;

        for(int i=0;i<n;i++)
        {
            last = nums[n-1];
            for(int j=n-1;j>0;j--)
            {
                nums[j] =nums[j-1];
            }
            last= nums[0];
        }
        return nums;
    }

    public static void rotate2(int[] nums, int k)
    {
        int n = nums.length;;
        k =k%n;
        reverse(nums,nums[0],nums[n-1] );
        reverse(nums,nums[0],nums[k-1]);
        reverse(nums,nums[k],nums[n-1]);

    }

    public static void reverse (int[] nums, int start, int end)
    {
        while(start<end)
        {
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end] =temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1,4,5,6,7,4,2,3,8};  //{2,3,8,1,4,5,6,7,4}
        int k =3;




        rotate2(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}
