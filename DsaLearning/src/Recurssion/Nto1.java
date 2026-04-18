package Recurssion;

public class Nto1 {


    public  static  void count(int a)
    {
        if(a==0){
            return;
        }
        System.out.println("count = " + a);
        count(a-1);
    }


    public static void rev(int a){
        if(a==0){
            return;
        }
//
        rev(a-1);
        System.out.println("rev = " + a);

    }


    public static void main(String[] args) {

        count(5);
        rev(5);
    }
}
