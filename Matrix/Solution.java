import java.util.*;

class Solution {
    
    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9,10,11,12}
        };
        //i: 0 - 4, j: 0 - 3                
        
        List<Integer> list = spiralOrder(arr);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        } 
        
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<Integer>();
        if(matrix.length == 0){
            return spiral;
        }
        int stateA = 0;
        int stateB = matrix[0].length;
        int stateC = matrix.length;
        int stateD = 0;
        int counter = 0;
        
        int countA = 0;
        int countB = 0;
        int countC = matrix[0].length;
        int countD = matrix.length;
        
        while(counter < (matrix.length * matrix[0].length)){
            for(int i = countA; i < stateB; i++){
                spiral.add(matrix[stateA][i]);
                counter++;
                if(counter == (matrix.length * matrix[0].length)){
                    return spiral;
                }
            }
            for(int j = countB+1; j < stateC; j++){                             
                spiral.add(matrix[j][stateB-1]);
                counter++;
                if(counter == (matrix.length * matrix[0].length)){
                    return spiral;
                }
            }
            for(int k = countC-2; k >= stateD; k--){
                spiral.add(matrix[stateC-1][k]);
                counter++;
                if(counter == (matrix.length * matrix[0].length)){
                    return spiral;
                }
            }
            for(int l = countD-2; l >= stateA+1; l--){
                spiral.add(matrix[l][stateD]);
                counter++;
                if(counter == (matrix.length * matrix[0].length)){
                    return spiral;
                }
            }
            stateA++;
            stateB--;
            stateC--;
            stateD++;
            countA++;
            countB++;
            countC--;
            countD--;
        }
        return spiral;
    }
}