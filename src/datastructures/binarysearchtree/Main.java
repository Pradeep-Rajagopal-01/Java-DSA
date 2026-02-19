package datastructures.binarysearchtree;

public class Main {

    public static void main(String[] args) {

//        This is an iterative version meaning the methods use a loop to move to next nodes.
        BinarySearchTree binarySearchTree = new BinarySearchTree();

//        binarySearchTree.insert(47);
//        binarySearchTree.insert(21);
//        binarySearchTree.insert(76);
//        binarySearchTree.insert(18);
//        binarySearchTree.insert(27);
//        binarySearchTree.insert(52);
//        binarySearchTree.insert(82);

        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(7);
        binarySearchTree.insert(2);
        binarySearchTree.insert(4);
        binarySearchTree.insert(6);
        binarySearchTree.insert(8);

//        System.out.println(binarySearchTree.BreathFirstSearch());

//        System.out.println(binarySearchTree.DebthFirstSearchPreOrder());

//        System.out.println(binarySearchTree.DepthFirstSearchPostOrder());

//        System.out.println(binarySearchTree.DepthFirstSearchInOrder());

//        System.out.println(binarySearchTree.isValidBST());

        System.out.println(binarySearchTree.kthSmallest(3));


    }

}
