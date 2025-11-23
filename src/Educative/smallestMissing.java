package Educative;

import java.util.HashSet;

public class smallestMissing {

    class Solution {
        public int solution(int[] A) {
            HashSet<Integer> set = new HashSet<>();
            for(int i:A)
            {
                if(i>0)
                    set.add(i);
            }
            int smallest=1;
            while(set.contains(smallest))
            {
                smallest++;
            }
            return smallest;
        }
    }

}
