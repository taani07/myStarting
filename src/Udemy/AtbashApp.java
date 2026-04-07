package Udemy;

import java.util.Scanner;
public class AtbashApp{
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);

            //Display Menu

            System.out.println("Welcome to encoder-decoder game!");
            System.out.println("1.Encode a String");
            System.out.println("2. Decode a String");
            System.out.println("Choose betwwen 1 or 2");
            int choice = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter the String");
            String str = sc.nextLine();

        }
    }
}