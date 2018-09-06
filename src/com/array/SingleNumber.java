package com.array;

import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] num = input.nextLine().split(",");
        int[] numInt = new int[num.length];

        for (int i = 0; i < numInt.length; i++)
            numInt[i] = Integer.parseInt(num[i]);

        SingleNumber single = new SingleNumber();
        int sin = single.singleNumber(numInt);
        System.out.println(sin);

    }
    public int singleNumber(int[] numInt) {
        int[] count = new int[numInt.length];
        int flag = 0;
        for (int i = 0; i < numInt.length; i++){
            count[i] = 0;
            for (int j = 0; j < numInt.length; j++){
                if (i != j){
                    if (numInt[i] == numInt[j]){
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
        return numInt[flag];
    }
}
