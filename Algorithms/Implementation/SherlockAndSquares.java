import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for(int i = 0; i < cases; i++){
            System.out.println(getNumOfSquares(in.nextInt(), in.nextInt()));
        }
    }

    public static int getNumOfSquares(int a, int b){
        return (int)Math.floor(Math.sqrt(b)) - (int)Math.ceil(Math.sqrt(a)) + 1;
    }
}
