package com.learn.interview;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

    public List<Integer> removeDuplicate(int[]nums){
        List<Integer> list = new ArrayList<Integer>();
        int n = nums.length;
        int index=0;
        while(index<n){
            int start = index+1;
            if(start<n && nums[start]==nums[index]){
                while(start<n && nums[start]==nums[index]){
                    start++;
                }
                index=start;
            }else{
                list.add(nums[index]);
                index++;
            }
        }
        return list;
    }
    public static void main(String[]args){
        int[] nums = new int[]{1,1,1,1};
        RemoveDuplicate solution = new RemoveDuplicate();
        List<Integer> res = solution.removeDuplicate(nums);
        System.out.println(res);
    }
}
