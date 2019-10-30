public class MinimumSizeSubarraySum_209{
    public static void main(String[] args){
        int s = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(s,nums));
    }
    public static int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }            
        int sum = 0, minlen = Integer.MAX_VALUE, slow = 0;
        for(int fast = 0; fast < nums.length; fast++) {
            sum += nums[fast];
            while(slow < fast && sum - nums[slow] >= s){
                sum -= nums[slow++];
            }
            if(sum >= s){
                minlen = Math.min(minlen, fast - slow + 1);
            }      
        }
        return (minlen == Integer.MAX_VALUE) ? 0 : minlen;
    }
}