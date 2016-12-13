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
        printQuartiles(a);
    }

    public static void printMedian(int[] a, int startIndex, int length) {
        if((length & 1) == 0){
            //even
            System.out.println((a[(length / 2) + startIndex] + a[(length / 2) - 1 + startIndex]) / 2);
        } else {
            //odd
            System.out.println(a[(length / 2) + startIndex]);
        }
    }

    public static void printQuartiles(int[] a){
        printMedian(a, 0, a.length / 2);
        printMedian(a, 0, a.length);
        if((a.length & 1) == 0){
            printMedian(a, a.length / 2, a.length / 2);
        } else {
            printMedian(a, (a.length / 2) + 1, a.length / 2);
        }
    }
}
