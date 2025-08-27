package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(1);
        myLinkedList.append(5);
        myLinkedList.append(7);
        myLinkedList.append(8);
        myLinkedList.removeLastItem();
        myLinkedList.printList();
    }
}
