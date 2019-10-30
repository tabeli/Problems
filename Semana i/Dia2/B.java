import java.util.Scanner;
public class B{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;                
        int[] guys = new int[3];
        int[] grapes = new int[3];
        for(i = 0; i < 3; i++){
            guys[i] = sc.nextInt();
        }
        for(i = 0; i < 3; i++){
            grapes[i] = sc.nextInt();
        }
        while(true){
            //x
            if(guys[0] > grapes[0]){            
                System.out.println("NO");
                break;
            } else{
                grapes[0] -= guys[0];
            }
            //y
            while(grapes[0] > 0 && guys[1] >= grapes[0]){
                grapes[0]--;
                guys[1]--;
            }
            while(guys[1] > 0 && grapes[1] > 0){
                if(grapes[1] == 0 && guys[1] > 0){                    
                    System.out.println("NO");
                    break;                    
                } else{
                    guys[1]--;
                    grapes[1]--;
                }            
            }        
            while(guys[2] > 0 && grapes[1] > 0){
                guys[2]--;
                grapes[1]--;
            }
            //z
            while(guys[2] > 0 && grapes[2] > 0){
                if(grapes[2] == 0 && guys[2] > 0){                    
                    System.out.println("NO");
                    break;
                } else{
                    guys[2]--;
                    grapes[2]--;
                }
            }
            if(guys[2] == 0){
                System.out.println("YES");
                break;
            }
        }
        


    }
}