import java.util.Scanner;
public class C{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 0, bestChoice = 0, someChoice = 0; 
        boolean flag =false;       
        int[] nums = new int[101];;       
        for(i = 0; i < n; i++){
            nums[i] = sc.nextInt();            
        }
        i = 0;
        while(nums[i] == nums[i+1]){
            System.out.println("hola");
            someChoice++;
            i++;
        }
        
        i++;
        while(nums[i] == nums[i+1]){
            System.out.println("hi");
            someChoice++;
            i++;
        }
        if(bestChoice < someChoice){
            bestChoice = someChoice;       
        }
        
        System.out.println(bestChoice);
    }
}