import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for(int i = 0; i < tests; i++){
            printMaxes(in.nextInt());
        }
    }

    public static void printMaxes(int length){
        int currentSum = in.nextInt();
        int maxContSum = currentSum;
        int maxSum = (currentSum > 0) ? currentSum : 0;
        int maxNum = currentSum;
        for(int i = 1; i < length; i++){
            int n = in.nextInt();
            if(n > 0){
                maxSum += n;
            }
            if(n > maxNum){
                maxNum = n;
            }

            currentSum = Math.max(currentSum + n, n);
            maxContSum = Math.max(currentSum, maxContSum);
        }

        if(maxSum == 0){
            maxSum = maxNum;
        }

        System.out.println(maxContSum + " " + maxSum);
    }

    public static void printMaxes(int[] a){
        int currentSum = a[0];
        int maxContSum = a[0];
        int maxSum = (a[0] > 0) ? a[0] : 0;
        int maxNum = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > 0){
                maxSum += a[i];
            } 
            if(a[i] > maxNum){
                maxNum = a[i];
            }
            currentSum = Math.max(currentSum + a[i], a[i]);
            maxContSum = Math.max(maxContSum, currentSum);
        }
        if(maxSum == 0){
            maxSum = maxNum;
        }
        System.out.println(maxContSum + " " + maxSum);
    }
}
