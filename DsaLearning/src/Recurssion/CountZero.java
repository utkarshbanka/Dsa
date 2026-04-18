package Recurssion;

public class CountZero {

    public static  void zero(int n, int b){


        if(n<=0){
            int ans = b;

            return;
        }
        int sum =  n%10;
//        int count = 0;
        if(sum==0){
            zero(n/10, b+1);
        }

         zero(n/10,b);
    }


    public static void main(String[] args) {

        zero(1014011, 0);
    }
}
