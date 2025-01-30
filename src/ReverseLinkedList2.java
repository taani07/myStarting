public class ReverseLinkedList2 {
    Node head ;
    Node tail ;
    int length ;

    class Node{
        int value;
        Node next ;

        public Node(int value)
        {

            this.value = value;
        }
    }

    public ReverseLinkedList2(int value)
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length =1;

    }

    public void printList()
    {
        Node temp =head;
        while(temp.next!=null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
   public void reverse(){
        Node temp=head;
        head = tail;
        tail= temp;
        Node after = temp.next;
        Node before = null;
        for(int i=0;i<length;i++)
        {
            after = temp.next;
            temp.next = before ;
            before = temp;
            temp= after;
        }


   }
}
