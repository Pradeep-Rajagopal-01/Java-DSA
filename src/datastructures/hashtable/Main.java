package datastructures.hashtable;

public class Main {

    public static void main(String[] args) {

        HashTable hashTable=new HashTable();

        hashTable.set("BMW", 2);
        hashTable.set("Porsche", 4);
        hashTable.set("RR", 5);
        hashTable.set("Mega Yatch", 2);
        hashTable.set("Lamborgini", 1);

        System.out.println("Value of the provided key: "  + hashTable.get("BMW"));

        hashTable.printTable();
    }
}
