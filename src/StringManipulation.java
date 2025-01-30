public class StringManipulation {
    public static void main(String[] args) {
       String is = "My name is Tanishka ";
       replaAll(is);
    }

    public static void replacesAll(char[] str, int length)
    {
        int spacecount =0, newlength, i;
        for(i=0;i<length;i++) {
            if (str[i] == ' ')
            {
                spacecount++;
            }
        }
         newlength = length + spacecount*2;
        str[newlength] ='\0';

    }

    public static void replaAll(String Str)
    {
        String s = Str.replace("\s","\20");
        System.out.println(s);
    }
}
