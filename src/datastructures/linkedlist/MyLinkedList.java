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

    public void makeListEmpty(){
        head = null;
        tail = null;
        length = 0;
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

    public Node removeLastItem(){
        if(length == 0){
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
//        if(head.next == null && tail.next == null){
//            head = null;
//            tail = null;
//        }
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
            length++;
        }

    }

    public Node removeFirstItem(){


        //This is the code I wrote and the below code is from the lecture. Both do the same thing but the lecture code is better.
//        if(length == 0 && head == null && tail == null){
//            return null;
//        } else if (length ==1) {
//            Node temp = head;
//            head = head.next;
//            tail = tail.next;
//            length--;
//            return temp;
//         }else {
//            Node temp = head;
//            head = head.next;
//            temp.next = null;
//            length--;
//            return temp;
//        }

        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0){
            tail.next = null;
        }
        return temp;
    }

    public Node getValueAtIndex(int index){
        Node temp = head;
        if (index < 0 || index > length) return null;
        for(int i = 0; i<index;i++){
            temp = temp.next;
        }

        return temp;
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


    /*
    Node temp = head.next;
            head = null;
            head = temp;
            length--;
            return temp;
     */
}
