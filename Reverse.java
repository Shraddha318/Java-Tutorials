import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the no.:");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int ans=0;
        while(a>0) {
            int b=(a%10);
            a=a/10;
            ans=(ans*10)+b;
        }
        System.out.println(ans);

    }
}
