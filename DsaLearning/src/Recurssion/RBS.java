package Recurssion;

public class RBS {

    public static  int roateBinary(int [] arr, int target, int start, int end) {


            if(start>end){
                return -1;
            }

            int middle =  start + (end-start)/2;
            if(arr[middle]==target){
                return middle;
            }

            if(arr[middle]>target){
                return roateBinary(arr, target, start, middle-1);
            }
            else if(arr[middle]<target){
                 return roateBinary(arr, target, middle+1, end);
            }

         return -1;

    }


    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9,1,2,3};

        int ans = roateBinary(arr,7,0,arr.length-1);
        System.out.println(ans);
    }
}
