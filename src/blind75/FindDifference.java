package blind75;

import java.util.*;

public class FindDifference {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2)
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i:nums1) {
            set1.add(i);
        }

        for(int i:nums2) {
            set2.add(i);
        }
        List<Integer> list1 = new ArrayList<>(set1);
        list1.removeAll(set2);

        List<Integer> list2 = new ArrayList<>(set2);
        list2.addAll(set1);


        List<List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
       return list;
    }

    public static void reverseArray(int[] arr)
    {
        int n = arr.length;
        int left =0;
        int right = arr.length-1;
        while(left<right)
        {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            right--;
            left++;
        }
    }

    public static String reverseString(String s)
    {
      int length = s.length();
      String reverse ="";
      for(int i=length-1;i>=0;i--)
      {
          reverse = reverse + s.charAt(i);
      }

      return reverse;

    }

    public static boolean uniqueOcuurrences(int[] arr)
    {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>() ;

        for (int i:arr) {

            map.put(i, map.getOrDefault(i,0)+1);
        }

        Set<Integer> set = new HashSet<>();

        for(int count: map.values())
        {
            if(!set.add(count))
            {
                return false;
            }
        }
        return true;
    }
}
