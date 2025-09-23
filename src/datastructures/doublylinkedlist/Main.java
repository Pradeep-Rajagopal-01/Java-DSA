package datastructures.doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        MyDoublyLinkedList doublyLinkedList = new MyDoublyLinkedList(7);
        doublyLinkedList.append(5);
        doublyLinkedList.append(8);
        doublyLinkedList.removeLast();

        System.out.println(doublyLinkedList.getLength());

        System.out.println("Printing all the items from the list : ");
        doublyLinkedList.printList();

    }
}
