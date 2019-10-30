import java.util.Scanner;
public class ServalBus{
    public static void main(String[] args){
        int busRoutesAvailable = 0, servalArrivalTime = 0;
        int busArriveAt = 0, busInterval = 0;
        int bestChoice = Integer.MAX_VALUE, count = 0;
        Scanner sc = new Scanner(System.in);

        busRoutesAvailable = sc.nextInt(); 
        servalArrivalTime = sc.nextInt();         
        for(int i = 0; i < busRoutesAvailable; i++){
            busArriveAt = sc.nextInt(); 
            busInterval = sc.nextInt();
            while(busArriveAt < servalArrivalTime){
                busArriveAt += busInterval;
            }
            if(busArriveAt < bestChoice){
                bestChoice = busArriveAt;
                count = i+1;
            }            
        }    
        System.out.println(count);    
    }   
}