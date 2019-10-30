import java.util.ArrayList;

public class StringPermutation{
    public static void main(String[] args){
        System.out.println(getPermutation("abc"));
    }
    public static ArrayList<String> getPermutation(String s){
        ArrayList<String> results = new ArrayList<String>();
        permutations("", s, results);
        return results;
    }

    private static void permutations(String prefix, String suffix, ArrayList<String> results){
        if(suffix.length() == 0){
            results.add(prefix);
        } else {
            for(int i = 0; i < suffix.length(); i++){
                permutations(prefix + suffix.charAt(i), suffix.substring(0,i) + suffix.substring(i+1), results);
            }
        }

    }
}