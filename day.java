import java.util.*;
public class day {
    public static void main(String[]args){
        int day = 0;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a day number:");
        day = S.nextInt();
        if(day < 0 || day > 7){
            System.out.println("invalid");

        }
        else if(day == 1){
            System.out.println("Monday");
        }
        else if(day == 2){
            System.out.println("Tuesday");
        }
        else if(day == 3){
            System.out.println("Wedensday");
        }
        else if(day == 4){
            System.out.println("Thursday");
        }
        else if(day == 5){
            System.out.println("Friday");
        }
        else if(day == 6){
            System.out.println("Saturday");
        }
        else if(day == 7){
            System.out.println("Sunday");
        }

    }
    
}
