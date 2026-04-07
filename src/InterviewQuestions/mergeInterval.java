package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeInterval {

    public static void main(String[] args)
    {
       int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};
       int[][] result = mergeSolution(intervals);
       for (int[] interval : result) {
           System.out.println(Arrays.toString(interval));
       }
    }

    public static int[][] mergeSolution(int[][] intervals)
    {
        if (intervals.length==0)
        {
            return new int[0][0];
        }

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> merged = new ArrayList<>();

        int[] current = intervals[0];
        merged.add(current);
        for(int i=1;i<intervals.length;i++)
        {
            int[] next  = intervals[i];
            if(next[0]<=current[1])
            {
                current[1] = Math.max(current[1],next[1]);
            }else
            {
                current = next;
                merged.add(current);
            }

        }
        return merged.toArray(new int[merged.size()][]);
        
    }
    
}
