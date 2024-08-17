import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day :");
        int day=sc.nextInt();
        int weekend= sc.nextInt();
        switch (day){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> {
                System.out.println("Saturday");
                switch (weekend) {
                    case 1->System.out.println("Weekend Saturday");
                    default-> System.out.println("Wrong value entered");
                }
            }
            case 7->
            {System.out.println("Saturday");
            switch(weekend) {
                case 2: System.out.println("Weekend Sunday");


            }

            }


            default-> System.out.println("Wrong value entered");
            //case 1:System.out.println("Monday");
            //break;
           // means
            // case 1-> System.out.println("Monday");
            //case 1,2,3,4,5->System.out.println("Days"); is case without break in between
        }

    }
}
