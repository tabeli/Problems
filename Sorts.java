import java.util.*;
class Sorts {
    public static void main(String[] args){
        int[] nums = {8,15,4,2,8,4,9,13,4};
        bubble(nums);
        int[] newNums = mergeSort(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        System.out.println();
        for(int i = 0; i < newNums.length; i++){
            System.out.println(newNums[i]);
        }
    }

    public static int[] bubble(int[] nums) {
        int temp;
        for(int j = 0; j < nums.length; j++){
            for(int i = 0; i < nums.length-j-1; i++){
                if(nums[i] > nums[i+1]){
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        }
        return nums;
    }

    public static int[] mergeSort(int[] array){
    	int[] arr = array;
        if(arr.length == 1) // In case the array is of size one, it returns the array
        return arr;
        else{
        	int index = 0;
             // Two extra arrangements are made, one for the first part of the original arrangement and one for the second part
        	int[] arrFirstPart = new int[arr.length/2];
        	int[] arrSecondPart = new int[arr.length - (arr.length/2)];
            // Then both arrays are filled with the elements of the original array
        	for(int i = 0; i < arrFirstPart.length; i++){
        		arrFirstPart[i] = arr[index];
        		index++;
        	}
        	for(int j = 0; j < arrSecondPart.length; j++){
        		arrSecondPart[j] = arr[index];
        		index++;
        	}
            // Split the array until the size of each split is one
        	arrFirstPart = mergeSort(arrFirstPart);
        	arrSecondPart = mergeSort(arrSecondPart);
            // The array is ordered, performing the merge
        	arr = merge(arrFirstPart, arrSecondPart);
        	return arr;
        }   
    }
     // This method performs the merge of the elements
    public static int[] merge(int[] part1, int[] part2){
    	int i = 0;
    	int j = 0;
         // A new arrangement is created that can store the ordered elements of the two arrays that the method receives
    	int[] arr = new int[part1.length + part2.length];
    	for(int k = 0; k < arr.length; k++){
        	  // We will check 4 cases to get the data into the new arrangement
        	  /* In case the index of the first part has already reached the size of the array part1 then the next value 
        	  of part two will be added and one is added in the index j*/
        	  if(i == part1.length){
        	  	arr[k] = part2[j];
        	  	j++;
            }  /* In case the index of the second part has already reached the size of the array part2 then the next 
            value of part one will be added and one is added in the index i*/

            else if(j == part2.length){
            	arr[k] = part1[i];
            	i++;
            }
            /* In case the element of array one is smaller than or equal to the element of array two, then
            the element of part one is added to the array created in the current position*/
            else if(part1[i] == part2[j]){
            	arr[k] = part1[i];
            	i++;
            } 
            //The rest of cases(the part one is bigger than part two)
            else{
            	arr[k] = part2[j];
            	j++;
            }
        }
        return arr;
    }
    

}