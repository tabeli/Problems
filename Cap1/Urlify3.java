public class Urlify3{
    public static void main(String[] args){
        char[] test = {'M', 'r', ' ', 'J', 'h', 'o', 'n', ' ', 'S', 'm', 'i', 't', 'h'};
        int size = 13;
        char[] result = checkUrl(test, size);
        for(int j = 0; j < result.length; j++){
            System.out.print(result[j]);
        }
    }

    public static char[] checkUrl(char[] text, int size){
        int spaces = 0, index = 0, i = 0;
        for(i = 0; i < size; i++){
            if(text[i] == ' '){
                spaces++;
            }
        }
        index = size + spaces*2;
        if(size != text.length) return text;
        for(i = size; i > 0; i--){
            if(text[i] == ' '){
                text[index-1] = '0';
                text[index-2] = '2';
                text[index-3] = '%';
                index -= 3;                
            } else{
                text[index-1] = text[i];
                index--;
            }
        }        
        return text;
    }
}