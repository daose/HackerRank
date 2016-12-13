import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[size];
        for(int i = 0; i < size; i++){
            a[i] = in.nextInt();
        }

        //TODO:: O(n) solution
        int[] buckets = new int[k];
        for(int i = 0; i < a.length; i++){
            buckets[a[i] % k] = a[i];
        }

        //O(n^2) solution
        //(a[i] + a[j]) % k == 0
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if((a[i] + a[j]) % k == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
