package NewBeginnings;

public class BST {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);


    }
}
    class TreeNode{

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
            this .right =null;
            this.left = null;
        }

}
