public class Pow{
    public static void main(String[] args){
        System.out.println("res: " + myPow(0.00001,2147483647));
    }
    public static double myPow(double x, int n) {
        if(n == 0) return 1;
        double result = 1.0;        
        for(long i = Math.abs((long)n); i > 0; i--){
            result *=x;
        }
        if(n < 0) return 1/result;
        return result;
    }

    public static double isLong(double x, long n){
        double result = 1.0;  
        for(long i = Math.abs((long)n); i > 0; i--){
            result *=x;
        }
        if(n < 0) return 1/result;
        return result;
    }
}