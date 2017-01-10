import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        
        long rep = n / s.length();
        long remainder = n % s.length();
        
            
        long remainderCount = 0;
        long answer = 0;
        for(long i = 0; i < s.length(); i++){
            char c = s.charAt((int)i);
            if(c == 'a'){
                answer++;
                if(i < remainder){
                    remainderCount++;
                }
            }
        }
        
        answer = (answer * rep) + remainderCount;
        System.out.println(answer);
    }
}
