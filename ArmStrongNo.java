import java.util.*;
public class ArmStrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int a=sc.nextInt();
        for(int a=100;a<1000;a++) {
        if(armstrong(a)){
            System.out.println(a);
        }
        }
    }
    static boolean armstrong(int a){
        int org=a;
        int sum=0;
        while(a>0){
            int rem=a%10;
            a=a/10;
            sum= sum+rem*rem*rem;;
        }
                return sum==org;
    }

}
