import java.util.*;

//Looking at Z table: http://www.sjsu.edu/faculty/gerstman/EpiInfo/z-table.htm
public class Solution {
    public static void main(String[] args){
        //Y~N(500, 80^2/100)
        //P(A < Y < B) = 0.95
        //P(-1.96 < Z < 1.96) = 0.95
        //1.96 = (B - 500)/(80/sqrt(100))
        //B = 515.68
        //-1.96 = (A - 500)/(80/sqrt(100))
        //A = 484.32
        System.out.println("484.32");
        System.out.println("515.68");
    }
}
