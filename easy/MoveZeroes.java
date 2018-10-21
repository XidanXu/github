package leetcode.easy;

public class MoveZeroes {
//My own solution
    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast;
        int count = 0;
        
        for(fast = 0; fast < nums.length; fast ++){
            if(slow == fast){
                if(nums[slow] != 0){
                    System.out.println(slow);
                    slow ++;
                    continue;
                }
        }
            while(nums[fast] == 0 && fast < nums.length - 1){
                count ++;
                fast ++;
            }
            nums[slow] = nums[fast];
            //nums[slow + fast - slow] = nums[slow + fast - slow + 1];
            slow ++;
            
        }
        
        for(int i = slow ; i < nums.length; i ++){
            nums[i] = 0;
        }
    }
}
