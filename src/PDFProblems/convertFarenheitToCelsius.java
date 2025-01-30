package PDFProblems;

import java.util.Scanner;

public class convertFarenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius : ");
        double temp = sc.nextInt();
        double temperatureinCelsius  =  (temp-32)*5/9;
        System.out.println("tempaerature in Farenheit is :" + temperatureinCelsius);
    }
}
