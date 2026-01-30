package datastructures.binarysearchtree;

public class RecursiveBinarySearchTreeMain {

    public static void main(String[] args) {

        //This is a recursive version of BST (Methods use recursion to move to the next nodes).

        RecursiveBinarySearchTree rBST = new RecursiveBinarySearchTree();

        rBST.recursiveInsert(5);
        rBST.recursiveInsert(7);
        rBST.recursiveInsert(8);
        rBST.recursiveInsert(3);
        rBST.recursiveInsert(1);

        System.out.println(rBST.recursiveContains(5));
        rBST.deleteNode(5);


    }
}
