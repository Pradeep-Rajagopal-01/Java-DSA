package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(6);
        myLinkedList.append(5);
        myLinkedList.append(4);
        myLinkedList.append(2);
        myLinkedList.append(0);
        myLinkedList.append(1);
//        myLinkedList.append(1);
//        myLinkedList.append(6);
//        myLinkedList.append(9);
//        myLinkedList.append(9);



//        try {
//            System.out.println("Removing Last Item : " + myLinkedList.removeLastItem().value);
//        } catch (NullPointerException e) {
//            System.out.println("Nothing to remove(end)");;
//        }


//        myLinkedList.prepend(7);

//        try {
//            System.out.println("Removing First Item : " + myLinkedList.removeFirstItem().value);
//        } catch (NullPointerException e) {
//            System.out.println("Nothing to remove(Beginning)");;
//        }

//        try {
//            System.out.println(myLinkedList.getValueAtIndex(1).value);
//        } catch (NullPointerException e) {
//            System.out.println(e);
//        }

       // System.out.println(myLinkedList.setValueAtIndex(4,8));

       // System.out.println(myLinkedList.insertNodeAtIndex(0,7));

//        try {
//            System.out.println(myLinkedList.removeNodeAtIndex(5).value);
//        } catch (NullPointerException e) {
//            System.out.println(e);;
//        }

        //myLinkedList.reverse();
//        myLinkedList.removeDuplicates();

//        System.out.println(myLinkedList.binaryToDecimal());

        myLinkedList.partitionList(3);

        System.out.println("Printing all the items from the list : ");
        myLinkedList.printList();



    }
}
