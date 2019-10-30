public class RemoveElement_27{
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int val = 1;
        System.out.println(removeElement(nums,val));
        System.out.println();
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int temp = 0;        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){                
                while(nums[i] == val){
                    if(i == nums.length-1){                                                
                        return temp;
                    } else{
                        i++;
                    }
                }
                nums[temp] = nums[i];
                System.out.println(nums[temp]);
                temp++;  
                if(nums[temp] == val || (nums[temp]!= val && temp <= i)) {                    
                    while(nums[temp] == val || (nums[temp]!= val && temp <= i)){                                               
                        if(i < nums.length-1){
                            i++;
                        }
                        else{                            
                            return temp;
                        } 
                        while(nums[i] == val){
                            if(i == nums.length-1){  
                                                                           
                                return temp;
                            } else{
                                i++;
                            }
                        }                    
                    nums[temp] = nums[i];
                    temp++;  
                    } 
                }                                                                                      
            } else{
                temp++;
            }
            
        }
        return temp;
    }
}