import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for(int i = 0; i < cases; i++){
            System.out.println(findDigits(in.nextInt()));
        }
    }

    public static int findDigits(int n){
        int digits = n;
        int ans = 0;
        while(digits != 0){
            int digit = digits % 10;
            if(digit != 0 && ((n % digit) == 0)){
                ans++;
            }
            digits /= 10;
        }
        return ans;
    }
}
