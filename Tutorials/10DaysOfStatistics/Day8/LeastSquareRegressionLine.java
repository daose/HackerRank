public class Solution {
    public static void main(String[] args){
        // x  | y
        // 95 | 85
        // 85 | 95
        // 80 | 70
        // 70 | 65
        // 60 | 70
        // Use the least square regression line to find y when x = 80
        // y = a + bx
        // mean(x)
        // mean(y)
        // Sxy = sum((xi - mean(x))(yi - mean(y)))
        // Sxx = sum((yi - mean(y))^2)
        // b = Sxy/Sxx
        // a = mean(y) - b*mean(x)
        // y = a + bx
        int[] x = {95, 85, 80, 70, 60};
        int[] y = {85, 95, 70, 65, 70};
        
        float meanX = 0;
        float meanY = 0;
        for(int i = 0; i < 5; i++){
            meanX += x[i]; 
            meanY += y[i];
        }
        meanX /= 5;
        meanY /= 5;
        
        float sxy = 0;
        float sxx = 0;
        for(int i = 0; i < 5; i++){
            sxy += ((x[i] - meanX)*(y[i] - meanY));
            sxx += ((x[i] - meanX)*(x[i] - meanX));
        }
        
        float b = sxy/sxx;
        float a = meanY - b*meanX;
        
        System.out.printf("%.3f", a + b*80);
    }
}
