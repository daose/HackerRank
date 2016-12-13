import java.lang.*;

public class Solution {
    public static final float P_DEFECT = (float)1/3;

    public static void main(String[] args){
        //Probability that the first defect is found during the first 5 inspections
        //1 - P(first defect found during the 6th inspection)
        double p = 0;
        for(int i = 1; i < 6; i++){
            p += firstDefect(i);
        }
        System.out.println(String.format("%.3f", p));
    }

    public static double firstDefect(int defect){
        return Math.pow(1-P_DEFECT, defect-1)*Math.pow(P_DEFECT, 1);
    }
}
