import java.util.*;
public class OccurenceCount {

    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number for occurence count:");
    int a = sc.nextInt();
    int count = 0;
    System.out.println("Enter the digit for repetition count:");
    int n=sc.nextInt();
    while(a >0)
    {
        int rem = a % 10;
        if (rem == n) {
            count++;
        }
        a = a / 10;
    }
        System.out.println(count);
}
    }
