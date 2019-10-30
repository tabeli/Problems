

public class WordScramble {
    public static void main(String[] args){
        char[][] arr = {
        {'h','a'}, 
        {'t','e'}, 
        {'e','u'}, 
        {'e','b'}, 
        {'p','d'}};
        //i: 0 - 4, j: 0 - 3
        //Pa acordarme porque se le tiene que poner 'static' a las de abajo
        WordScramble hola = new WordScramble();
        
        char[][] newArr = hola.turnChars(arr);
        for(int i = 0; i < newArr.length; i++){
            for(int j = 0; j < newArr[i].length; j++){
                System.out.print(newArr[i][j] + " - ");
            }
            System.out.println();
        }
        
    }

    public char[][] turnChars(char[][] arr){
        char[][] turnedArr = new char[arr[0].length][arr.length];
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                turnedArr[j][arr.length-i-1] = arr[i][j];                
            }
        }
        return turnedArr;
    }
    
    public void turnCharNoExtraMemory(char[][] arr) {
        int count=0, tempChar=0;
    }

    

}