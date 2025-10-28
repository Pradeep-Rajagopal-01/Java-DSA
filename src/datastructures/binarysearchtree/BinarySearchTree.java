package datastructures.binarysearchtree;

//Note: We are not gonna use a constructor for the "BinarySearchTree" class cause we want root to be null when we create an object of this class.
//      We are gonna use the insert() to add nodes.
public class BinarySearchTree {
    Node root;

    class Node{
        int value;
        Node right;
        Node left;

        private Node(int value){
            this.value=value;
        }
    }
}
