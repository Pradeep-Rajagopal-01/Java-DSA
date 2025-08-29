package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);

//        try {
//            System.out.println("This is the removed item from the list : " + myLinkedList.removeLastItem().value);
//        } catch (NullPointerException e) {
//            System.out.println("Nothing to remove(end)");;
//        }


        myLinkedList.prepend(7);//Problem here infinite loop only when you remove thr mylist constructor Solution set length to 0 where you're declaring it and remobe constructor..


        try {
            System.out.println("Removing First Item : " + myLinkedList.removeFirstItem().value);
        } catch (NullPointerException e) {
            System.out.println("Nothing to remove(Beginning)");;
        }

        System.out.println("Printing all the items from the list : ");
        myLinkedList.printList();



    }
}
