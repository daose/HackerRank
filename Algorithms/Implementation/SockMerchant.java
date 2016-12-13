import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] a = new int[101];
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            a[in.nextInt()]++;
        }
        int singles = 0;
        for(int num : a){
            if((num & 1) == 1){
                singles++;
            }
        }
        System.out.println((n - singles) / 2);
    }
}
