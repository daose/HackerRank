import java.util.*;
import java.math.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String n = in.next();

        System.out.println(factorial(n));
    }

    public static BigInteger factorial(String n){
        BigInteger num = new BigInteger(n);
        BigInteger ans = BigInteger.ONE;

        while(num != BigInteger.ZERO){
            ans = ans.multiply(num);
            num = num.subtract(BigInteger.ONE);
        }
        return ans;
    }
}
