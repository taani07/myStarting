package Educative;

public class Challenge1 {

    public static int[] removeEven(int[] arr){
        int size=   0;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2!=0)
            {
                size++;
            }

        }
        int[] arr2 = new int[size];
        int result_index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2!=0)

                arr2[result_index++]=arr[i];
            
        }

        return arr2;
    }
}
