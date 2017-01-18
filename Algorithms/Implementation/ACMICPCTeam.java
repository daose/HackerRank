import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args){
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
           
            BitSet[] list = new BitSet[n];
            
            for(int i = 0; i < list.length; i++){
                list[i] = new BitSet(m);
                for(int j = 0; j < m; j++){
                    boolean isWellVersed = (in.read() == '0') ? false : true;
                    list[i].set(j, isWellVersed);
                }
                in.read(); //newline
            }
            
            int maxTopics = 0;
            int eligibleTeams = 0;           
            for(int i = 0; i < list.length; i++){
                for(int j = i + 1; j < list.length; j++){
                    BitSet team = union(list[i], list[j]);
                    int totalTopics = team.cardinality();
                    if(totalTopics > maxTopics){
                        maxTopics = totalTopics;
                        eligibleTeams = 1;
                    } else if(totalTopics == maxTopics){
                        eligibleTeams++;
                    }
                }
            } 
            
            System.out.println(maxTopics);
            System.out.println(eligibleTeams);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static BitSet union(BitSet a, BitSet b){
        BitSet set = (BitSet) a.clone();
        set.or(b);
        return set;
    }
}
