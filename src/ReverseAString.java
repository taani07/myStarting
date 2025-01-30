public class ReverseAString {
    public static void main(String[] args) {
        System.out.println("reverse String" +reverseString("taat"));
    }

    public static boolean reverseString(String str)
    {
        int length = str.length();
        StringBuffer sb = new StringBuffer();

        for(int i =0;i<length;i++)
        {
            sb = sb.append(str.charAt(i));
        }

        sb.reverse();
        return false;
    }
}
