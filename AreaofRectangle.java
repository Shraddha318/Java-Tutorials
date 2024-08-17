import java.util.*;
public class AreaofRectangle {
    int l;
    int b;
    AreaofRectangle(int le,int bd){
        this.l=le;
        this.b=bd;
    }
    void area(int l,int b){
        System.out.println(l*b);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int l= sc.nextInt();
        int b= sc.nextInt();
        AreaofRectangle area=new AreaofRectangle(l,b);
        area.area(l,b);
    }
}
