import java.util.Scanner;
public class C{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int impares = 0;
        boolean base_impar = (a%2 != 0)?true:false;
        for(int i = 0; i < b; i++){
            long c = sc.nextLong();
            if(i == b-1){
                if(c%2 != 0){
                    impares++;
                }
            }else if(base_impar && c%2 != 0){
                impares++;
            }
        }
        if(impares%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        sc.close();
    }
}