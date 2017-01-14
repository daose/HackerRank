import java.util.*;

public class Solution {
    private static final int THUNDERCLOUD = 1;
    private static final int CLOUD = 0;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] clouds = new int[in.nextInt()];

        for(int i = 0; i < clouds.length; i++){
            clouds[i] = in.nextInt();
        }

        int position = 0;
        int jumps = 0;
        while(position != clouds.length - 1){
            if(position + 2 < clouds.length){
                if(clouds[position + 2] == THUNDERCLOUD){
                    position++;
                } else {
                    position += 2;
                }
            } else {
                position++;
            }
            jumps++;
        }
        System.out.println(jumps);
    }
}
