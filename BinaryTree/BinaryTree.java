class BinaryTree{
   

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){                                                                                                 
            this.data = data;
            this.right = right;
            this.left = left;       
        }   
    }

    static int idx = -1;
    static public Node BinaryTree(int arr[]){
        idx++;
        if(arr[idx] == -1){
            return null;
        }

        Node newNode = new Node(arr[idx]);
        newNode.left = BinaryTree(arr);
        newNode.right = BinaryTree(arr);
        return newNode;
    }

    public static  void main(String [] args){
        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree(arr);
        System.out.println("done");
    }

}