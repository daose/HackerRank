import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.nextInt(); //ignore string length
        String s = in.next();
        int k = in.nextInt();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z'){
                c = (char) ((c - 'a' + k) % 26 + 'a');
            } else if(c >= 'A' && c <= 'Z'){
                c = (char) ((c - 'A' + k) % 26 + 'A');
            } 
            System.out.print(c);
        }

        System.out.println("");
    }
}
