package Recurssion;

public class ArrayIsSortedOrNot {

    public static boolean  arrayIsSortedOrNot(int[] array, int start){

        if(start==array.length-1 ){
            return true;
        }
        if(array[start] > array[start+1]){
            return false;
        }else{
            return arrayIsSortedOrNot(array, start+1);
        }

    }

    public static void main(String[] args) {


        int [] a = {1,2,3,0,4,5,6};

        boolean b = arrayIsSortedOrNot(a,0);
        System.out.println(b);

    }
}
