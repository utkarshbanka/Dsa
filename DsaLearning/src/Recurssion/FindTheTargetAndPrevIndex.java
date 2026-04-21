package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class FindTheTargetAndPrevIndex {


    public static List<Integer> findTarget(int[] a, int target, List<Integer> b, int p) {


        if(p == a.length-1){
            if(target == a[p]){
                b.add(p);
                b.add(p-1);
                return b;
            }
            else {
                return b;
            }
        }
        if(a[p]==target){
            b.add(p);
            b.add(p-1);
            return b;
        }

      return   findTarget(a,target,b,p+1);

    }

    public static void main(String[] args) {


        List<Integer> a = new ArrayList<>();
        List<Integer> b =  findTarget(new int[] {4,1,2,3,5,6,7}, 4, a, 0 );
        System.out.println(b);

    }
}
