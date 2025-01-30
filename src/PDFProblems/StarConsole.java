package PDFProblems;

import java.util.Arrays;

public class StarConsole {
    public static void main(String[] args) {
        int row, noOfStar;

        for(row=1;row<10;row++)
        {
            for(noOfStar=1;noOfStar<=row;noOfStar++)
            {
                System.out.println("*");
            }
            System.out.println(); //go to the next line
        }

        String Str = "Hello planet earth, you are a great planet";
        System.out.println("Index is " +Str.indexOf("planet"));
        int[] arr = {2,3,4,5,6,7,8,3};
      //  reverseArr(arr);
        reverseNumber(102378);
        reverseString("Gaana");


    }

    public static int[] reverseArr(int[] arr1)
    {
        int length = arr1.length;

        int[] arr2 = new int[length];

        for(int i=0;i<length;i++)
        {
            arr2[i]=arr1[length-1-i];
        }
        for (int i:arr2
             ) {
            System.out.println(i);
        }
        return arr2;
    }

    public static int reverseNumber(int t)
    {
        int reverseT =0;

        while(t!=0)
        {
            reverseT = reverseT*10;
            reverseT = reverseT + t%10;
            t = t/10;
        }

        System.out.println("The reverse is " +reverseT);
        return  reverseT;

    }

    public static String reverseString(String str)
    {
        char[] ch = str.toCharArray();
        int len = ch.length;
        char[] ch1 = new char[len];
        for(int i =0;i<len;i++)
        {
            ch1[i]= ch[len-1-i];
        }
        for (char c :ch1
             ) {
            System.out.println(c);

        }
       // System.out.println("reverse String " + Arrays.toString(ch1));
        //return Arrays.toString(ch1);

        StringBuilder sb = new StringBuilder();
        sb.append(ch1);
        System.out.println("reverse String with StringBuilder "+sb.toString());
        System.out.println("reverse String with StringBuilder reverse "+sb.reverse());
        return sb.toString();
    }

}
