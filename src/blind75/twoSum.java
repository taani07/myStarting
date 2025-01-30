package blind75;

public class twoSum {
    public static void main(String[] args) {
   int[] sum ={};
    }

    public static int[] twosum(int target, int[] sum)
    {
        int[] n;
        for(int i =0;i<sum.length;i++)
        {
            if(target - sum[i] == sum[i + 1])
            {
                return new int[]{sum[i],sum[i+1]};
            }
        }

        return new int[]{0};
    }
}
