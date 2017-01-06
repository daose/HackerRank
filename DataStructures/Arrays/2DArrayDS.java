import java.util.*;

public class Solution {
    public static final int SIZE = 6;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] a = new int[SIZE][SIZE];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                a[i][j] = in.nextInt();
            }
        }

        int bound = SIZE - 2;

        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < bound; i++){
            for(int j = 0; j < bound; j++){
                int currentSum = calculateSum(a, i, j);
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }

        System.out.println(maxSum);
    }

    public static int calculateSum(int[][] a, int i, int j){
        return a[i][j] + a[i][j+1] + a[i][j+2]
            + a[i+1][j+1]
            + a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
    }
}
