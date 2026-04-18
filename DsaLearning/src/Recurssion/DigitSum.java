package Recurssion;

public class DigitSum {

//    public static int sum(int n) {
//        if(n==0){
//            return 0;
//        }
//        return (n%10)+
//    }

    public static void main(String[] args) {

//        int ans = sum(1342);
//        System.out.println(ans);


        int i = 1324;
         int sum  = 0;
         while(i>0){

             sum = sum + i%10;
             i = i/10;

         }
        System.out.println(sum);


    }
}
