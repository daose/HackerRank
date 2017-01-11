import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] freq = new int[100];
        
        int highestFreq = 0;
        for(int i = 0; i < n; i++){
            int value = in.nextInt();
            value -= 1;
            
            freq[value]++;
            if(freq[value] > highestFreq){
                highestFreq = freq[value];
            }
        }
        
        System.out.println(n - highestFreq);
    }
}
