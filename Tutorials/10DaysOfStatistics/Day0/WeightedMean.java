import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numList = new int[n];
        double weightedSum = 0;
        int totalWeight = 0;
        for(int i = 0; i < n; i++){
            numList[i] = in.nextInt();
        }

        for(int i = 0; i < n; i++){
            int weight = in.nextInt();
            weightedSum += numList[i] * weight;
            totalWeight += weight;
        }

        System.out.println(String.format("%.1f", weightedSum/totalWeight));
    }
}
