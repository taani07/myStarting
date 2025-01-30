package List;

import java.util.ArrayList;
import java.util.List;

public class mergingTwoList {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(3);
        List<Integer> l2 = new ArrayList<>();
        l2.add(5);
        System.out.println(merger(l1,l2));

    }

    public static List merger(List<Integer> list, List<Integer> list2)
    {
        list = new ArrayList<>();
        list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>(list);
        list3.addAll(list2);
        System.out.println(list3);

        return list3;
    }
}
