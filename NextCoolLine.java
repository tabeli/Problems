// 1
// 1 1
// 2 1
// 1 2 1 1  
// 1 1 1 2 2 1 
// 3 1 2 2 1 1

// 1 3 1 1 2 2 2 1
// 1 1 1 3 2 1 3 2 1 1

//input: 1 2 1 1 3
//output : 1 1 1 2 2 1 1 3

// have a counter
// --> go to String each time i have a different character i'll stop counter i'll add it a new String
// format counter + char

//  1 2 1 1
//  1 1 1 2 2 1 1 3

// 1 3 1 1 2 2 2 1

// 1 1 1 3 2 1 3 2 1 1
public class NextCoolLine {
    public static void main(String[] args){
        String str = "11211123";

        System.out.println(nextLine(str));

    }


    public static String nextLine(String str){
        int count = 1;
        String newStr = "";
        if(str.length() == 0) {
            return "1";
        }
        System.out.println(str);
        for(int i = 0; i < str.length()-1; i++){
            while(str.charAt(i) == str.charAt(i+1)){
                i++;
                count++;
                //System.out.println("counter:" + count);
            }            
            
            if(i == str.length()-2 && (str.charAt(i) != str.charAt(i+1))){                
                return newStr += ("1" + str.charAt(i) + "1" + str.charAt(i+1));
            }

            //System.out.println(count + "str:" + newStr + " char: " + str.charAt(i));
            newStr += (String.valueOf(count) + str.charAt(i));
            count = 1; 
                   
        }
        return newStr;
    }
    
    
}

