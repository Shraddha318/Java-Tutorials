import java.util.*;
public class Temperature {
    int cel(int f){
        return (f-32)*5/9;
    }
    int fah(int c){
        return (9/5*c)+32;
    }
    int kal(int c){
        return c-273;
    }
    public static void main(String[] args) {
        Temperature tt=new Temperature();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter for temperature conversion in 1)Celsius 2)Fahrenheit 3)Kalvin ");
        int a=sc.nextInt();
        switch(a){
        case 1:
        System.out.println("Enter temperature in fahrenheit");
        int c=sc.nextInt();
        System.out.println("Temperature in celsius is "+tt.cel(c)+"");
        break;
        case 2:
            System.out.println("Enter temperature in celsius");
            int f=sc.nextInt();
            System.out.println("Temperature in fahrenheit "+ tt.fah(f));
            break;
            case 3:
                System.out.println("Enter temperature in celsius");
                int d= sc.nextInt();
                System.out.println("Temperature in kalvin "+tt.kal(d));
    }
}
}
