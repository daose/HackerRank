import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.nextInt(); // pass length of string
        String s = in.next();

        HashSet<Character> candidateChars = new HashSet<Character>();
        int answer = 0;

        if(s.length() < 2) {
            System.out.println(answer);
            return;
        }

        char prevChar = s.charAt(0);
        candidateChars.add(prevChar);
        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == prevChar){
                candidateChars.remove(c);
            } else {
                candidateChars.add(c);
            }
            prevChar = c;
        }

        Character[] chars = candidateChars.toArray(new Character[0]);
        for(int i = 0; i < chars.length - 1; i++){
            for(int j = i + 1; j < chars.length; j++){
                int length = getTwoCharactersLength(s, chars[i], chars[j]);
                if(length > answer){
                    answer = length;
                }
            }
        }
        System.out.println(answer);
    }

    public static int getTwoCharactersLength(String s, char a, char b){
        int length = 0;
        char prevChar = s.charAt(0);
        if(prevChar == a || prevChar == b){
            length++;
        }
        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != a && c != b){
                continue;
            }

            if(c == prevChar) {
                return 0;
            }

            prevChar = c;
            length++;
        }
        return length;
    }
}
