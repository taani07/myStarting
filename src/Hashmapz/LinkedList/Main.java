package Hashmapz.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
      //  list = new LinkedList(6);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.printList();
        list.reverse();
        list.printList();

    }
}
