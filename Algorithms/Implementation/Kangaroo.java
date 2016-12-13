import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int xv = in.nextInt();

        int y = in.nextInt();
        int yv = in.nextInt();

        String answer = "NO";

        float numJumps = (float)(x - y)/(yv - xv);
        if(numJumps % 1 == 0){
            //whole number
            if(numJumps >= 0) {
                answer = "YES";
            } 
        }

        System.out.println(answer);
    }
}
