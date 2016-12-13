import java.lang.*;

public class Solution {
    public static final float P_DEFECT = (float)1/3;
    public static final int FIRST_DEFECT = 5;
    public static void main(String[] args){
        //Draw no defects 4 times then draw 1 defect
        //(1-p)^4*p
        System.out.println(String.format("%.3f", firstDefect(FIRST_DEFECT)));
    }

    public static double firstDefect(int defect){
        return Math.pow(1-P_DEFECT, defect-1)*Math.pow(P_DEFECT, 1);
    }
}
