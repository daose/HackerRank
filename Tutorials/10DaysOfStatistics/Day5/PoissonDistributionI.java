import java.lang.*;

public class Solution {
    public static final float MEAN = 2.5f;
    public static final int X = 5;
    public static void main(String[] args){
        //P(X = r) = (e^-mean*mean^r)/r!
        //5! = 120
        System.out.println(String.format("%.3f", Math.pow(MEAN, X)*Math.pow(Math.E, -1*MEAN) / 120));
    }
}
