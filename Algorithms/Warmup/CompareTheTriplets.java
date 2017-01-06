import java.util.*;

public class Solution {
    public static final int SIZE = 3;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] a = new int[SIZE];
        for(int i = 0; i < a.length; i++){
            a[i] = in.nextInt();
        }

        int aScore = 0;
        int bScore = 0;
        for(int i = 0; i < SIZE; i++){
            int b = in.nextInt();
            if(a[i] > b){
                aScore++;
            } else if(a[i] < b){
                bScore++;
            }
        }

        System.out.println(aScore + " " + bScore);
    }

    //One more iteration and array
    public static void solutionTwo() {
        Scanner in = new Scanner(System.in);
        int[] a = new int[SIZE];
        int[] b = new int[SIZE];
        for(int i = 0; i < SIZE; i++){
            a[i] = in.nextInt();
        }
        for(int i = 0; i < SIZE; i++){
            b[i] = in.nextInt();
        }

        int aScore = 0;
        int bScore = 0;
        for(int i = 0; i < SIZE; i++){
            if(a[i] > b[i]){
                aScore++;
            } else if(a[i] < b[i]){
                bScore++;
            }
        }

        System.out.println(aScore + " " + bScore);
    }
}
