package Easy100;

import java.util.Scanner;

public class subStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you String to print all its substring");

        String str = sc.nextLine();
        int length = str.length();
        System.out.println(" Substring of Entered String "+str +"are/n");

        for(int i =0;i<length;i++)
        {
            for(int j =0;j<=length-i;j++)
            {
                String sub = str.substring(i,i+j);
                System.out.println(sub);
            }
        }
    }
}
