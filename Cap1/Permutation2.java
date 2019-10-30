import java.util.Arrays;
public class Permutation2{
    public static void main(String[] args){
        String text = "hola ";
        String permutation = "ahol ";
        System.out.println(checkPermutation(text, permutation));
    }
    public static boolean checkPermutation(String text, String permute){
        if(text.length() != permute.length()){
            return false;
        }
        char[] sortText1 = text.toCharArray();
        char[] sortText2 = permute.toCharArray();
        Arrays.sort(sortText1);
        Arrays.sort(sortText2);
        for(int i = 0; i < sortText2.length; i++){
            if(sortText1[i] != sortText2[i]){
                return false;
            }
        }    
        return true;
    }
}