import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(findNextPermutation(in.next()));
        }
    }

    private static String findNextPermutation(String w){
        char[] a = w.toCharArray();
        int smallIndex = a.length - 1;
        for(int i = a.length - 2; i >= 0; i--){
            if(a[i] < a[i+1]){
                while(a[smallIndex] <= a[i]){
                    smallIndex--;
                }
                swap(a, i, smallIndex);
                reverse(a, i+1, a.length - 1);
                return new String(a);
            }
        }
        return "no answer";
    }

    private static void swap(char[] a, int i, int j){
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void reverse(char[] a, int i, int j){
        while(i < j){
            swap(a, i, j);
            i++;
            j--;
        }
    }
}
