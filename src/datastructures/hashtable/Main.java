package datastructures.hashtable;

import java.util.HashMap;

public class Main {


    public static boolean itemInCommon(int array1[], int array2[]){
        HashMap<Integer,Boolean> hashMap = new HashMap<Integer, Boolean>();

        for (int i : array1){
            hashMap.put(i,true);
        }

        for (int j : array2){
            if (hashMap.get(j) !=null) return true;
        }
        return false;
    }
    public static void main(String[] args) {

        HashTable hashTable=new HashTable();

        hashTable.set("BMW", 2);
        hashTable.set("Porsche", 4);
        hashTable.set("RR", 5);
        hashTable.set("Mega Yatch", 2);
        hashTable.set("Lamborgini", 1);

//        System.out.println("Value of the provided key: "  + hashTable.get("BMW"));

//        System.out.println(hashTable.keys());

        //        hashTable.printTable();

        int[] array1 = {1,4,7};
        int[] array2 = {2,7,9};

        System.out.println(itemInCommon(array1,array2)); //Interview Question.
    }
}
