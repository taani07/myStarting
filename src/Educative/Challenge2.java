package Educative;

import java.util.ArrayList;
import java.util.List;

public class Challenge2 {
    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> nums1,ArrayList<Integer> nums2){
        int[] nums1Array = new int[nums1.size()];
        int[] nums2Array = new int[nums2.size()];
        ArrayList<Integer> mergeArray = new ArrayList<>();
        int p1=0;
        int p2=0;
        while(p1<nums1.size()&& p2< nums2.size())
        {
            if(nums1.get(p1)< nums2.get(p2))
            {
              mergeArray.add(nums1.get(p1));
              p1++;
            }else
            {
                mergeArray.add(nums2.get(p2));
                p2++;
            }
        }

        while(p1<nums1.size())
        {
            mergeArray.add(nums1.get(p1));
            p1++;
        }

        while (p2<nums2.size())
        {
            mergeArray.add(nums2.get(p2));
            p2++;
        }

        return mergeArray;
    }
}
