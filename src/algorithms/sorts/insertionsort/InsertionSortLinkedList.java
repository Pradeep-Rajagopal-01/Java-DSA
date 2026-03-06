package algorithms.sorts.insertionsort;

public class InsertionSortLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public InsertionSortLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //DSA Question-Insertion Sort of LL ( ** Interview Question)
    public void insertionSort(InsertionSortLinkedList list) {
        if (list.getLength() < 2) return;

        Node sortedListHead=list.head;
        Node unsortedListHead=list.head.next;
        sortedListHead.next=null;

        while (unsortedListHead!=null){
            Node current=unsortedListHead;
            unsortedListHead=unsortedListHead.next;

            if (current.value < sortedListHead.value){
                current.next=sortedListHead;
                sortedListHead=current;
            }else {
                Node searchPointer=sortedListHead;

                while (searchPointer.next!=null && current.value > searchPointer.next.value){
                    searchPointer=searchPointer.next;
                }
                current.next=searchPointer.next;
                searchPointer.next=current;
            }
        }

        list.head=sortedListHead;

        Node temp=list.head;
        while (temp.next!=null) temp=temp.next;
        list.tail=temp;
    }

    public static void main(String[] args) {
        InsertionSortLinkedList insertionSortLinkedList = new InsertionSortLinkedList(7);
        insertionSortLinkedList.append(5);
        insertionSortLinkedList.append(8);
        insertionSortLinkedList.append(9);
        insertionSortLinkedList.append(3);
        insertionSortLinkedList.append(1);
        insertionSortLinkedList.append(4);

        insertionSortLinkedList.insertionSort(insertionSortLinkedList);

        insertionSortLinkedList.printList();

    }



}

