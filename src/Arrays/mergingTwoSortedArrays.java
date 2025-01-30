package Arrays;

public class mergingTwoSortedArrays {
    public static void main(String[] args) {

    }

    public static int[] mergetwosort(int[] one ,int[] two)
    {
        int[] sorted = new int[one.length + two.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<one.length && j<two.length)
        {
            if(one[i]<two[j])
            {
                sorted[k]=one[i];
                i++;
                k++;
            }else
                sorted[k]=two[j];
                k++;
                j++;

        }
        while(i==one.length)
        {
            sorted[k]= two[j];
            j++;
            k++;
        }

        while(j == two.length)
        {
            sorted[k]=one[i];
            k++;
            j++;
        }

        return sorted;

    }
}
