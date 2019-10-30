public class StringCompression{
    public static void main(String[] args){
        String s = "aabbcccca";
        System.out.println(compress(s));
    }
    public static String compress(String s){
        String c = "";
        int count = 1;
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            } else{
                c = c + s.charAt(i) + count;
                count = 1;
            }
        }
        c = c + s.charAt(s.length() - 1) + count;
        if(s.length() < c.length()){
            return s;
        }
        return c;
    }
}