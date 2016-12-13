import java.lang.*;

//Looking at Z table: http://www.sjsu.edu/faculty/gerstman/EpiInfo/z-table.htm
public class Solution {
    public static final float MEAN = 20;
    public static final float SD = 2;
    public static void main(String[] args){
        //Probability that a car can be assembled in less than 19.5 hours?
        //  P(Z < (19.5-MEAN)/SD)
        //= P(Z < (19.5-20)/2)
        //= P(Z < -0.25)
        //= 1 - Z(0.25)
        //= 1 - 0.5987
        //= 0.401
        System.out.println("0.401");

        //Probability that a car can be assembled between 20 and 22 hours?
        //  P((20-MEAN)/SD < Z < (22-MEAN)/SD)
        //= P((20-20)/2 < Z < (22-20)/2)
        //= P(0 < Z < 1)
        //= Z(1) - Z(0)
        //= 0.841 - 0.500
        System.out.println("0.341");
    }
}
