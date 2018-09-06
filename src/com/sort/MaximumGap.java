package com.sort;

import java.util.Arrays;
import java.util.Stack;

public class MaximumGap {
    public int maximumGap(int[] nums) {
        Stack<Integer> stack = new Stack<Integer>();
        Arrays.sort(nums);
        if (nums.length < 2)
            return 0;
        for (int i = nums.length - 1; i > 0; i-- ){
            int j = i - 1;
            if (stack.empty()){
                stack.push(0);
            }
            if (nums[i] - nums[j] > stack.peek()){
                stack.push(nums[i] - nums[j]);
            }
        }
        return stack.peek();
    }
    public static void main(String[] args){
        int[] nums = {2};
        MaximumGap maximumGap = new MaximumGap();
        int max = maximumGap.maximumGap(nums);
        System.out.println(max);
    }
}
