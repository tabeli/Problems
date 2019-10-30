import java.util.Scanner;
public class D{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), l = 0, r = 0, sum = 0;        
        for(int i = 0; i < n; i++){
            l = sc.nextInt();
            r = sc.nextInt();
            if(l%2 == 0){
                if(r%2 == 1){
                    System.out.println((l/2)+(-1*((r/2)+1)));
                }else{
                    System.out.println((l/2) + (r/2));
                }
            }else{
                if(r%2 == 0){
                    sum = (1 + r/2 + (-1 * ((l/2) + 1)));
                    System.out.println(sum);
                }else{
                    System.out.println(-1*((l/2) + (r/2) + 1));
                }
            }
        }
    }
}