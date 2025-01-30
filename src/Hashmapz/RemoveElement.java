package Hashmapz;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr ={2,3,5,4,2,5,7,8,2,1};
        int val=2;
        System.out.println(removeElement(arr,val));
    }

    public static int removeElement(int[] nums, int val){
        int count =0;
        int length= nums.length;
        for(int i=0;i<length;i++)
        {
            if(nums[i]==val)
            {
                count++;
            }
        }
        return length-count;
    }
}
