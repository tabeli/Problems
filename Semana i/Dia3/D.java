import java.util.Scanner;
public class D{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()), i = 0;
        String text = sc.nextLine(), res = ""; 
        for(i = 0; i < n-1; i++){
            if(text.charAt(i) != text.charAt(i+1)){
                res = String.valueOf(text.charAt(i)) + String.valueOf(text.charAt(i+1));
                break;
            }
        }
        if(res.length() != 0){
            System.out.println("YES");
            System.out.println(res);
        } else{
            System.out.println("NO");
        }
    }
}