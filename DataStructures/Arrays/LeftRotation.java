import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = in.nextInt();
        }

        for(int i = 0; i < a.length; i++){
            System.out.print(a[(i + d) % a.length] + " ");
        }
        System.out.println("");
    }
}
