package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class BinarySearch {

    public static void main(String[] args){



    }

    public static int binarySearch(int[] arr , int target)
    {
        int low =0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }else if (arr[mid]<target)
            {
                low = mid + 1;
            }else
            {
                high = mid-1;
            }
        }
        return -1;
    }

    public static int[] twoSum(int[] arr, int target)
    {
        Map<Integer,Integer> map =new HashMap<Integer, Integer>();
        for(int i =0;i<arr.length;i++)
        {
            int number = target - arr[i];
            if(map.containsKey(number))
            {
                return new int[]{map.get(number),i};
            }else {
                map.put(arr[i],i);
            }
        }
        return new int[]{};

    }
}
