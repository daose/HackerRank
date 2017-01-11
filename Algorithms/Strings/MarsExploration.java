import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String message = in.next();
        String sos = "SOS";

        int altered = 0;
        for(int i = 0; i < message.length(); i++){
            if(message.charAt(i) != sos.charAt(i % 3)){
                altered++;
            }
        }

        System.out.println(altered);
    }
}
