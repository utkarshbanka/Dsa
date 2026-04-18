package Recurssion;

public class NumberOfStep {


    public static int numberOfSteps(int n, int b){
        if(n<=0){
            return b;
        }

        if(n%2==0){
           return numberOfSteps(n/2, b+1);
        }else{
           return  numberOfSteps(n-1, b+1);
        }


    }

    public static void main(String[] args) {

        int ans = numberOfSteps(8, 0);
        System.out.println(ans);
    }
}
