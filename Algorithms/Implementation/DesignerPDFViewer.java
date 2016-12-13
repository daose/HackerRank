import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] height = new int[26];
        for(int i = 0; i < height.length; i++){
            height[i] = in.nextInt();
        }
        String text = in.next();
        int maxHeight = 0;
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(height[c - 'a'] > maxHeight){
                maxHeight = height[c - 'a'];
            }
        }
        System.out.println(text.length() * maxHeight);
    }
}
