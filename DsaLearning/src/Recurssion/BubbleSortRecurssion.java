package Recurssion;

import java.util.Arrays;

public class BubbleSortRecurssion {


    public static int[] bubbleSort(int[] arr , int r, int  c ) {

        if(r==c){
            return arr;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubbleSort(arr,r,c+1);
        }
       return bubbleSort(arr,r-1,0);

    }

    public static void main(String[] args) {


         int [] arr = {5,6,7,8,9,1,2,3};
         bubbleSort(arr, arr.length-1, 0);

        System.out.println(Arrays.toString(arr));
    }
}
