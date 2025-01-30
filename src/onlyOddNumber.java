import java.util.List;

public class onlyOddNumber {
    public static void main(String[] args) {

    }

    public static boolean onlyOddNumber(List<Integer> list)
    {
        for (int i:list) {
            if(i%2==0)
                return false;
        }
        return true;
    }
}
