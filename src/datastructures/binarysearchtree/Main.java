package datastructures.binarysearchtree;

public class Main {

    public static void main(String[] args) {

//        This is an iterative version meaning the methods use a loop to move to next nodes.
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(47);
        binarySearchTree.insert(21);
        binarySearchTree.insert(76);
        binarySearchTree.insert(18);
        binarySearchTree.insert(27);
        binarySearchTree.insert(52);
        binarySearchTree.insert(82);

        System.out.println(binarySearchTree.BreathFirstSearch());

    }

}
