import java.util.Scanner;
public class C{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int red = 2, green = 5, blue = 8, friends = 0, sheets = 0;                        
        int necesaryRed = 0, necesaryGreen = 0, necesaryBlue = 0;
        friends = sc.nextInt();
        sheets = sc.nextInt();
        necesaryRed = (int)Math.ceil((double)(red * friends) / sheets);
        necesaryGreen = (int)Math.ceil((double)(green * friends) / sheets);
        necesaryBlue = (int)Math.ceil((double)(blue * friends) / sheets);
        System.out.println(necesaryRed+necesaryGreen+necesaryBlue);
    }
}