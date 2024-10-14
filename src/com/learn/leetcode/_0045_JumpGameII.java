package com.learn.leetcode;

public class _0045_JumpGameII {
    public int jump(int[] nums) {
        int cnt = 0;
        int max = 0;
        int curEnd = 0;
        int n = nums.length;
        for (int idx = 0; idx < n; idx++) {
            if(idx==n-1){
                return cnt;
            }
            max = Math.max(max,idx+nums[idx]);
            if(idx==curEnd){
                cnt++;
                curEnd = max;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        
    }
}
