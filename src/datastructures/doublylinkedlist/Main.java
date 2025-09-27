package datastructures.doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        MyDoublyLinkedList doublyLinkedList = new MyDoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(3);
        doublyLinkedList.append(2);
        doublyLinkedList.append(1);



        //System.out.println("Value of removed node(last-node) : " + doublyLinkedList.removeLast().value);

//        doublyLinkedList.makeEmpty();

//        doublyLinkedList.prepend(9);

//        System.out.println("Value of the removed node (first-node)  : " +  doublyLinkedList.removeFirst().value);

//        System.out.println(doublyLinkedList.get(4).value);

//        doublyLinkedList.set(2,10);

//        doublyLinkedList.insert(7 ,17);

//        doublyLinkedList.remove(0);

        System.out.println(doublyLinkedList.isPalindrome());

        System.out.println("Length of the Doubly-Linked-List : " + doublyLinkedList.getLength());

        System.out.println("Printing all the items from the list : ");
        doublyLinkedList.printList();

    }
}
