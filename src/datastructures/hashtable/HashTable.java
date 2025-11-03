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
        dataMap=new Node[size];//Creates an array of the specified size.
    }

    private int hash(String key){
        int hash=0;
        char[] keyChars=key.toCharArray();

        for (int i = 0; i <keyChars.length ; i++) {
            int asciiValue=keyChars[i];
        }
        return 1;
    }

    public void printTable() {
        for(int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            if(dataMap[i] != null) {
                Node temp = dataMap[i];
                while (temp != null) {
                    System.out.println("   {" + temp.key + ", " + temp.value + "}");
                    temp = temp.next;
                }
            }
        }
    }
}
