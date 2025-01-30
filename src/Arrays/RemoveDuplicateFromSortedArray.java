package Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] arr)
    {
        int len = arr.length;
        int[] newArr = new int[arr.length];
        for(int i =0; i<len;i++)
        {
            if(arr[i]==arr[i+1])
            {
                return 0;
            }

        }
        return 1;
    }

}
