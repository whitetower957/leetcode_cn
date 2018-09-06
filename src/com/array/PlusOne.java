package com.array;

import java.util.Scanner;

/**
 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。

 `最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

 你可以假设除了整数 0 之外，这个整数不会以零开头。
 示例 1:

 输入: [1,2,3]
 输出: [1,2,4]
 解释: 输入数组表示数字 123。
 示例 2:

 输入: [4,3,2,1]
 输出: [4,3,2,2]
 解释: 输入数组表示数字 4321。
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        return digits;
    }
    public static int puls(int n){
        return n;
    }
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        String[] dig = input.nextLine().split(",");
        int[] digits = new int[dig.length];

        for (int i = 0; i < dig.length; i++)
            digits[i] = Integer.parseInt(dig[i]);

        PlusOne one = new PlusOne();
        one.plusOne(digits);
    }
}
