import java.util.Arrays;
public class MoveZeros {
    public static void main(String[] args) {
      int[] nums = {2,1,0,6,0,9}; //{2,1,6,9,0,0}
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void moveZeros(int[] nums)
    {
        int swap =0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
               nums[swap]= nums[i];
                swap++;
            }

        }
        for(int i =swap;i<nums.length;i++)
        {
            nums[swap] = 0;
        }
    }
}
