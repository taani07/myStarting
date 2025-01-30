package blind75;

public class ReverseWords {
    //String s = "The rain is good"
    //String reverse ="good is rain the"
    public static String reverseWords(String s){
        s = s.trim();
        String[] words = s.split("\\s+");
        int left =0;
        int right = words.length-1;
        while(left<right){
            String  swap = words[left];
            words[left] = words[right];
            words[right] = swap;

            left++;
            right--;
        }
        return String.join(" ",words);
    }

    public static void main(String[] args) {
        String s = "The rain is good";

        System.out.println(reverseWords(s));
    }
}
