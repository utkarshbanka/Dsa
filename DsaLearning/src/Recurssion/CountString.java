package Recurssion;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountString {


    public  static  String retur(){

        try{
             return "a";
        }catch (Exception e){
            return "b";
        }finally {
            System.out.println("finally");
        }
    }


    public static void main(String[] args) {


//        String [] words = {"Java","String", "Java"};
////        int count = 0;
//
//        long count  = Arrays.stream(words).filter(m->m.equalsIgnoreCase("Java")).count();
//        System.out.println(count);
//
//        String sn = retur();
//        System.out.println(sn);

     String s = "Java";

         long cou =  Arrays.stream(s.split("")).filter(j->j.contains("a")).count();
        System.out.println(cou);
    }

}
