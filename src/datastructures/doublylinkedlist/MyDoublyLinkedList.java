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

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
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
        Node temp=tail;
        if (length == 0) {
            return null;
        } else if (length==1) {
            head=null;
            tail=null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if (length==0) {
            head=newNode;
            tail=newNode;
        }else {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        length++;
    }

    public Node removeFirst(){
       Node temp=head;
        if(length==0){
            return null;
        } else if (length==1) {
            head=null;
            tail=null;
        }else {
            head=head.next;
            head.prev=null;
            temp.next=null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {//Note: This is your logic and it works perfectly.
        Node temp = head;
        if (index < 0 || index >= length) return null;
        if (index <= length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i=0; i<(length-1) - index;i++) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp=get(index);
        if (temp!=null){
            temp.value=value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {//Works as intended but fails the tests will fix it.
        if (index<0 || index>length) return false;
        if (length==0){
            prepend(value);
            return true;
        }
        if(index==length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before=get(index-1);
        Node after=before.next;
        newNode.prev=before;
        newNode.next=after;
        before.next=newNode;
        after.prev=newNode;
        length++;
        return true;
    }

//    public Node remove(int index){
//        Node pre=get(index-1);
//        Node temp=pre.next;
//        Node post=temp.next;
//
//    }



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
