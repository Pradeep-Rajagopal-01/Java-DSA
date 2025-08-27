package datastructures.linkedlist;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{ // Everytime we create an object of this class a new node will be created.

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
        length = 1;
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

        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void removeLastItem(){
        Node temp = head;
        Node pre = head;

        if(length == 0){
        }
        while (temp.next != null){
            pre = temp;
            temp = head.next;
            if(temp == null){
                tail = pre;
                tail.next = null;
            }
        }

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
