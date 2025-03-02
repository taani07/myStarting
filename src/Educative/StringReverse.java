package Educative;

public class StringReverse {
    public static void main(String[] args) {
        String str="hello";
        String expected = "olleh";
        System.out.println(stringReverse(str));
        String str2= "madam";
        System.out.println(isPallindrome("str"));

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
}
