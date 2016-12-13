import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isWeird = false;
        if((n & 1) == 0){
            if(n < 6){
                isWeird = false;
            } else if(n < 21){
                isWeird = true;
            } else {
                isWeird = false;
            }
        } else {
            isWeird = true;
        }
        if(isWeird){
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
