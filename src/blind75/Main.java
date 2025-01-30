package blind75;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       kidsWithCandies kidsWithCandies = new kidsWithCandies();
        List<Boolean> listOfBoolean = new ArrayList<>();
        int[] candies ={1,3,4,5,3};
        int extraCandies = 2;

        listOfBoolean = kidsWithCandies.kidswithCandies(candies,extraCandies);
        System.out.println("Kids with Extra " +listOfBoolean);

       ReverseVowelsOnly reverseVowelsOnly = new ReverseVowelsOnly();

       String s = "LeetCode";

        System.out.println("Reverse Vowels Only:"+reverseVowelsOnly.reverseVowelsOnly(s));
    }
}
