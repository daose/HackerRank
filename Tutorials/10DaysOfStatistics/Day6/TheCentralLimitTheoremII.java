import java.util.*;

//Looking at Z table: http://www.sjsu.edu/faculty/gerstman/EpiInfo/z-table.htm
public class Solution {
    public static void main(String[] args){
        //  u = 2.4
        //  P(Y1 + Y2 + ... + Y100 < 250), where Y~?(u, 4)
        //= P((Y1+Y2+...+Y100)/100 < 250/100)
        //= P(A < 2.5) where A~N(u, 4/100)
        //= P(Z < (2.5-u)/(2/sqrt(100)))
        //= P(Z < 0.5)
        //= 0.6915
        System.out.println("0.6915");
    }
}
