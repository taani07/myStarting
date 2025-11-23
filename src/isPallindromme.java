public class isPallindromme {

    public static boolean isPallindrome(String str)
    {
        str = str.replaceAll("\\s+","").toLowerCase();
        int left =0;
        int right =str.length()-1;

        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
