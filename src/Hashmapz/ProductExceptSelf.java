package Hashmapz;

import java.util.HashSet;

public class ProductExceptSelf {


    public static int[] productExceptSelf(int[] nums)
    {
        int n = nums.length;

        int[] newarr = new int[n];

        int leftProduct =1;
        int rightProduct =1;
        for(int i=0;i<nums.length;i++)
        {
            newarr[i]=leftProduct;
            leftProduct =leftProduct*nums[i];

        }

        for(int i=n-1;i>=0;i--)
        {
            newarr[i] = newarr[i]*rightProduct;
            newarr[i]= newarr[i]*nums[i];
        }

        return newarr;
    }

    public static int[] productExceptSelf1(int[] nums)
    {
        int counter=0;
        int n = nums.length;
        int[] newArray = new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j) continue;

                counter = counter*j;

            }
            newArray[i]= counter;

        }
        return newArray;
    }

    public static boolean StringsDifferByOneCharacter(String[] dict)
    {
        HashSet<String> set = new HashSet<>();

        for(String word: dict) {
            for (int i = 0; i < dict.length; i++) {
               String modifiedWord = word.substring(0,i)+ "*" + word.substring(i+1);

               //to check if it has seen before

                if(set.contains(modifiedWord))
                {
                    return true;
                }
                set.add(modifiedWord);
            }
        }
        return false;
    }

    public static void main(String[] args){
        String[] dict = {"abcd","acbd","aacd"};

        boolean res= StringsDifferByOneCharacter(dict);
        System.out.println(res);

        int x = 272;
       boolean isVerified = isPalindrome(x);
        System.out.println(isVerified);
    }


    public static boolean isPalindrome(int x) {

        int reverse =0;
        while(x>0)
        {
            int reminder = reverse %10;
            reverse = reverse*10 + reminder;
            reverse = reverse/10;

        }
        if(reverse == x)
        {
            return true;
        }
        return false;

    }

    public static boolean isPlaindrome(String s)
    {
        int left=0;
        int right =s.length()-1;

        while(left<right)
        {
            //for ignoring non-alphanumeric character
            while(left<right && !Character.isLetterOrDigit(s.charAt(left)));
            {
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right)));
            {
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
            {
                return false;
            }
            left ++;
            right --;

        }
        return true;


    }
}
