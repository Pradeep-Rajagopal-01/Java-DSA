package datastructures.hashtable;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static boolean itemInCommon(int array1[], int array2[]){//Interview Question.
        HashMap<Integer,Boolean> hashMap = new HashMap<Integer, Boolean>();

        for (int i : array1){
            hashMap.put(i,true);
        }

        for (int j : array2){
            if (hashMap.get(j) !=null) return true;
        }
        return false;
    }

    public static List<Integer> findDuplicates(int[] nums){
        HashMap<Integer,Integer> numCounts = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : nums) {
            if (numCounts.get(num) == null) {
                numCounts.put(num, 0);
            }
            numCounts.replace(num,numCounts.get(num)+1);
        }
        System.out.println(numCounts);
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            if (numCounts.get(i) >1){
                duplicates.add(1);
            }
        }
        return duplicates;
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

//        int[] array1 = {1,4,7};
//        int[] array2 = {2,7,9};
//        System.out.println(itemInCommon(array1,array2)); //Interview Question.


        System.out.println(findDuplicates(new int[] {5,5,5,2,2}));



    }
}
