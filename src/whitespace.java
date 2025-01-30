public class whitespace {
    public static void main(String[] args) {

    }
    public static String iswhitespaceremoved(String str){
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char c:ch){
            if(!Character.isWhitespace(c))
            {
                sb.append(c);
            }
        }

        return sb.toString();

    }
}
