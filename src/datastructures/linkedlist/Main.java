package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(1);
        myLinkedList.append(2);
        System.out.println("This is the removed item from the list : " + myLinkedList.removeLastItem().value);
        System.out.println("This is the removed item from the list : " + myLinkedList.removeLastItem().value);
        System.out.println("This is the removed item from the list : " + myLinkedList.removeLastItem());

       // System.out.println("Printing all the items from the list : ");
        //myLinkedList.printList();
    }
}
