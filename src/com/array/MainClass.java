package com.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public int singleNumber(int[] nums) {
        int[] count = new int[nums.length];
        int flag = 0;
        for (int i = 0; i < nums.length; i++){
            count[i] = 0;
            for (int j = 0; j < nums.length; j++){
                if (i != j){
                    if (nums[i] == nums[j]){
                        count[i] = 1;
                        break;
                    }
                }
            }
            if (count[i] == 0){
                flag = i;
                break;
            }
        }
        return nums[flag];
    }
}

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);

            int ret = new Solution().singleNumber(nums);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}
