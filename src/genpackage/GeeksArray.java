package genpackage;

import mathfunimpl.NumberTheory;

import java.util.Arrays;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * Created by kusumakar on 3/2/18.
 */
public class GeeksArray<T> {
    public T[] rotateArray(T[] theArray, int d) {

        for (int i=0; i < d; i++) {
            theArray = rotateByOne(theArray);
        }
        return theArray;
    }

    private T[] rotateByOne(T[] array) {
        T firstElement = array[0];
        int oneLessThanArrayLen = array.length - 1;
        for(int i=0; i < oneLessThanArrayLen; i++) {
            array[i] = array[i+1];
        }
        array[oneLessThanArrayLen] = firstElement;
        return array;
    }

    public T[] rotateByJuggling(T[] array, int d, NumberTheory nt) {
        int noOfSets = nt.gcd(array.length, d);
        System.out.println(noOfSets);
        int lengthOfArray = array.length;
        for(int i = 0; i < noOfSets; i++){
            T temp = array[i];
            int l;
            for(l = i; (l+d) < lengthOfArray; l = l + d) {
              array[l] = array[l + d];
            }
            array[l] = temp;
        }
        return array;
    }

     public T[] reverse(T[] array, int start, int end) {
         int i = start - 1;
         int j = end - 1;
         while(i < j) {
             T temp = array[i];
             array[i] = array[j];
             array[j] = temp;
             i++;
             j--;
         }
         System.out.println(Arrays.toString(array));
         return array;
     }
//
//    public T[] findMin(T[] array) {
//        int flag = 0;
//        for(int i = 0; i< array.length-2; i++) {
//
//        }
//    }
}