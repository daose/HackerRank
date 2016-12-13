import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int num = in.nextInt();
                if(i == j) {
                    ans += num;
                }
                if(j == (n - 1 - i)) {
                    ans -= num;
                }
            }
        }
        System.out.println(Math.abs(ans));
    }
}
