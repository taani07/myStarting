import Educative.Challenge2;

import java.util.HashSet;

public class RecurringCharacters {
    //String str ="Programming"
    public static void printRecurringCharacter(String str)
    {
        HashSet<Character> seen = new HashSet<>();
        HashSet<Character> recurring  = new HashSet<>();

        for(char ch : str.toCharArray())
        {
            if(seen.contains(ch))
            {
                recurring.add(ch);
            }else
            {
                seen.add(ch);
            }
        }

        for (char ch:recurring) {
            System.out.println(ch);
        }

    }

    public static void main(String[] args) {
        String str = "Programming";
        printRecurringCharacter(str);
    }
}
