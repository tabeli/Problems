import java.util.Hashtable;
import java.util.Arrays;
import java.util.ArrayList;

public class PalindromePermutation4{
    public static void main(String[] args){
        String text = "aaabb";
        System.out.println(checkIf(text));
    }
    public static boolean checkIf(String text){
        String newText = text.toLowerCase().replaceAll("\\s","");
        System.out.println(newText);
        char[] textArray = newText.toCharArray();
        Hashtable<Character, Integer> dictionary = new Hashtable<Character, Integer>();
        int temp, i = 0;        
        for(i = 0; i < textArray.length; i++){  
            temp = 0;          
            if(dictionary.get(textArray[i]) != null){
                temp = dictionary.get(textArray[i]);
                dictionary.replace(textArray[i], temp+1);                                             
            } else if(dictionary.get(textArray[i]) == null){
                dictionary.put(textArray[i], 1);            
            }
            System.out.println("Value is: " + dictionary);            
        }
        int count = 0;
        List<String> deDupStringList = new ArrayList<>(new HashSet<>(textArray));
        System.out.println(deDupStringList);
        for(i = 0; i < textArray.length; i++){            
            if(dictionary.get(textArray[i]) != null){
                temp = dictionary.get(textArray[i]);
                System.out.println(temp);
                if((temp % 2) == 1){
                    count++;
                    if(count > 1){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    
}