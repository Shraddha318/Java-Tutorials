import java.util.Scanner;//* for all
public class Calculator {
    int add(int a,int b)
    {
        return a+b;
    }
    int mul(int a,int b)
    {
        return a*b;
    }
    int div(int a,int b)
    {
        return a/b;
    }
    int sub(int a,int b)
    {
        return a-b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operator");
        while(true){
        char op=sc.next().trim().charAt(0);
        if(op=='+'|| op=='-'||op=='*'|| op=='/'|| op=='%') {
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            Calculator cc = new Calculator();
            if (op == '+') {
                System.out.println("The sum is:" + cc.add(a, b));
            }
            if (op == '-') {
                System.out.println("The sub is:" + cc.sub(a, b));
            }
            if (op == '/') {
                System.out.println("The division between 4 and 2 is: " + cc.div(4, 2));
            }
            if (op == '*') {
                System.out.println("The multiplication between 4 and 5 is:" + cc.mul(4, 5));
            }
        }
        else if(op=='x'||op=='X'){
        break;
        }
        else{
                System.out.println("Invalid Operator");
            }
        }
    }
}
//java.util package contains all the input and output stream
//Scanner is a class in java which is used for taking the input
//System is a class and in is a object for input stream class.
//nextInt for taking input in integer
//nextLine for strings
//nextByte for byte and nextFloat for float
//The value is known as literal
// The name of class ,functions etc are known as identifiers