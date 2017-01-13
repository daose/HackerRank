import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int rDay = in.nextInt();
        int rMonth = in.nextInt();
        int rYear = in.nextInt();

        int eDay = in.nextInt();
        int eMonth = in.nextInt();
        int eYear = in.nextInt();

        if(rYear > eYear){
            System.out.println(10000);
        } else if(rYear == eYear){
            if(rMonth > eMonth){
                System.out.println(500 * (rMonth - eMonth));
            } else if(rMonth == eMonth){
                if(rDay > eDay){
                    System.out.println(15 * (rDay - eDay));
                } else {
                    System.out.println(0);
                }
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }

    }
}
