package LinkedList2;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next ;

        Node(int value)
        {
            this.value = value;
        }

    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length =1;

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


    public void getHead() {
        System.out.println("head : " + head.value);

    }

    public void getTail() {
        System.out.println("tail : " + tail.value);
    }

    public void getLength() {
        System.out.println("length :" + length);
    }

    public void append(int value)
    {
        Node newNode = new Node(value);
        if(length==0){
            newNode = head;
            newNode = tail;
        }else{
            tail.next = newNode;
            newNode = tail;
        }
        length++;

    }

    public Node removeLast(){
        if(length ==0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next!=null)
        {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next= null;
        length--;
        if(length==0)
        {
            head =null;
            tail = null;

        }return temp;

    }








}
