package LinkedList;

public class ReverseALinkedList {
    public static void main(String[] args) {
        Node tail= null;
        Node head = null;

        for(int i =0;i<5;i++)
        {
           Node node = new Node(i);
           if(head==null)
           {
               head = node;
           }else
           {
               tail.setNext(node);
           }

           tail = node;
        }

       // return head;
    }

    //public static Node reverseListRecursive()

}
