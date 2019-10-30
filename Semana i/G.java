import java.util.*;
public class G{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0, i = 0, teamSize = 0;        
        n = sc.nextInt();        
        teamSize = sc.nextInt();
        HashMap<Integer,Integer> indexes = new HashMap<Integer,Integer>();
        for(i = 0; i < n; i++){
            indexes.put(sc.nextInt(), i+1);
        }   
        if(indexes.size() >= teamSize){
            System.out.println("YES");
            int count = 1;
            for (Integer x : indexes.values()) {
                System.out.print(x + " ");            
                if(count++ >= teamSize){
                    break;
                }
            }
        } else{
            System.out.println("NO");
        }
    }
}