public class reverseString {
    public static void main(String[] args) {
      String Str = "reverse";
        System.out.println(reverseString(Str));
    }

    public static String reverseString(String str)
    {
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i= ch.length;i<=0;i--)
        {
            sb.append(i);
        }

        String reverse = sb.reverse().toString();
        System.out.println("this is :" +reverse);
        return reverse;
    }
}
