package com.array;

import java.util.Stack;

public class MaxDistToClosest2 {
    public static int maxDist(int[] seats){
        int end = 0;
        int tmp = -1;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < seats.length; i++){
            if (seats[i] == 1){
                if (tmp < 0){
                    stack.push(i);
                    tmp = i;
                }
                if ((i - tmp)/2 > stack.peek())
                    stack.push((i - tmp)/2);
                tmp = i;
                end = i;
            }
        }
        int maxDist = stack.peek() > seats.length - 1 - end  ? stack.peek() : seats.length - 1 - end ;
        return maxDist;
    }
    public static void main(String[] args){
        int[] arr = {1,0,0,0,1,0,1};
        int num = maxDist(arr);
        System.out.println(num);
    }
}
