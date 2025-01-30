public class median {
    public static void main(String[] args) {
        int[] arr = {2,3,1,7,5};
        int n = arr.length;
         if(n%2==0) {
             System.out.println(n / 2 - 1);
         } else{
             System.out.println(n/2);
         }
    }
}
