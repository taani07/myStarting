package Hashmapz;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashhh {

    public static void main(String[] args) {
        
    }

    public static int frequencyofChar(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for(Character c: s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        

      return s.isEmpty()?0:map.get(s.charAt(0));

    }


    //maxValueKey

    public static int findMaxValueKey(Map<Integer,Integer> map)
    {
      map = new HashMap<>();
      int result=0;
      int maxValue = Integer.MIN_VALUE;

      for(Map.Entry<Integer, Integer> entry :map.entrySet())
      {
        if(entry.getValue()>maxValue)
        {
            maxValue = entry.getValue();
            result = entry.getKey();
        }
      }

      return result;
    }

    //second Method--
    public static int findMaxValue(Map<Integer, Integer> map)
    {
      return map.entrySet()
      .stream()
      .max(Map.Entry.comparingByKey())
      .get()
      .getKey();
    }

    //twoSum

    public static int[] twoSum(int[] arr , int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        

        for(int i=0;i<arr.length;i++)
        {
            int temp = target-arr[i];
            if(map.containsKey(temp))
            {
                return new int[]{map.get(temp),arr[i]};
            }
              map.put(arr[i],i);
            }

        return new int[]{};
        }

        public static void firstNonRepeatingCharacter()
        {
          HashMap<Character, Integer> map = new HashMap<>();

        }
    }

