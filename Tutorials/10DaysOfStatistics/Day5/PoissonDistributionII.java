import java.lang.*;

public class Solution {
    public static final float A_MEAN = 0.88f;
    public static final float B_MEAN = 1.55f;

    public static void main(String[] args){
        System.out.println(String.format("%.3f", 160+40*getEX2(A_MEAN)));
        System.out.println(String.format("%.3f", 128+40*getEX2(B_MEAN)));
    }

    public static double getEX2(float mean){
        //var(X) = E(X^2) - (E(X))^2
        //MEAN = E(X^2) - (MEAN)^2
        //E(X^2) = MEAN + MEAN^2
        return mean + mean * mean;
    }
}
