import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        
        k %= n;

        int q = in.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        for(int i = 0; i < q; i++){
            int m = in.nextInt();

            int offset = n - k;
            System.out.println(a[(m + offset) % n]);
        }
    }
}
