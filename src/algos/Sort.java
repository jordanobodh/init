package algos;

import java.util.Arrays;

/**
 * Created by kusumakar on 25/4/18.
 */
public class Sort {
    public int[] insertionSort(int[] array) {
        System.out.println(Arrays.toString(array));
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
}