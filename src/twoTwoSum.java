import java.util.HashMap;
import java.util.Map;

public class twoTwoSum {

    public static int[] twoSum(int[] arr, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            int sum = target - arr[i];
            if(map.containsKey(sum))
            {
                return new int[] {map.get(sum),i};
            }else
            {
                map.put(arr[i],i);
            }
        }
        return new int[] {};
    }
}
