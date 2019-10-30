import java.util.Scanner;
public class Positive{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0, i = 0, minorPositive = Integer.MAX_VALUE, minorNegative = Integer.MIN_VALUE, temp = 0;
        double positiveSum = 0.0, negativeSum = 0.0;        
        n = sc.nextInt();         
        int[] arr = new int[n];
        for(i = 0; i < n; i++){
            arr[i] = sc.nextInt();                                         
            if(minorPositive > arr[i] && arr[i] > 0) minorPositive = arr[i];
            if(minorNegative < arr[i] && arr[i] < 0) minorNegative = arr[i];            
        }        
        for(i = 0; i < n; i++){
            if(arr[i]/minorPositive > 0){
                positiveSum++;
            }
            if(arr[i]/minorNegative > 0){
                negativeSum++;
            }                        
        }               
        if(positiveSum >= n/2) temp = minorPositive;
        if(negativeSum >= n/2) temp = minorNegative;
        if(temp == 0){
            System.out.println(0);
        }
        else if(temp != 0){
            for(i = 0; i < n; i ++){
                if(arr[i] == temp) System.out.println(i+1);
            }
        }                      
    }
}