import java.util.*;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.:");
        int n= sc.nextInt();
        boolean a=isPrime(n);
        System.out.println(""+a);
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
           if(n%c==0) {
               return false;
           }
           c++;
        }
        if(c*c>n){
            return true;
        }
        return false;
    }
}
