import java.util.*;
public class Swap {
    void sw(int x,int y){
        int t;
        //t=a;
        //a=b;
        //b=t;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("The value of a is:"+x);
        System.out.println( "The value of b is :"+y);
    }
    public static void main(String[] args) {
        Swap ss=new Swap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers for swapping:");
        int a= 10;
        int b=20;
        System.out.println("Values before swap:");
        System.out.println("The value of a is:"+a);
        System.out.println("The value of b is:"+b);
        System.out.println("Values after swap:");
        ss.sw(a,b);
    }
}
//String is immutable in java