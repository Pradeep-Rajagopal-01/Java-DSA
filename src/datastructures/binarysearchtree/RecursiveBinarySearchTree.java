package datastructures.binarysearchtree;

//This is a recursive BST meaning the methods in this are written recursively.
public class RecursiveBinarySearchTree {
    private Node root;

    class Node{
        int value;
        Node right;
        Node left;

        private Node(int value){
            this.value=value;
        }
    }

    private Node recursiveInsert(Node currentNode, int value){
        if (currentNode == null) return new Node(value);

        if (value < currentNode.value){
            currentNode.left = recursiveInsert(currentNode.left,value);
        } else if (value > currentNode.value) {
            currentNode.right = recursiveInsert(currentNode.right,value);
        }
        return currentNode;
    }

    private boolean recursiveContains(Node currentNode, int value){
        if (currentNode == null) return false;

        if (currentNode.value == value) return true;

        if (value < currentNode.value){
            return recursiveContains(currentNode.left,value);
        }else {
            return recursiveContains(currentNode.right,value);
        }
    }

    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    private Node deleteNode(Node currentNode, int value) {
        if (currentNode == null) return null;

        if (value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            } else if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            } else {
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
    }

    public void recursiveInsert(int value){
        if (root == null) root = new Node(value);
        recursiveInsert(root,value);
    }

    public boolean recursiveContains(int value){
        return recursiveContains(root,value);
    }

    public void deleteNode(int value) { root = deleteNode(root, value); }

    //DSA Question-BST: Convert Sorted Array to Balanced BST ( ** Interview Question)
//    private Node sortedArrayToBST(int [] nums, int left, int right){
//        int middleNode = nums[nums.length / 2];
//
//        return middleNode;
//    }

//    public int sortedArrayToBST(){
//        int nums[] = {1,2,3,4,5,6,7};
//        return sortedArrayToBST(nums,0,nums.length);
//    }



}
