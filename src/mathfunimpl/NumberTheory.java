package mathfunimpl;

/**
 * Created by kusumakar on 6/2/18.
 */
public class NumberTheory {
    public int gcd(int[] array) {
        int result = array[0];
        for (int i=1; i < array.length - 1; i++){
            result = gcd(result, array[i]);
        }
        return result;
    }

    public int gcd(int a, int b) {
        if (a == 0 || b == 0)
            return a+b;
        if (a > b)
            return gcd(b, a % b);
        else
            return gcd(a, b % a);
    }
}
