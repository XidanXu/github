package leetcode.easy;

public class RotateArray {
    
    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }
    
    //brute force
//    public void rotate(int[] nums, int k) {
//        int kk = k;
//        while (kk > nums.length){
//            kk = kk - nums.length;
//        }
//        k = kk;
//        if(k < nums.length && k != 0){
//             int[] result = new int[nums.length];
//             for(int i = nums.length - k; i < nums.length; i ++) {
//                 result[i - (nums.length - k) ] = nums[i];
//            }
//
//             for(int i = 0; i < nums.length - k ; i ++) {
//                 result[i + k] = nums[i];
//             }
//
//            for(int i = 0; i < nums.length; i ++){
//                nums[i] = result[i];
//             System.out.println(nums[i]);
//            }
//        }
//    }
    
}
