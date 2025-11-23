public class LinkedList {

    private Node head;
    private Node tail;
    private int length ;

    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList(int data)
    {
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        length=1;
    }




     public void printList()
     {
         Node temp = head;
         while(temp!=null)
         {
             System.out.println(temp.data);
             temp = temp.next;
         }
     }

     public void append(int value)
     {
         LinkedList ll = new LinkedList(value);
         Node newNode = new Node(value);
         if(length==0)
         {
             head =newNode;
             tail = newNode;
         }else
         {
            tail.next = newNode;
            tail = newNode;
         }
         length++;
     }


    public void LinkedListReverse()
    {
       Node temp = head;
       head = tail;
       tail = temp;
       Node after =temp.next;
       Node before = null;
       for(int i=0;i<length;i++)
       {
           after = temp.next;
           temp.next = before;
           before = temp;
           temp=after;
       }
    }


        public boolean hasCycle(Node  head)
        {
            if(head==null || head.next==null)
            {
                return true;
            }

            Node slow = head;
            Node fast = head;

            while(fast!=null && fast.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
                if(slow==fast)
                {
                    return true;
                }
            }

            return false;
        }


    public static void main(String[] args) {

        LinkedList LL = new LinkedList(1);
        LL.append(3);
        LL.append(6);
        LL.append(7);

        LL.printList();

        LL.LinkedListReverse();

        LL.printList();


    }
}
