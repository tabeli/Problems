public class Unique1{
    public static void main(String[] args){
        String text = "azbaceua";
        System.out.println(ItIs(text));     
    }
    public static boolean ItIs(String text){
        if(text.length() > 128){
            return false;
        }
        else{
            int val;
            boolean alphabet[] = new boolean[128];            
            for(int i = 0; i < text.length(); i++){
                val = text.charAt(i);
                System.out.println(val);
                if(alphabet[val]){ //Ya se habia encontrado previamente el caracter                    
                    return false;
                }
                alphabet[val] = true;
            }
        }
        return true;     
    }
}