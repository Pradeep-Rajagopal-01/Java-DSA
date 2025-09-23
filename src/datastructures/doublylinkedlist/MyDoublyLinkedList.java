package datastructures.doublylinkedlist;

import datastructures.linkedlist.MyLinkedList;

public class MyDoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{ // Everytime we create an object of this class a new node will be created.
        int value;
        Node next;
        Node prev;

        Node (int value){
            this.value = value;
        }
    }
    public MyDoublyLinkedList(int value){
        Node newNode = new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (head==null){
            head=newNode;
            tail=newNode;
        }else {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        } else if (length==1) {
            Node temp=head;
            head=null;
            tail=null;
            length--;
            return temp;
        } else {
            Node temp = tail;
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
            length--;
            return temp;
        }
    }

    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

}
