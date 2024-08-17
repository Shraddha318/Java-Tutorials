import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three no.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
      /*  int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }*/
        int max=Math.max(a,b);
        max=Math.max(max,c);
        System.out.println("The maximum of three no. is "+max);
    }
}
//Math.max is a inbuilt function in java to find max of 3 no.s