package Educative;

import java.util.HashMap;
import java.util.Map;

public class StringReverse {
    public static void main(String[] args) {
        String str="hello";
        String expected = "olleh";
        System.out.println(stringReverse(str));
        String str2= "madam";
        System.out.println(isPallindrome("str"));

        String str3 = "AarthaKapoor@gmail.com";
      //  System.out.println(str.substring(str3.indexOf('@'),1));
        System.out.println(extractDomain(str3));

        String str4 = "hello this is my country";
       // System.out.println(str4.trim().split("\\s+").length);
        System.out.println(str4.trim().split("\\s+").length);

        String input = "key1=value1;key2=value2;key3=value3";
        //output ={key1-> value1,key2 -> value2,key3 -> value3}

        System.out.println(parseKeyValuePairs(input));

    }

    public static String stringReverse(String str)
    {
        char[] strchar = str.toCharArray();
        int right= str.length()-1;
        int left=0;
       // for(int i=s1.length-1;i< 0;i--)
        while(left<right)
        {
          char temp=strchar[left];
          strchar[left] = strchar[right];
          strchar[right]=temp;
          left++;
          right--;


        }
        return new String(strchar);

    }

    public static boolean isPallindrome(String input)
    {

        if (input.equals(reverse(input)))
        {
            System.out.println("String is Pallindrome");
            return true;
        }else
            return false;
    }

    public static String reverse(String input)

    {
        char[] charStr = input.toCharArray();
        int left =0;
        int right = input.length()-1;

        while(left<right)
        {
            char temp = charStr[right];
            charStr[right] = charStr[left];
            charStr[left] =temp;
            left++;
            right--;

        }
        return new String(charStr);
    }

     public static String extractDomain(String email)
     {
         return email.substring(email.indexOf('@'),22);
     }

     public static Map<String,String> parseKeyValuePairs(String input)
     {
         //input = {"key1=value1;key2=value2;key3=value3"}
         //output ={key1-> value1,key2 -> value2,key3 -> value3}
         Map<String,String> map = new HashMap<>();
         for (String pair:input.split(";")) {
             String[] keyvaluepair=pair.split("=");
             map.put(keyvaluepair[0],keyvaluepair[1] );


         }
         return map;
     }


}
