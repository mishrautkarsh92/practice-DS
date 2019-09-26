package com.practice.arrays;

public class MinMoveToShiftEvenOnRight {
    public static void main(String[] args) {
        int arr[] = new int[]{3,4,7,8,6,5,2};
        System.out.println(getMinMoveToShiftEvenOnLeft(arr));
    }
    public static int getMinMoveToShiftEvenOnLeft(int arr[]){
        int move = 0;
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0) {
                for (int j = arr.length - 1; j > i; j--) {
                    if (arr[j] % 2 == 0){
                          temp = arr[j];
                          arr[j] = arr[i];
                          arr[i] = temp;
                          move+=1;
                          break;
                    }
                }
            }
        }
        return move;
    }
}