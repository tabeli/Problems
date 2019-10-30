public class StringsAnagram{
    public static void main(String[] args){
        String s1 = "hola";
        String s2 = "aloh";
        System.out.println(isAnagram(s1,s2));
        System.out.println((int) 'c');
    }

    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int i = 0;

        //This is binary, is equal to 256 or 2^8
        int[] checker = new int[1<<8];

        for(i = 0; i < s1.length(); i++){                            
            checker[s1.charAt(i)]++;                                 
            checker[s2.charAt(i)]--;            
        }        

        for(i = 0; i < checker.length; i++){                                  
            if(checker[i] != 0){                
                return false;
            } 
        }

        return true;
    }
}