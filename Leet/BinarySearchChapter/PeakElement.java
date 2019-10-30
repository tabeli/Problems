public class PeakElement{
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,2,1};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {       
        if(nums == null || nums.length == 0) return -1;
        if(nums.length == 1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[nums.length-1] > nums[nums.length-2]) return nums.length-1;
        int start, end, middle;
        start = 1;
        end = nums.length - 2;
        middle = end/2;
        while(start <= end){
            middle = start + (end - start) / 2;
            System.out.println("middle: " + nums[middle]);            
            if(nums[middle] > nums[middle-1] && nums[middle] > nums[middle+1]){
                return middle;
            } else if(nums[middle] < nums[middle+1]){
                start = middle + 1;
            } else if(nums[middle] < nums[middle-1]){
                end = middle;
            }
        }  
        return -1;
    }      
}