package datastructures.linkedlist;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{

        int value;
        Node next;

        Node (int value){
            this.value = value;
        }
    }

    public MyLinkedList(int value){

        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);

        if(head==null && tail ==null){
            head.value = value;
            tail.value = value;
        }else {
            tail.value = value;
        }
//        tail.value = value;
//        System.out.println(tail.value);
    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void gettail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }


}
