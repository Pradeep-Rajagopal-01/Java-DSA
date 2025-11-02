package datastructures.hashtable;

public class HashTable {
    private int size=7;
    private Node[] dataMap;

    class Node{
        String key;
        int value;
        Node next;

        Node(String key, int value){
            this.key=key;
            this.value=value;
        }
    }

    public HashTable(){
        dataMap=new Node[size];
    }
}
