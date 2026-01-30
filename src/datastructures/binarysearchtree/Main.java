package datastructures.binarysearchtree;

public class Main {

    public static void main(String[] args) {

//        This is an iterative version meaning the methods use a loop to move to next nodes.
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(7);
        binarySearchTree.insert(4);
        binarySearchTree.insert(8);
        binarySearchTree.insert(1);

        System.out.println(binarySearchTree.contains(7));


    }

}
