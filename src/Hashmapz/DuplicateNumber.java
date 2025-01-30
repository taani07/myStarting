package Hashmapz;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String[] args) {
   int[] sum = {2,4,5,2,3,8};
   int ss= duplicateNumbers(sum);
        System.out.println(ss);
    }

    public static int duplicateNumbers(int[] sum)
    {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<sum.length;i++)
        {
            if(set.contains(sum[i]))
            {
                return sum[i];
            }
            set.add(sum[i]);
        }
        return -1;
    }

    public static int findDuplicateNumbers(int[] sum){
       int tortoise = sum[0];
       int hare = sum[0];

       do{
           tortoise = sum[tortoise];
           hare = sum[sum[hare]];

       }while (tortoise!=hare);

       tortoise = sum[0];
       while(tortoise !=hare)
       {
           tortoise = sum[tortoise];
           hare = sum[hare];
       }
       return hare;
    }

}
