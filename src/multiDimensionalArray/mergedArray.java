package multiDimensionalArray;

public class mergedArray {

    public static String mergedString(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i<s1.length() && j<s2.length())
        {
            sb.append(s1.charAt(i++));
            sb.append(s2.charAt(j++));

        }
        while(i<s1.length())
        {
            sb.append(s1.charAt(i++));
        }
        while(j<s2.length())
        {
            sb.append(s2.charAt(j++));
        }

        return sb.toString();
    }

    public static String mergedString2(String s1, String s2){

        StringBuilder sb = new StringBuilder();
        int i =0;
        while(i<s1.length()||i<s2.length())
        {
            if(i<s1.length())
            {
                sb.append(s1.charAt(i));
            }
            if(i<s2.length())
            {
                sb.append(s2.charAt(i));
            }
            i++;

        }
        return sb.toString();
    }

    public static String greatestDivisor(String s1, String s2)
    {
        if(!(s1+s2).equals(s2+s1))
            return "";
        int gcdLength = gcd(s1.length(),s2.length());
        String gcd = s1.substring(0,gcdLength);
        return gcd;
    }


    public static int gcd(int a, int b)
    {
        if(b==0) return a;
        return gcd(b, a%b);

    }

}
