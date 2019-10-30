import java.util.Scanner;

public class G{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()), i = 0, count = 0, temp = 0;
        String text = sc.nextLine();         
        for(i = 0; i < n; i++){            
            if((int)text.charAt(i) > 64 && (int)text.charAt(i) < 91){                
                temp++;            
            }
            //System.out.println("ch: " + text.charAt(i));
            if(text.charAt(i) == ' '){                
                if(temp > count){                    
                    count = temp;
                    temp = 0;
                } else{
                    temp = 0; 
                }
            }
            if(i == n-1){
                if(temp > count){                    
                    count = temp;
                    temp = 0;
                }
            }
        }        
        System.out.println(count);
    }
}