import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                continue;
            }

            int index = (int)c;
            if(c < 'a'){
                index -= 'A';
            } else {
                index -= 'a';
            }
            freq[index]++;
        }


        for(int i = 0; i < freq.length; i++){
            if(freq[i] == 0){
                System.out.println("not pangram");
                return;
            }
        }

        System.out.println("pangram");
    }
}
