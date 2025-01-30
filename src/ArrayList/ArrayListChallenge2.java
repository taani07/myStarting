package ArrayList;

import java.util.Scanner;

public class ArrayListChallenge2 {
    //public static Scanner = new Scanner(System.in);
    public static void main(String[] args){

      printAction();
    }

    public static void addItems(String[] groceries){
        System.out.println("Add items separated by comma : ");


    }

    public static void printAction()
    {
        String textBlock = """
                Available Action:
                0 - to shutdown 
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (coma delimited list)
                Enter a number for which action you want to do:""";
        System.out.println(textBlock);
    }
}
