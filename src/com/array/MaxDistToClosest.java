package com.array;

public class MaxDistToClosest {
    public static int maxDist(int[] seats){
        int maxSeats = 0;
        int count = 0;
        int index = 0;

        for (int i = 0; i < seats.length; i++){
            if (seats[i] == 1){
                count++;
                if (count == 1){
                    maxSeats = i;
                }
                maxSeats = i - index > maxSeats * 2 ? (i - index)/2 : maxSeats;
                index = i;
            }
        }
        if (count == 1)
            maxSeats = maxSeats > seats.length - 1 - maxSeats
                    ? maxSeats : seats.length - 1 - maxSeats ;
        else {
            maxSeats = maxSeats > seats.length - 1 - index
                    ? maxSeats : seats.length  - 1 - index;
        }
        return maxSeats;
    }
    public static void main(String[] args){
        int[] seats = {1,0,0,0};
        int max = maxDist(seats);
        System.out.println(max);
    }
}
