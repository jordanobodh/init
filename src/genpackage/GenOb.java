package genpackage;

import algos.Sort;
import mathfunimpl.NumberTheory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

/**
 * Created by kusumakar on 27/1/18.
 */
public class GenOb {
    public static void main(String args[]) throws IOException {
//        Gen<Integer> ob = new Gen<>(88);
//        System.out.println(isIn(3));
//
//        GeeksArray<Integer> geekObj = new GeeksArray<>();
//        Integer[] fiveArray = {1,2,3,4,5, 6,7,8,9,10,11,12};
//        //geekObj.rotateArray(fiveArray, 2);
//        //geekObj.rotateByJuggling(fiveArray, 3, new NumberTheory());
//        geekObj.reverse(fiveArray, 1, fiveArray.length);
//        System.out.println(Arrays.toString(fiveArray));
//        String[] strArray = {"one", "two", "three", "four", "five"};
//
//        GeeksArray<String> geekStringObj = new GeeksArray<>();
//        geekStringObj.rotateArray(strArray, 2);
//
//        System.out.println(Arrays.toString(strArray));

        int[] array = {3, 4, 1, 2, 6};
        Sort sort = new Sort();
        System.out.println(Arrays.toString(sort.insertionSort(array)));

    }

    public Integer[] toIntArray(String[] strArray){
        Integer [] intArray = new Integer[strArray.length];
        for(int i=0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        return intArray;
    }

    public static <V> boolean isIn(V b) {
        Integer[] intArray = {1,2,3};
        String[] stringArray = {"one", "two", "three"};
        return (thereExists(stringArray,b) || thereExists(intArray, b));
    }

    public static <V> boolean thereExists(V[] v, V a) {
        for (int i=0; i < v.length; i++) {
            if (v[i] == a)
                return true;
        }
        return false;
    }


}
