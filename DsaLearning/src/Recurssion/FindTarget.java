package Recurssion;

public class FindTarget {

    public static  int findTarget(int [] a,int target, int index){


        if(index==a.length){
            if(a[index]==target){
                return index;
            }
            return 0;
        }

        if(a[index]==target){
            return index;
        }
        return findTarget(a,target,index+1);


    }

    public static void main(String[] args) {

        System.out.println(findTarget(new int[]{1,2,3,0,4,5,6}, 2, 0));
    }
}
