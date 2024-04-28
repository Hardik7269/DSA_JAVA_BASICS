import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

class BinaryTreeImpl{
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    static class BuildTree{
        static int index = -1;
        public static Node BinaryTreeSet(int[] arr){
            index++;
            if(arr[index] == -1){
                return null;
            }
            Node newNode = new Node(arr[index]);
            newNode.left = BinaryTreeSet(arr);
            newNode.right = BinaryTreeSet(arr);
            return newNode;
        }

        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }

        public void levelOrder(Node root){
            if(root == null){
                return ;
            }
            Queue<Node> que = new LinkedList<>();
            que.add(root);
            que.add(null);

            while(!que.isEmpty()){
                Node curr = que.poll();
                if(curr == null){
                    System.out.println();
                    if(que.isEmpty()){
                        break;
                    }else{
                        que.add(null);
                    }
                }else{
                    System.out.print(curr.val + " ");
                    if(curr.left != null){
                        que.add(curr.left);
                    }
                    if(curr.right != null){
                        que.add(curr.right);
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BuildTree tree= new BuildTree();
        Node root = tree.BinaryTreeSet(arr);
        // System.out.println(root.right.val);
        tree.postOrder(root);
        System.out.println();
        tree.levelOrder(root);
    }
    
}