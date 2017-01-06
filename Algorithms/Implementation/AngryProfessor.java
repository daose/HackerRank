import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();

        for(int i = 0; i < tests; i++){
            int students = in.nextInt();
            int target = in.nextInt();
            int attendance = 0;
            for(int j = 0; j < students; j++){
                int arrivalTime = in.nextInt();
                if(arrivalTime <= 0){
                    attendance++;
                }
            }
            if(attendance >= target){
                System.out.println("NO"); //Class is NOT cancelled
            } else {
                System.out.println("YES"); //Class IS cancelled
            }
        }
    }
}

