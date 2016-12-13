import java.util.*;
import java.lang.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float boyToGirlRatio = in.nextFloat();
        int childPerBirth = in.nextInt();

        //Getting at least 3 boys in a family of 6
        //P(3 boys) + P(4 boys) + P(5 boys) + P(6 boys)
        //6C3 = 20
        //6C4 = 15
        //6C5 = 6
        //6C6 = 1

        float pBoy = (float)(boyToGirlRatio)/(1 + boyToGirlRatio);
        double p3 = 20*Math.pow(pBoy, 3)*Math.pow(1-pBoy, 3);
        double p4 = 15*Math.pow(pBoy, 4)*Math.pow(1-pBoy, 2);
        double p5 = 6*Math.pow(pBoy, 5)*Math.pow(1-pBoy, 1);
        double p6 = 1*Math.pow(pBoy, 6)*Math.pow(1-pBoy, 0);
        System.out.println(String.format("%.3f", p3 + p4 + p5 + p6));
    }
}
