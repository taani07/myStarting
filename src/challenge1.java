public class challenge1 {
    public static void main(String[] args) {
        String S1= "Hello World";


    }

    public static void reverse(char[] ch,int n, int n2)
    {
        n=0;
        n2= ch.length-1;
        while (n2>n)
        {
            char temp = ch[n2];
            ch[n2] = ch[n];
            ch[n] = temp;
            n2++;
            n--;
        }
    }
}
