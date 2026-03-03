package algorithms.sorts.selectionsort;

public class SelectionSortLinkedList {

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

    public SelectionSortLinkedList(int value) {
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

    //DSA Question-Selection Sort of LL ( ** Interview Question)
    public void selectionSort(SelectionSortLinkedList list){
        if (list.getLength() < 2) return;

        Node current=list.head;
        while (current.next!=null){
            Node minNode=current;
            Node traverse=minNode.next;
            while (traverse!=null){
                if (traverse.value < minNode.value){
                    minNode=traverse;
                }
                traverse=traverse.next;
            }
            if (current!= minNode) {
                int temp= minNode.value;
                minNode.value = current.value;
                current.value = temp;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {

        SelectionSortLinkedList selectionSortLinkedList = new SelectionSortLinkedList(7);
        selectionSortLinkedList.append(9);
        selectionSortLinkedList.append(4);
        selectionSortLinkedList.append(6);
        selectionSortLinkedList.append(2);
        selectionSortLinkedList.append(1);
        selectionSortLinkedList.append(3);

        selectionSortLinkedList.selectionSort(selectionSortLinkedList);

        selectionSortLinkedList.printList();
    }
}



