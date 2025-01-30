package Arrays;

public class ArrayUdemy {
    public static void main(String[] args) {
        int[] nums = {5,3,4,2,2,1,3,4,4};
        int length = removeElement(nums,4);
        System.out.println(length);
        int[] ss = new int[2];
        ss = findMaxMin(nums);
        for (int i :ss
             ) {
            System.out.println(i);
        }
    }

    public static int removeElement(int[] nums, int val)
    {
        int i =0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=val)
            {
                i++;
            }
        }
        return i;
    }


    public static int[] findMaxMin(int[] myList){

        int[] solArr = new int[2];
        int temp =0;
        for(int i =0; i< myList.length;i++)
        {
            if(myList[i]>myList[i+1]) {
                solArr[0] = myList[i];
            }else{
                solArr[1] = myList[i+1];
            }

        }
        return solArr;

    }
}
