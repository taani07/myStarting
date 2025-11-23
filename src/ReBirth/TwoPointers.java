package ReBirth;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.lang.model.util.ElementScanner14;

public class TwoPointers {
    
     public static void main(String[] args)
     {
          String str = "abcbaa";
          reverseString(str);
          subStr1(str);
     }
     

     //Using StringBuilder
     public static void reverseString(String s)
     {
          char[] ch= s.toCharArray();
          int left =0;
          int right = ch.length-1;
          while(left<right)
          {
           
            char temp= ch[left];
            ch[left]= ch[right];
            ch[right]=temp;
            left++;
            right--;
          }

          String reverseStr = new String(ch);
          System.out.println(reverseStr);
     }


     public static void subStr1(String str)
     {
        for(int i=0;i<str.length()-1;i++)
        {
          for(int j =i+1;j<=str.length();j++)
          {
               System.out.println(str.substring(i,j));
          }
        }
     }

     public static void subsTR2(String str) {
          List<String> listOfSubString = new ArrayList<String>();
          for(int i=0;i<str.length();i++)
          {
               for(int j=i+1;j<str.length();j++)
               {
                    listOfSubString.add(str.substring(i,j));
               }
          }

          
         
     }


     public static int[] twoSumWithTwoPointer(int[] arr, int target)
     {
          int ptr =0;
          int ptr2 = arr.length-1;
        while(ptr<ptr2)
          {
              if (target == arr[ptr]+ arr[ptr2])
              {
               return new int[]{ptr,ptr2};
              }else if ((arr[ptr] + arr[ptr2])>target)
              {
               ptr2--;
              }else{
                  ptr++;
              }
          

          }
          return new int[]{-1,-1};
     }
}
