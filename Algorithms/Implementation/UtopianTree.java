import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for(int i = 0; i < tests; i++){
            printHeight(in.nextInt());
        }
    }
    
    public static void printHeight(int n){
        System.out.println(((1 << ((n >> 1) + 1)) - 1) << (n & 1));
    }
}
