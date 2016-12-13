import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] a = new int[in.nextInt()];
        for(int i = 0; i < a.length; i++){
            a[i] = in.nextInt();
        }
        sort(a);
    }

    public static void sort(int[] a){
        quickSort(a, 0, a.length);
    }

    public static void quickSort(int[] a, int startIndex, int length){
        if(length < 2) return;
        int pIndex = partition(a, startIndex, length);
        quickSort(a, startIndex, pIndex - startIndex);
        quickSort(a, pIndex + 1, startIndex + length - pIndex - 1);
    }

    public static int partition(int[] a, int startIndex, int length){
        int pivot = a[startIndex + length - 1];
        int j = startIndex;
        for(int i = startIndex; i < startIndex + length - 1; i++){
            if(a[i] <= pivot){
                swap(a, i, j);
                j++;
            }
        }
        swap(a, startIndex + length - 1, j);
        print(a);
        return j;
    }

    public static void swap(int[] a, int p, int q){
        int temp = a[p];
        a[p] = a[q];
        a[q] = temp;
    }

    public static void print(int[] a){
        for(int n : a){
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
