package clrs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kusumakar on 26/4/18.
 */
public class ChapTwo {
    public int[] addBinaryArrays(int[] a, int[] b) {
        int sizeOfArray = a.length;
        int[] c = new int[sizeOfArray + 1];
        int carry = 0;
        for(int i=sizeOfArray-1; i >= 0; i--){
            SumCarry sc = sum(a[i], b[i]);
            SumCarry sumCarry = sum(sc.sum, carry);
            c[i+1] = sumCarry.sum;
            carry = sc.carry;
        } 
        c[0] = carry;
        return c;
    }

    public SumCarry sum(int a, int b) {
        if(a == 0 || b == 0) {
            return new SumCarry(a+b, 0);
        }else {
            return new SumCarry(0, 1);
        }
    }
}

class SumCarry{
    int sum;
    int carry;
    
    public SumCarry(int sum, int carry){
        this.sum = sum;
        this.carry = carry;
    }
}
