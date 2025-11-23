public class Challange2 {
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int length ;

    public Challenge2(int value)
    {

    }



    public static void LinkedListReverse(Node head, Node tail)
    {
       Node temp = head;
       head = tail;
       tail = temp;
       Node after =temp.next;
       Node before = null;
       for(int i=0;i<)
    }
    public static void main(String[] args) {

    }
}
