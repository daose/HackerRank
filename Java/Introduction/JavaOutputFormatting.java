import java.util.*;

public class Solution {
    public static final String BAR = "================================";
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(BAR);
        for(int i = 0; i < 3; i++){
            String word = in.next();
            int n = in.nextInt();
            //'-' flag for left justify
            //'0' flag for zero padding
            System.out.printf("%-15s%03d\n", word, n);
        }
        System.out.println(BAR);
    }
}
