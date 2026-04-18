package Recurssion;

public class SumofNo1 {

    public static int sum(int a ){

        if(a<=1){
            return a;
        }
        return a * sum(a-1);
    }

    public static void main(String[] args) {

        int ans = sum(5);
        System.out.println(ans);
    }
}
