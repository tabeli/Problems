class Common_14 {
    
    public static void main(String[] args){
        String[] commonPrefix = {"flow", "flower", "flight"};
        System.out.println(longestCommonPrefix(commonPrefix));
    }
    
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        int len = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() < len){
                len = strs[i].length();               
            }
        }
        int count = 0;
        char check;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < strs.length; j++){                
                check = strs[0].charAt(i);                 
                if(check == strs[j].charAt(i)){
                    count++;                   
                }
                else{ 
                    
                    count /=strs.length;                    
                    if(count > 0){
                        return strs[0].substring(0,count);
                    }
                    else{
                        return "";
                    }
                }
            }
        }       
        return strs[0].substring(0,count/=strs.length);
    }
}