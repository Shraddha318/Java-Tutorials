import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side: ");
        int side = sc.nextInt();
        pattern1(side);
        pattern2(side);
    }
    static void pattern1(int n){
        for(int i=1;i<=n*2;i++){
            int c=i>n?2*n-i:i;
            for(int j=1;j<=c;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=1;i<=n*2-1;i++){
            int c=i>n?2*n-i:i;
            int nspaces=n-c;
            for(int k=1;k<=nspaces;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=c;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}

