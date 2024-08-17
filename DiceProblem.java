import java.util.*;
public class DiceProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side which you want to find opposite");
        int n= sc.nextInt();
        if(n<=7){
        System.out.println(sides(n));}
        else{
            System.out.println("Invalid");
        }
    }
    static int sides(int n){
        return 7-n;
    }
}
