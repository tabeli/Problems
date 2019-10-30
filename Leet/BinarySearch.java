public class BinarySearch{

    public static void main(String[] args){
                   //0 1 2 3 4 5
        int arr[] = {-1,0,3,5,9,12};
        System.out.println(binarySearch(arr,12));
        
        
    }    
    public static int binarySearch(int[] arr, int target){
        return binarySearchParams(arr, target, 0, arr.length-1);
    }
    
    public static int binarySearchParams(int[] arr, int target, int startingIndex, int endIndex){  
        while(endIndex >= startingIndex){
            int middle = startingIndex + (endIndex - startingIndex) / 2;  
            if(arr[middle] == target){
                return middle;
            }
            if(arr[middle] > target){
                return binarySearchParams(arr,target,startingIndex,middle-1);
            }
            else{
                return binarySearchParams(arr,target,middle+1,endIndex);
            }
        }      
        return -1;
        
    }
    
}