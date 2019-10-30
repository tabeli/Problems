public class StringToSum{
    public static void main(String[] args){
        String str = "987543219875432123457234487543567875453475432";
        System.out.println(digitsSum(str));
    }

    public static int digitsSum(String str){
        int result = 1;
        for(int i = 0; i < str.length(); i++){            
            result *= charToInt(str.charAt(i));
            System.out.println(result);
        }

        return result;
    }
    public static int charToInt(char c){
        if(c < '0' || c > '9'){
            throw new IllegalArgumentException("Char debe ser un numero");
        }
        return c - '0';
    }

}