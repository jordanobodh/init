package algos;

import java.util.Arrays;

/**
 * Created by kusumakar on 25/4/18.
 */
public class Sort {
    public int[] insertionSort(int[] array) {
        for(int i=1; i<array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while(i > 0 && key < array[i - 1]){
                array[i] = array[i - 1];
                i = i - 1;
            }
            array[i] = key;
            i = j + 1;
        }
        return array;
    }

    public int[] selectionSort(int[] array) {
        for(int i=0; i < array.length; i++ ){
            int temp = array[i];
            int minIndex = minIndex(array, i);
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }

    public int minIndex(int[] array, int startIndex) {
        int min = array[startIndex];
        int minIndex = startIndex;
        for(int i=startIndex+1; i < array.length; i++){
            if(array[i] < min) {
                min  = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

//    public int[] mergeSort(int[] array) {
//
//    }
}