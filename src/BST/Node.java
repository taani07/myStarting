package BST;

public class Node {
    public Node left;
    public Node right;
    public int data;

    public Node(int data, Node left, Node right)
    {
        this.left = left;
        this.right = right;
        this.data = data;
    }
}
