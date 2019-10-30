import java.lang.StringBuilder;
public class StringCompression6{
    public static void main(String[] args){
        String text = "abbbccabbbbb";       
        System.out.println(returnCompression(text));
    }
    public static StringBuilder returnCompression(String text){
        int count = 0;
        StringBuilder newText = new StringBuilder("");
        for(int i = 0; i < text.length(); i++){
            if(i == text.length()-1 || (text.charAt(i) != text.charAt(i+1))){
                count++;
                newText.append(text.charAt(i));                
                newText.append(count);
                count = 0;
            }            
            if(i == text.length()-1 || text.charAt(i) == text.charAt(i+1)){
                count++;
            }            
        }
        if(text.length() < newText.length()){
            StringBuilder temp = new StringBuilder(text);
            return temp;
        }
        return newText;
    }
}