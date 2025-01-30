package Hashmapz;

public class MinandMaxpRICE {

    public static void main(String[] args) {
        int[] arr ={2,3,5,7,9,8,7,13};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i:arr)
        {
          if(i<min)
          {
              min=i;
          }else if(i>max)
          {
              max =i;
          }
        }
        System.out.println("maximum value is: " +max+" minimum value is : "+min);
    }
}
