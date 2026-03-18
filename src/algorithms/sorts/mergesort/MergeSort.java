package algorithms.sorts.mergesort;

import java.util.Arrays;

public class MergeSort {

    //Note: Merge always takes in sorted arrays as input.
    public static int[] merge(int[] array1, int[] array2){
        int[] combinedArray = new int[array1.length + array2.length];
        int index=0;
        int i=0;
        int j=0;

        while (i < array1.length && j < array2.length){
            if (array1[i] < array2[j]){
                combinedArray[index] = array1[i];
                index++;
                i++;
            }else {
                combinedArray[index] = array2[j];
                index++;
                j++;
            }
        }

        while (i < array1.length){
            combinedArray[index] = array1[i];
            index++;
            i++;
        }
        while (j < array2.length){
            combinedArray[index] = array2[j];
            index++;
            j++;
        }
        return combinedArray;
    }

    public static int[] mergeSort(int[] array){
        if (array.length == 1) return array;

        int minIndex = array.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(array,0,minIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array,minIndex,array.length));

        return merge(left,right);
    }

    public static void main(String[] args) {
//        int[] array1 = {1,3,7,8};
//        int[] array2 = {2,4,5,6};
//
//        System.out.println(Arrays.toString(merge(array1,array2)));


        int[] array = {1,4,6,7,3,9,2};
        System.out.println(Arrays.toString(mergeSort(array)));
    }
}
