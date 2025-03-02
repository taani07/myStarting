package Educative;

public class Main {

    public static void main(String[] args) {
        Challenge1 ch1 = new Challenge1();
        int[] arr = {1,2,4,5,6,8,7};

        int[] arr2 =ch1.removeEven(arr);
         for(int i :arr2)
         {
             System.out.println("i:"+i);
         }

         int target =5;
         Challenge3 ch3 = new Challenge3();
         int[] resultArr = new int[2];
         resultArr = ch3.twoSum2(arr,target);
         for(int i : resultArr)
         {
             System.out.println("two sums:" +i);
         }
    }
}
