import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] a = new int[in.nextInt()];
        for(int i = 0; i < a.length; i++){
            a[i] = in.nextInt();
        }
        insertionSort(a);
    }

    public static void insertionSort(int[] a){
        int n = a[a.length - 1];
        for(int i = a.length - 1; i >= 0; i--){
            if(i == 0 || a[i-1] < n){
                a[i] = n;
                printArray(a);
                break;
            } else {
                a[i] = a[i-1];
                printArray(a);
            }
        }
    }

    public static void printArray(int[] a){
        for(int n : a){
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
