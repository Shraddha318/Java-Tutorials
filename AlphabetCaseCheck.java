import java.util.*;
public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  String s= sc.nextLine();
        System.out.print("Enter the character: ");
        char ch=sc.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
       // if(ch>='A' && ch<='Z'){
         else{
            System.out.println("Uppercase");
        }

    }
}
