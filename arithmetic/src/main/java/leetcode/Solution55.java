package leetcode;

public class Solution55 {
    public static boolean canJump(int[] nums) {
        if (nums == null || nums.length ==0 || nums[0] == 0) {
            return false;
        }
        int pos = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i --) {
            if (nums[i] + i >= pos) {
                pos = i;
            }

        }
        return pos == 0 ? true : false;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,0};
        System.out.println(canJump(nums));
    }
}
