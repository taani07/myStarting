package BST;

public class isBST {

    boolean isBST(Node root , int min, int max)
    {
        if(root==null)
            return true;
        if(root.data<min || root.data>max)
            return false;
        if(isBST(root.left,min,root.data-1)&&isBST(root.right,root.data+1,max))
        {
            return true;
        }

        return false;

    }

   void stporeInOrder(Node node, int arr[])
   {
       if(node == null)
           return;
       stporeInOrder(node.left,arr);

   }
}
