package LinkedList;

public class Reverse {

     Node head;
    public static void main(String[] args){

    }

    public static Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;

        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return node;
    }
}
