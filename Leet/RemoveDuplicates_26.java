public class RemoveDuplicates_26{
    public static void main(String[] args){
        int[] nums = {1,2};
        System.out.println(removeDuplicates(nums));
    }


    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int j = 0;        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[j+1] = nums[i];
                j++;              
            }             
        }
        for(int x = 0; x < nums.length; x++) {
            System.out.println(nums[x]);
        }
        
        return j+1;
    }
}