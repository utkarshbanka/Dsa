package Recurssion;

import java.util.Arrays;

public class MergShort {

    public static int []  mergeSort(int[] arr){

        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int [] first =  mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] second =  mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return mergeArrray(first,second);

    }

    public static int [] mergeArrray(int[] first,int[] second){
        int [] ans = new int [first.length+second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<first.length && j<second.length){

            if(first[i]<second[j]){
                ans[k] = first[i];
                i++;
            }
            else if(second[j]<first[i]){
                ans[k] = second[j];
                j++;
            }
            k++;
        }

        if(i<first.length){
            while(i<first.length){
                ans[k++] = first[i++];
            }
        }
        if(j<second.length){
            while(j<second.length){
                ans[k++] = second[j++];
            }
        }
        return ans;
    }


    public static void main(String[] args) {

        int [] arr = {5,6,7,8,9,1};

        int [] ans = mergeSort(arr);

        System.out.println(Arrays.toString(ans));

    }
}
