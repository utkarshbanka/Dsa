package Recurssion;

public class ReverseNumber {

     public static void rev(int a){

         if(a<=0){
             return;
         }
//         int sum = a/10;
         int sum =  a%10;
         System.out.print(sum);
         rev(a/10);
    }
    public static void main(String[] args) {

         rev(54321);
    }
}
