package ReBirth;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,4,5,2,6);
        List<Integer> result = numbers.stream().filter(n->n%2==0).map(n->n*n).distinct().collect(Collectors.toList());
        System.out.println(result); 
        
    }
    
}
