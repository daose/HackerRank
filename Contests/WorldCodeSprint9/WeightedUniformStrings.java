import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        HashSet<Integer> weights = getWeights(in.next());

        int queries = in.nextInt();

        for(int i = 0; i < queries; i++){
            System.out.println(weights.contains(in.nextInt()) ? "Yes" : "No");
        }
    }

    private static HashSet<Integer> getWeights(String s){
        HashSet<Integer> weights = new HashSet<Integer>();
        int weightOffset = 'a' - 1;

        char prev = s.charAt(0);
        int prevWeight = prev - weightOffset;
        weights.add(prevWeight);

        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            int weight = c - weightOffset;

            if(prev == c){
                prevWeight += weight;
            } else {
                prevWeight = weight;
            }
            prev = c;
            weights.add(prevWeight);
        }
        return weights;
    }
}
