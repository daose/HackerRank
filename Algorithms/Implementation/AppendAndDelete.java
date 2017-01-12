import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();

        System.out.println(canTransform(s, t, k) ? "Yes" : "No");
    }

    public static boolean canTransform(String s, String t, int k){
        if(k >= s.length() + t.length()){
            // Can always delete the string first then reconstruct it
            return true;
        }

        int divergeIndex = s.length();
        for(int i = 0; i < s.length(); i++){
            if((i >= t.length()) || (s.charAt(i) != t.charAt(i))){
                divergeIndex = i;
                break;
            }
        }

        int minOps = (s.length() - divergeIndex) + (t.length() - divergeIndex);
        if(k < minOps){
            return false;
        }

        return (((k - minOps) & 1) == 1) ? false : true;
    }
}

