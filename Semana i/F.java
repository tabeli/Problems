import java.util.Scanner;
public class F{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0, i = 0, start = 0, end = 0, skill = 0, count = 0;        
        n = sc.nextInt();
        end = n -1;
        skill = sc.nextInt();
        int[] arr = new int[n];
        for(i = 0; i < n; i++){
            arr[i] = sc.nextInt();                                                     
        }   
        i = 0;
        while(start <= end){                                    
            if(arr[start] <= skill && start != end){                
                count++;
                start++;
                continue;
            }                        
            if(arr[end] <= skill){                              
                count++;
                end--;
                continue;
            }                        
            
            if(arr[start] > skill && arr[end] > skill){                
                break;
            }
        }
        System.out.println(count);
    }
}