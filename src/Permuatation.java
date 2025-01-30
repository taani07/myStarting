import java.util.Arrays;

public class Permuatation {
    public static void main(String[] args) {
        System.out.println("two Strings are : "+isPermutation("dog","gods"));
    }

    public static boolean isPermutation(String str1, String str2)
    {

        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);

        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);

        if(str1.length()!=str2.length())

        {
            System.out.println("String not permuations of each other");
            return false;
        }

        return Arrays.equals(ch1, ch2);
    }
}
