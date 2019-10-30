import java.util.Scanner;

public class B{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 0, count = 0, temp = 1;        
        int[] nums = new int[101];;       
        for(i = 0; i < n; i++){
            nums[i] = sc.nextInt();            
        }
        for(i = 0; i < n; i++){
            temp = 1;
            while((nums[i] + 1) == nums[i+1]){
                if(nums[i] == 1 || nums[i+1] == 1000){
                    temp++;
                    temp++;
                }else temp++;
                i++;
            }
            if((temp-2) > count){
                count = temp - 2;
            }
        }
        System.out.println(count);        
    }
}