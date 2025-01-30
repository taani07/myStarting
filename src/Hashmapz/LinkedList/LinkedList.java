package Hashmapz.LinkedList;

public class LinkedList {

    class Node{
        int value =0;
        Node Next;

      public  Node(int value)
        {
            this.value = value;

        }
    }

    private Node head;
    private Node tail;
    private int length ;

    public LinkedList(int value)
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp = temp.Next;
        }
    }

    public void getHead()
    {
        System.out.println("head is :"+head.value);
    }



    public int getLength() {
        System.out.println("length: "+length);
        return length;
    }

    public void append(int value)
    {
        Node newNode = new Node(value);
        if(head ==null)
        {
            head = newNode;
            tail = newNode;
        }else
        {
            tail.Next = newNode;
            newNode = tail;
        }
        length++;
    }

    public void getTail()
    {
        System.out.println("tail is "+tail.value);
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.Next;
        Node before = null;
        for(int i=0;i<length;i++)
        {
            after = temp.Next;
            temp.Next= before;
            before = temp;
            temp = after;
        }

    }
}
