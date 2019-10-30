import java.util.Scanner;
public class B{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0, positive = 0, negative = 0, i = 0;        
        n = sc.nextInt();         
        int[] arr = new int[n];
        for(i = 0; i < n; i++){
            arr[i] = sc.nextInt();                                         
            if(arr[i] > 0){
                positive++;
            } 
            if(arr[i] < 0) {
                negative++;            
            }
        }                
        if(positive >= negative && positive >= (float)n/2){
            System.out.println(1);
        } else if(positive < negative && negative >= (float)n/2){
            System.out.println(-1);
        } else{
            System.out.println(0);
        }             
    }
}