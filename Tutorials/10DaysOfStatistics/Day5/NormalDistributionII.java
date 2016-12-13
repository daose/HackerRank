//Looking at Z table: http://www.sjsu.edu/faculty/gerstman/EpiInfo/z-table.htm
public class Solution {
    public static void main(String[] args){
        //MEAN = 70
        //SD = 10

        //  P(X > 80)
        //= 1 - P(X < 80)
        //= 1 - P(Z < (80-70)/10)
        //= 1 - P(Z < 1)
        //= 1 - 0.8413
        //= 0.1587
        System.out.println("15.87");

        //  P(X > 60)
        //= 1 - P(X < 60)
        //= 1 - P(Z < (60-70)/10)
        //= 1 - P(Z < -1)
        //= 1 - (1 - Z(1))
        //= Z(1)
        //= 0.8413
        System.out.println("84.13");

        //**Note 60 is the same distance away from the mean as 80
        System.out.println("15.87");
    }
}
