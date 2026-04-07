
import java.util.Scanner;

public class ManipulateVariables {
    public static void main(String[] args){
        mainpulateVariables();
        stringManipulation();
    }

    public static void mainpulateVariables()
    {
    int a =10;
    double b=2.2;
    char c='A';
    boolean isnumber = false;
    String str = "Java Programming";
    
    System.out.println("Initial Variables");
    System.out.println("a: "+a);
    System.out.println("b: "+b);
    System.out.println("c: "+c);
    System.out.println("isNumber: "+isnumber);
    System.out.println("str: "+str);

    System.out.println("\nPerforming Arithmetic Operations:");

    System.out.println("Sum of Integer + 20: "+a+20);

    System.out.println("\nDivision of floatingPointNumber by 2.0: "+b/2.0);

    System.out.println("\nTypecasting Demonstration:");

    System.out.println("\nCasted flotingPointNumber to int:" +(int)b);
    System.out.println("\n String Manipulation:");

    System.out.println("\n Combined String: :"+str +" is fun");
    System.out.println("\nBoolean Logic:");

    System.out.println("\nNegation of isTrue:"+ !isnumber);

}
public static void stringManipulation()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a full sentence ");

    String sentence = sc.nextLine();

    System.out.println("Length of the sentences: "+ sentence.length());

    System.out.println("the first and last character of the sentence: "+sentence.charAt(0)+" "+sentence.charAt(sentence.length()-1));

    System.out.println("Enter a another sentence ");
    String sentence2 = sc.nextLine();


    System.out.println("Compare the two sentences: "+ sentence.equals(sentence2));

    System.out.println("Compare the two sentences: "+ sentence.equalsIgnoreCase(sentence2));
    System.out.println("Compare the two sentences: "+ sentence.substring(1));
    System.out.println("Compare the two sentences: "+ sentence.substring(1));
}
}
