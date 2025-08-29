package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(1);
        myLinkedList.append(2);

//        try {
//            System.out.println("Removing Last Item : " + myLinkedList.removeLastItem().value);
//        } catch (NullPointerException e) {
//            System.out.println("Nothing to remove(end)");;
//        }


//        myLinkedList.prepend(7);

        try {
            System.out.println("Removing First Item : " + myLinkedList.removeFirstItem().value);
        } catch (NullPointerException e) {
            System.out.println("Nothing to remove(Beginning)");;
        }

        System.out.println("Printing all the items from the list : ");
        myLinkedList.printList();



    }
}
