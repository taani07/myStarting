package blind75;

public class canPlaceFlowers {

    public boolean canplaceFlowers(int[] flowerbed,int n){
        boolean isAvalaible =false;
        int length = flowerbed.length;
        for(int i=0;i<flowerbed.length;i++)
        {
         boolean left = i==0||flowerbed[i-1]==0;
         boolean right = i==length-1|| flowerbed[i+1]==0;

         if(left && right && flowerbed[i]==0)
         {
             flowerbed[i]=1;
             n--;
         }
        }
       return n<=0;
    }
}
