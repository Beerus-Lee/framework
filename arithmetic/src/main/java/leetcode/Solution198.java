package leetcode;

import java.util.Arrays;

public class Solution198 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int[] memo =  new int[nums.length];
        Arrays.fill(memo,-1);
        return tryRob(nums,0,memo);
    }

    private static int tryRob(int[] nums,int index,int[] memo) {
        if (index >= nums.length) {
            return 0;
        }
        if(memo[index] > -1) {
            return memo[index];
        }
        int res = 0;
        for (int i = index; i < nums.length; i ++) {
            res = Math.max(res,nums[i] + tryRob(nums,i + 2,memo));
        }
        memo[index] = res;
        return res;
    }
}
