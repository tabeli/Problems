
public class OneWay5{
    public static void main(String[] args){
       String text = "maple";
       String compare = "maples"; 
       System.out.println(itIs(text, compare));
    }

    public static int itIs(String text, String compare){
        if(text.compareTo(compare) == 0) return 0;            
        if((Math.abs(text.length() - compare.length())) > 1) return 2;
        int count = 0, i = 0, c = 0;        
        if(text.length() == compare.length()){  //This one is for when you only need to modify one caracter            
            for(i = 0; i < text.length(); i++){
                if(text.charAt(i) != compare.charAt(i)){
                    if(count > 1){                        
                        return count;
                    }                    
                    count++;
                }                
            }
        }
        //Downside is when you have to insert or remove an element        
        if(text.length() > compare.length()){
            c = 0;
            for(i = 0; i < text.length(); i++){
                if(text.charAt(i) != compare.charAt(c)){
                    if(count > 1){
                        return count;
                    }
                    count++;                    
                } else {
                    c++;
                }                
            }
        } else if(text.length() < compare.length()){
            c = 0;
            for(i = 0; i < compare.length(); i++){
                if(text.charAt(c) != compare.charAt(i)){
                    if(count > 1){
                        return count;
                    }
                    count++;                    
                } else{
                    c++;
                }                
            }
        }

        return count;
    }
}