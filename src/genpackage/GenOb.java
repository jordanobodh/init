package genpackage;

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

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nInput = reader.readLine();
        String priceStr = reader.readLine();
        String typeStr = reader.readLine();
        Integer n = Integer.parseInt(nInput);
        String [] priceArray = priceStr.split(" ");
        String [] typeArray = typeStr.split(" ");
        GenOb gob = new GenOb();
        Integer [] p = gob.toIntArray(priceArray);
        Integer [] t = gob.toIntArray(typeArray);

        int translator = 0;
        int auth = 0;
        int authTranslator = 0;
        for(int i = 0; i<p.length; i++){
            if(t[i] == 1){
                if((translator !=0 && p[i] < translator) || translator == 0){
                    translator = p[i];
                }
            } else if(t[i] == 2){
                if((auth !=0 && p[i] < auth) || auth == 0){
                    auth = p[i];
                }
            } else {
                if((authTranslator !=0 && p[i] < authTranslator) || authTranslator == 0){
                    authTranslator = p[i];
                }
            }
        }

        System.out.println(((auth+translator) < authTranslator) ? (auth+translator) : authTranslator);
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
