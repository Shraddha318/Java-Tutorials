public class Shadowing {
    static int x=90;//this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x);
        int x=30;//class variable,all operation swill be performed on this
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
/*Shadowing in java is basically a practice of using two variables with the same
name within the scope that overlaps
 */