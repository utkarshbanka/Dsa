package Recurssion;

public class SelectionSortRecursion {


    public static int[] selectionSort(int[] arr, int r, int c, boolean swapped, int min){

        if(swapped==true){
            return arr;
        }
// this is question where i got stuck
        
        if(c<r){

            if(arr[c]<arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            selectionSort(arr,r,c,swapped,min);
        }

         return selectionSort(arr,r-1,0,swapped,min);

    }


    public static void main(String[] args) {


        int [] arr = {5,1,6,3,2,1};

        boolean swapped = false;
        int min = Integer.MAX_VALUE;
        int [] ans = selectionSort(arr, arr.length -1, 0, swapped,min);

    }
}
