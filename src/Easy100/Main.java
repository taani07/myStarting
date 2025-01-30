package Easy100;

import java.util.Scanner;

import static Easy100.isPalindrome.isPalindroms;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String!!c ");
        String str = sc.nextLine();
        isPalindroms(str);
    }
}
