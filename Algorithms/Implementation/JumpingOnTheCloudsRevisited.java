import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] clouds = new int[n];
        for(int i = 0; i < clouds.length; i++){
            clouds[i] = in.nextInt();
        }

        int i = 0;
        int energy = 100;
        do {
            i = (i + k) % n;
            int cloud = clouds[i];
            if(cloud == 1){
                energy -= 2;
            }
            energy--;
        } while (i != 0);

        System.out.println(energy);
    }
}
