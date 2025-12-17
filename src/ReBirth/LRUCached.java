package ReBirth;

import java.util.HashMap;

public class LRUCached{

    class Node{
        int key, value;
        Node prev, next;

        Node(int key , int value)
        {
          this.key = key;
          this.value = value;
        }


    }

    private  int capacity,size ;
    private HashMap<Integer, Node> map;
    private Node head,tail;

    public LRUCached(int capacity)
    {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0,0);  //dummy head
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;

    }

    private void addNode(Node node){
                //head <-> A
                //node.next = A
                //A.prev = node 
                //head.next = node
                //node.prev = head 
                //head <-> node <-> A

                node.next = head.next;
                head.next.prev = node;
                    head.next = node;
                    node.prev = head;
    }

    private void remove(Node node)
    {
            node.prev.next = node.next;
            node.next.prev = node.prev;
    }

    // public static void main(String[] args) {
    //     //System.out.println("hello");


    // }

    public int get(int key)
    {
        if(!map.containsKey(key)) return -1;
        Node node =     map.get(key);
        remove(node);
        addNode(node);
        return node.value;
    }

    public void put(int key,int value)
    {
        if (map.containsKey(key))
        {
            remove(map.get(key));
        }
        if(map.size()==capacity)
        {
            map.remove(tail.prev.key);
            remove(tail.prev);
        }
        Node node = new Node(key, value);
        addNode(node);
            map.put(key, node);
    }

}


