import java.sql.SQLOutput;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms:");
        int n= sc.nextInt();
        int a=0;
        int b=1;
        for(int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println("The fibonacci series is:"+c+" ");

        }
        System.out.println("The nth fibonacci number is:"+b);
    }
}
