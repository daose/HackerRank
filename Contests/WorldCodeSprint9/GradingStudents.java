import java.util.*;

public class Solution {
    public static final int CUT_OFF = 38;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            int grade = in.nextInt();
            System.out.println(roundUp(grade));
        }
    }

    private static int roundUp(int grade){
        if(grade < CUT_OFF) return grade;
        switch(grade % 5){
            case 3:
                grade += 2;
                break;
            case 4:
                grade += 1;
                break;
            default:
                break;
        }
        return grade;
    }
}
