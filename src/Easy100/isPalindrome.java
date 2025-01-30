package Easy100;

public class isPalindrome {

    public static void isPalindroms(String str)
    {
        int length = str.length();

        String reverse = "";
        for(int i=length-1;i>=0;i--) {
            reverse = str.charAt(i) + reverse;
        }
           if(str.equals(reverse)){
               System.out.println("string is Palindrome");
           }else{
               System.out.println("String is not a Palindrone");
           }

    }
}
