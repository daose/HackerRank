import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();

        boolean isSuccess = false;
        for(int i = start; i <= end; i++){
            if(isKaprekar(i)){
                System.out.print(i + " ");
                isSuccess = true;
            }
        }
        
        if(!isSuccess){
            System.out.println("INVALID RANGE");
        }
    }

    public static boolean isKaprekar(int n){
        int d = getReverseDigits(n).size();
        long squared = n*n;
        ArrayList<Integer> digits = getReverseDigits(squared);
        int left = 0;
        int right = 0;

        int scale = 1;
        for(int i = 0; i < d; i++){
            left += (digits.get(i) * scale);
            scale *= 10;
        }
        scale = 1;
        for(int i = d; i < digits.size(); i++){
            right += (digits.get(i) * scale);
            scale *= 10;
        }
        return (left + right) == n;
    }

    public static ArrayList<Integer> getReverseDigits(long n){
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while(n != 0) {
            digits.add((int)(n % 10));
            n /= 10;
        }
        return digits;
    }
}
