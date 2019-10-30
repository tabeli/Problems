public class SearchRotatedSortedArray{
    public static void main(String[] args){
        // [0,1,2,4,5,6,7]
        // [4,5,6,7,0,1,2]
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(search(arr,8));

    }

    public static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
        if(nums.length == 1 && nums[0] != target) return -1;
        if(nums.length == 2 && nums[0] != target && nums[1] != target) return -1;
        if(nums.length == 3 && nums[0] != target && nums[1] != target && nums[2] != target) return -1;
            int start = 0;
            int end = nums.length-1;
            int middle = end / 2;                 
        while(start <= end){   
            System.out.println(middle + " " + start + " " + end); 
                             
            if(nums[middle] == target){
                return middle;
            } else if(nums[start] == target){
                return start;
            } else if(nums[end] == target){
                return end;
            } else if((nums[start] < target && nums[middle] > target && nums[end] < target) || (nums[start] < target && nums[middle] > target && nums[end] > target)) {                              
                end = middle - 1;
                middle = start + (end-start)/2;
                //System.out.println("here");
            } else if((nums[start] > target && nums[middle] < target && nums[end] > target) || (nums[start] < target && nums[middle] < target && nums[end] > target)){                
                start = middle + 1;                
                middle = start + (end-start)/2;                
                //System.out.println("not here");            
            } else if((nums[start] > target && nums[middle] > target && nums[end] < target) || (nums[start] > target && nums[middle] < target && nums[end] < target)){
                return -1;
            } else if((nums[start] > target && nums[middle] > target && nums[end] > target) || (nums[start] < target &&nums[middle] < target && nums[end] < target)){
                if(nums[middle] == target){
                    return middle;
                } else if(nums[middle] < nums[end]){
                    start = 0;
                    end = middle - 1;
                    middle = start + (end - start) / 2;
                } else if(nums[middle] > nums[end]){
                    start = middle + 1;
                    middle = start + (end - start) / 2;
                }
            }
            if(start == middle && middle == end) break; 
        }        
        return -1;
    }
        
}