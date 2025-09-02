package datastructures.linkedlist;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{ // Everytime we create an object of this class a new node will be created.

        int value;
        Node next;

        Node (int value){
            this.value = value;
        }
    }

    public MyLinkedList(int value){

        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void makeEmpty(){
        head = null;
        tail = null;
        length = 0;
    }

    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);

        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLastItem(){
        if(length == 0){
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
//        if(head.next == null && tail.next == null){
//            head = null;
//            tail = null;
//        }
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        length++;

    }

    public Node removeFirstItem(){


        //This is the code I wrote and the below code is from the lecture. Both do the same thing but the lecture code is better.
//        if(length == 0 && head == null && tail == null){
//            return null;
//        } else if (length ==1) {
//            Node temp = head;
//            head = head.next;
//            tail = tail.next;
//            length--;
//            return temp;
//         }else {
//            Node temp = head;
//            head = head.next;
//            temp.next = null;
//            length--;
//            return temp;
//        }

        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0){
            tail.next = null;
        }
        return temp;
    }

    public Node getValueAtIndex(int index){
        Node temp = head;
        if (index < 0 || index > length) return null;
        for(int i = 0; i<index;i++){
            temp = temp.next;
        }

        return temp;
    }

    public boolean setValueAtIndex(int index, int value) {
        Node temp = getValueAtIndex(index);
        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insertNodeAtIndex(int index, int value){
        if(index < 0 || index > length) return false;

        if (index == 0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = getValueAtIndex(index -1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node removeNodeAtIndex(int index){

        if (index < 0 || index >= length) return null;

        if (index == 0){
            return removeFirstItem();
        }
        if (index == length -1){
            return removeLastItem();
        }
        Node pre = getValueAtIndex(index -1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;

    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after;
        Node before = null;

        for(int i = 0;i < length;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
         }
    }

    //DSA Question-Find Middle Node ( ** Interview Question)
    public Node findMiddleNode(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //DSA Question-Has Loop ( ** Interview Question)
    //Note run "Main_Method_For_DSA_Problem_HasLoop" if you want to execute the below code.
    public boolean hasLoop(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    //DSA Question- Find Kth Node From End ( ** Interview Question)
    public Node findKthFromEnd(int k){
        Node slow = head;
        Node fast = head;

        if (head == null && tail == null){
            return null;
        }
        if (k == 2 && head.next == null){
            return null;
        }
        if (head == tail){
            return head;
        }
        if (k <= 0){
            return null;
        }
        for (int i = 1; i < k; i++) {
            fast = fast.next;
            if (fast == null){
                return null;
            }
        }
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;

            if (fast.next == null){
                return slow;
            }
        }
        return slow;



//        while (fast != null && fast.next != null) {
//           if (k <= 0){
//               return null;
//           }
//            for (int i = 1; i < k; i++) {
//                fast = fast.next;
//                slow = slow.next;
//                if (i + 1 == k) {
//                    return slow;
//                }
//            }
//            return slow;
//        }
//        return slow;
    }

    public int returnLastNodeIndex(){
        return length -1;
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


}
