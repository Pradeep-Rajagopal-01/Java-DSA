package algorithms.sorts.bubblesort;

public class BubbleSortLinkedList {

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

    public BubbleSortLinkedList(int value) {
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


    //DSA Question-Bubble Sort of LL ( ** Interview Question)
    public static void bubbleSort(BubbleSortLinkedList list){
        if (list.length < 2) return;

        Node sortedUntil= null;

        while (sortedUntil!=list.head.next){
            Node current=list.head;
            while (current.next!=null && current.next!=sortedUntil){
                Node nextNode=current.next;
                if (current.value > nextNode.value){
                    int temp=current.value;
                    current.value= nextNode.value;
                    nextNode.value=temp;
                }
                current=current.next;
            }
            sortedUntil=current;
        }
    }

    public static void main(String[] args) {

        BubbleSortLinkedList bubbleSortLinkedList = new BubbleSortLinkedList(7);
        bubbleSortLinkedList.append(5);
        bubbleSortLinkedList.append(2);
        bubbleSortLinkedList.append(1);
        bubbleSortLinkedList.append(6);
        bubbleSortLinkedList.append(9);
        bubbleSortLinkedList.append(4);

        bubbleSort(bubbleSortLinkedList);

        bubbleSortLinkedList.printList();

    }
}
