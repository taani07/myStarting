public class countTheNumber {
    public static void main(String[] args) {
        String s = "aaccddeeffe";
        //String s2 = "a2c2d2e2f2";
        System.out.println(compressedString(s));
    }

    public static String compressedString(String Str)
    {
        String NewStr = "";
        char ch = Str.charAt(0);
        int count =0;

        for(int i=0;i<Str.length();i++)
        {
            if(Str.charAt(i)==ch)
            {
                count ++;
            }else
            {
                NewStr = NewStr + ch  + "" + count;
                ch = Str.charAt(i);
                count =1;
            }
        }

        return NewStr + ch + count;
    }
}
