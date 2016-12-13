import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        printMean(a);
        printMedian(a);
        printMode(a);
    }

    private static void printMean(int[] a){
        int sum = 0;
        for(int n : a){
            sum += n;
        }
        System.out.println(String.format("%.1f", (float)sum / a.length));
    }

    private static void printMedian(int[] a){
        float median;
        if((a.length & 1) == 0){
            //Even length
            median = (float)(a[a.length / 2] + a[(a.length / 2) - 1]) / 2; 
        } else {
            //Odd length
            median = a[a.length / 2];
        }
        System.out.println(String.format("%.1f", median));
    }

    private static void printMode(int[] a){
        HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        int maxCount = 1;
        int mode = a[0];
        for(int n : a){
            if(freqMap.containsKey(n)){
                int newCount = freqMap.get(n) + 1;
                if(newCount > maxCount) {
                    maxCount = newCount;
                    mode = n;
                }

                freqMap.put(n, freqMap.get(n) + 1);
            } else {
                freqMap.put(n, 1);
            }
        }
        System.out.println(mode);
    }
}
