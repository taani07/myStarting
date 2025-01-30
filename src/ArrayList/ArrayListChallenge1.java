package ArrayList;

import java.util.LinkedList;

public class ArrayListChallenge1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydenet");
        placesToVisit.add(0,"Delhi");
        placesToVisit.add(2,"Tokyo");

        System.out.println(placesToVisit);
        addMoreItems(list);
    }

    public static void addMoreItems(LinkedList<String> list)
    {
        list.add("Hello");
        list.addFirst("Hey");
        list.addLast("there");
        System.out.println(list);
    }
}
