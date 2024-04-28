public class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val , TreeNode left , TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class SumTillLeaf{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);

        TreeNode leftSub = new TreeNode(5 , null , null);
        TreeNode rightSub = new TreeNode(1 , null , null);
        root.left = new TreeNode(9 , leftSub , rightSub);
        root.right = new TreeNode(0 , null , null);

        printNode(root , "");
    }

    public static void printNode(TreeNode root , String str){
        if(root == null){
            return;
        }
        str = str+root.val;
        if(root.left == null && root.right == null){
            System.out.println(str);
        }
        printNode(root.left , str);
        printNode(root.right , str);
    }
}