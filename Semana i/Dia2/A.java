import java.util.Scanner;

public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0, i = 0, numsLen = 0, divideNum = 0, getModule = 0, firstNum = 0;        
        n = sc.nextInt();                        
        for(i = 0; i < n; i++){            
            numsLen = sc.nextInt();
            divideNum = sc.nextInt();
            if(numsLen > 2){
                getModule = (int)Math.pow(10, numsLen-1);
                firstNum = (int)Math.floor(divideNum/getModule);
                divideNum = divideNum%getModule;
                System.out.println("YES");
                System.out.println(2);
                System.out.print(firstNum + " ");
                System.out.println(divideNum);
            } else if(numsLen == 2) {
                if((int)Math.floor(divideNum/10) < divideNum%10){
                    System.out.println("YES");
                    System.out.println(2);
                    System.out.print((int)Math.floor(divideNum/10) + " ");
                    System.out.println(divideNum%10);
                } else{
                    System.out.println("NO");
                }
            }
        }   
    }
}