import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        for(int i = 0; i < testCases; i++){
            System.out.println(getPoisonedId(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }

    public static int getPoisonedId(int prisoners, int sweets, int id){
        // ((((sweets - 1) % prisoners) + (id - 1)) % prisoners) + 1;
        // shortens to:
        return ((sweets + id - 2) % prisoners) + 1;
    }
}
