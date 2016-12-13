import java.util.*;

//Looking at Z table: http://www.sjsu.edu/faculty/gerstman/EpiInfo/z-table.htm
public class Solution {
    public static void main(String[] args){
        //max 9800 
        //n = 49
        //u = 205
        //sd = 15
        //  P(Y1 + Y2 + ... + Y49 < 9800), where Y is the distribution of the box weight
        //= P((Y1+Y2+...+Y49)/49 < 9800/49)
        //= P(A < 200), where A~N(49, (15^2)/49)
        //= P(Z < (200 - 205)/(15/7))
        //= P(Z < -2.33)
        //= 0.0099
        System.out.println("0.0099");
    }
}
