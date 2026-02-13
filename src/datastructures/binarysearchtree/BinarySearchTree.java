package datastructures.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Note: We are not gonna use a constructor for the "BinarySearchTree" class cause we want root to be null when we create an object of this class.
//      We are gonna use the insert() to add nodes.

//Note : This class also contains Tree Traversal concept codes.

public class BinarySearchTree {
    private Node root;

    class Node{
        int value;
        Node right;
        Node left;

        private Node(int value){
            this.value=value;
        }
    }

    public boolean insert(int value){
        Node newNode=new Node(value);
        if (root==null) {
            root=newNode;
            return true;
        }

        Node temp=root;
        while (true){
            if (temp.value==newNode.value) return false;
            if (newNode.value<temp.value){
                if (temp.left==null) {
                    temp.left = newNode;
                    return true;
                }
                temp=temp.left;
            }else {
                if (temp.right==null) {
                    temp.right = newNode;
                    return true;
                }
                temp=temp.right;
            }
        }
    }

    public boolean contains(int value){
        Node temp=root;
        while (temp!=null){
            if (value<temp.value){
                temp=temp.left;
            } else if (value>temp.value) {
                temp=temp.right;
            }else return true;
        }
        return false;
    }


//-------------------------------------------------------------------------------------------------------------------------------------//
    //Tree Traversal section uses the existing BinarySearchTree class we are adding the code here.
    //The Below Codes are related To Tree Traversal.


    public ArrayList<Integer> BreathFirstSearch(){
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        while (!queue.isEmpty()){
            currentNode=queue.remove();
            results.add(currentNode.value);

            if (currentNode.left != null ){
                queue.add(currentNode.left);
            }
            if (currentNode.right != null ){
                queue.add(currentNode.right);
            }
        }
        return results;
    }

    //There are 3 types of Debth-First-Search and all of them are written recursively.This one is called PreOrder.
    public ArrayList<Integer> DepthFirstSearchPreOrder(){

        ArrayList<Integer> results =  new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode){
                results.add(currentNode.value);
                if (currentNode.left != null){
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null){
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return results;
    }

    public ArrayList<Integer> DepthFirstSearchPostOrder(){
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode){
                if (currentNode.left != null){
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null){
                    new Traverse(currentNode.right);
                }
                results.add(currentNode.value);
            }
        }
        new Traverse(root);
        return results;
    }

}
