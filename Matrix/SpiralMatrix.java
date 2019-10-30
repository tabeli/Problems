import java.util.List;
import java.util.*;

class SpiralMatrix {
    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14}
        };
        //i: 0 - 4, j: 0 - 3                
        
        List<Integer> list = spiralOrder(arr);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        } 
        
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int counter = 0;
        int xRight = 0, yRight = matrix[0].length;
        int xDown = 0, yDown = matrix.length;
        int xLeft = matrix.length, yLeft = 0;
        int xUp = 0, yUp = 0;
        List<Integer> spiral = new ArrayList<Integer>();
        while(counter < matrix.length * matrix[0].length){
            //go rigth
            for(int i = xRight; i < yRight; i++){
                spiral.add(matrix[xRight][i]);
                counter++;
                xDown = xRight+1;
                if(counter == (matrix.length * matrix[0].length)){
                    return spiral;
                }
            }

            //go down
            for(int j = xDown; j < yDown; j++){
                spiral.add(matrix[j][yDown]);
                counter++;
                yLeft = yDown-1;
                if(counter == (matrix.length * matrix[0].length)){
                    return spiral;
                }
            }

            //go left
            for(int k = yLeft; k >= yUp; k--){                
                spiral.add(matrix[xLeft-1][k]);
                counter++;  
                xUp = xLeft-2;  
                if(counter == (matrix.length * matrix[0].length)){
                    return spiral;
                }            
            }

            //goUp
            for(int l = xUp; l > xRight; l--){
                spiral.add(matrix[l][yUp]);
                counter++;  
                if(counter == (matrix.length * matrix[0].length)){
                    return spiral;
                }
            }
            xRight++;
            yRight--;
            xDown++;
            yDown--;
            xLeft--;
            xUp--;

        }

        return spiral;
    }
}