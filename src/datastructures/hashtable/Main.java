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

    //DSA Question-Find Duplicates ( ** Interview Question)
    public static List<Integer> findDuplicates(int[] nums){
        HashMap<Integer,Integer> numCounts = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : nums) {
            numCounts.put(num, numCounts.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (Integer i : numCounts.keySet()){
            if (numCounts.get(i) >1){
                duplicates.add(i);
            }
        }
        return duplicates;
    }

    //DSA Question-First Non-Repeating Character ( ** Interview Question)
    public static Character firstNonRepeatingChar(String inputString){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        ArrayList<Character> arrayList = new ArrayList<>();

        for (char c : inputString.toCharArray()){
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
            arrayList.add(c);
        }

        for (int i = 0; i <inputString.length() ; i++) {
            char c = inputString.charAt(i);
            if (hashMap.get(c) == 1) return c;
        }
        return null;
    }

    //DSA Question-Group Anagrams ( ** Interview Question)
    public static List<List<String>> groupAnagrams(String[] strings){
        HashMap<String,ArrayList<String>> hashMap = new HashMap<>();
        for (String s : strings){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if (hashMap.get(key) != null){
                hashMap.get(key).add(s);
            }else {
                ArrayList<String> arrayList = new ArrayList<>();
                hashMap.put(key,arrayList);
            }
        }
        List<List<String>> lists = new ArrayList<>();
        for (String s : hashMap.keySet()) {
            lists.add(hashMap.get(s));
        }
        return lists ;

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


//        System.out.println(findDuplicates(new int[] {5,2,2,3,5}));//DSA Question-Find Duplicates ( ** Interview Question)

//        System.out.println(firstNonRepeatingChar("alphabet")); //DSA Question-First Non-Repeating Character ( ** Interview Question)

    }
}
