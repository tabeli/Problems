import java.util.Scanner;
public class E{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean flag = true;
        char ch = 'i';
        String s = "", t = "";
        s = sc.nextLine();
        t = sc.nextLine();        
        while(true){
            if(s.length() != t.length()){
                System.out.println("NO");
                break;
            }             
            for(i = 0; i < s.length(); i++){
                if(isVowel(s.charAt(i)) && !isVowel(t.charAt(i)) || !isVowel(s.charAt(i)) && isVowel(t.charAt(i))){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
            
            break;
        }
        
       
    }
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        else
            return false;
    }
}