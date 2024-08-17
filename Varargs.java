import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8,9);
        multi(4,5,"aa","nn");
    }
    static void multi(int a,int b,String...v){//Variable length args should be at last
        System.out.println(a+b+Arrays.toString(v));
    }
    static void fun(int ...v){//This takes iit as arrays of integers
        System.out.println(Arrays.toString(v));

    }
}
//This method is used when we do not know the number of arguments we should use