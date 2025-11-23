public class bubbleSort {
    public static void main(String[] args) {

    }

    public static void bubbleSort(int[] arr)
    {
        boolean swaped;
        int length =arr.length-1;
        for(int i=0;i<length;i++)
        {
            swaped =false;
            for(int j=0;i<length-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] =arr[j];
                    arr[j]= temp;
                    swaped= true;
                }
            }
            if(!swaped) break;
        }

    }
}
