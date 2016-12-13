import java.util.*;
import java.lang.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        printStandardDeviation(a);
    }

    public static void printStandardDeviation(int[] a){
        double sum = 0;
        double mean = getMean(a);
        for(int n : a){
            sum += ((n - mean)*(n - mean));
        }
        System.out.println(String.format("%.1f", Math.sqrt(sum/a.length)));
    }

    public static double getMean(int[] a){
        int sum = 0;
        for(int n : a){
            sum += n;
        }
        return (double)sum / a.length;
    }
}
