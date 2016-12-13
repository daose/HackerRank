import java.util.*;
import java.lang.*;

public class Solution {
    public static final float P_DEFECT = 0.12f;

    public static void main(String[] args){
        //  P(no more than 2 defects)
        //= P(0 defect) + P(1 defect) + P(2 defect)
        //10C0 = 1
        //10C1 = 10
        //10C2 = 45
        double p0D = 1*Math.pow(P_DEFECT, 0)*Math.pow(1-P_DEFECT, 10);
        double p1D = 10*Math.pow(P_DEFECT, 1)*Math.pow(1-P_DEFECT, 9);
        double p2D = 45*Math.pow(P_DEFECT, 2)*Math.pow(1-P_DEFECT, 8);
        System.out.println(String.format("%.3f", p0D + p1D + p2D));
        //  P(at least 2 defects)
        //= 1 - (P(1 defect) + P(0 defect))
        System.out.println(String.format("%.3f", (double)1 - (p0D + p1D)));
    }
}
