package  FunctionalProgramming  ;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class EasyProblems{

    public static void main(String[] args){
        List<Integer> number = Arrays.asList(1,2,3,4,5,6);

         List<Integer> squaredNumber = number.stream().filter(n -> n % 2 == 0)
                 .map(n -> n * n).toList();

         System.out.println(squaredNumber);
    }
}

