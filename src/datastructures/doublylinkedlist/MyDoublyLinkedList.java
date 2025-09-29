package datastructures.doublylinkedlist;

import datastructures.linkedlist.MyLinkedList;

import javax.imageio.metadata.IIOMetadataFormat;

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

    public boolean insert(int index, int value) {
        if (index<0 || index>length) return false;
        if (index==0){
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

    public Node remove(int index){
        if (index<0 || index>=length) return null;

        if (index==0){
            return removeFirst();
        } else if (index==length-1) {
            return removeLast();
        }
        Node temp=get(index);
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
        temp.next=null;
        temp.prev=null;
        length--;
        return temp;
    }

    //DSA Question-Palindrome Checker( ** Interview Question)
    public boolean isPalindrome(){
        if(length<=1) return true;

        Node forward=head;
        Node backward=tail;

        for (int i=0; i<length/2; i++){
            if (forward.value!=backward.value){
                return false;
            }
            forward=forward.next;
            backward=backward.prev;
        }
        return true;
    }

    //DSA Question-Reverse ( ** Interview Question)
    public void reverse(){//Your Logic
        Node current=head;
        Node temp=null;

        while (current!=null){
            current.prev=current.next;
            current.next=temp;
            temp=current;
            current=current.prev;
        }
        tail=head;
        head=temp;
    }

    //DSA Question-Partition List ( ** Interview Question)--Unsolved
    public void partitionList(int value){
        if (head==null) return;
        Node dummy1=new Node(0);
        Node dummy2=new Node(0);
        Node prev1;
        Node prev2;
        Node current=head;

        while (current!=null) {
            if (current.value < value) {
                prev1 = current;
                current = current.next;
                prev1.next.prev = prev1.prev;
                prev1.prev.next = prev1.next;
            }
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
