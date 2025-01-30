package blind75;

public class ProductToSelf {

    public static int[] productToSelf(int[] nums)
    {
        int length = nums.length;
        int[] result = new int[length];

        result[0] = 1; //left of First element
        for(int i =1;i<length;i++)
        {
            result[i] = nums[i-1]*result[i-1];
        }
        int rightProduct =1;
        for(int i=length-1;i>=0;i--)
        {
            result[i] = result[i]*rightProduct;
            rightProduct = rightProduct*nums[i];
        }
        return result;
    }

    public static void moveZeros(int[] nums)
    {
        int lasttomove=0;
        int length = nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0) {
                int temp = nums[lasttomove];
                nums[lasttomove]= nums[i];
                nums[i] = temp;
                lasttomove++;
            }
        }
    }
}

