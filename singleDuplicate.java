public class singleDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,1,2,3,3,4,4,8,8};
        
        int result = isDuplicate(nums,0,nums.length-1);
        System.out.println(result);
        
    }

    static int isDuplicate(int[] nums, int low, int high){
        int mid = (low + high)/2;
        int element = 0;
        if(mid == 0){
            if(nums[mid] < nums[mid+1]){
                element =  nums[mid];
            }
        }else if(mid == nums.length-1){
            if(nums[nums.length] > nums[nums.length-2]){
                element = nums[nums.length-1];
            }
        }else {
            if(nums[mid-1] < nums[mid+1] && nums[mid] > nums[mid-1]){
                element = nums[mid];
            }else{
                isDuplicate(nums, low , mid-1);
                isDuplicate(nums, mid+1 ,high);
            }
        }
        return element;
    }

}
