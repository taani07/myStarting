package FunctionalProgramming;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProblems {
    public static void main(String[] args){
        List<Integer> listofInts = Arrays.asList(1,2,5,6,7,8,4,9,8);

        List<Integer>  sumofEvenSquares = listofInts.stream()
                .filter(n-> n%2==0)
                .map(n-> n*n).
                collect(Collectors.toList());

        System.out.println(sumofEvenSquares);
    }
}
