import java.util.*;
public class switch_day{
    
    public static void main(String[]args){
        int day = 0;
        String dayString;
        Scanner S = new Scanner(System.in);
        System.out.print("\n enter day number:");
        day = S.nextInt();
        switch(day){
            case 1:
                   dayString =  "Monday";
                   break;
            case 2:
                   dayString = "Tuesday";
                   break;
            case 3:
                   dayString = "wednesday";
                   break;
            case 4:
                   dayString = "Thursday" ;
                   break;
            case 5:                           
                   dayString = "Friday";
                   break;
            case 6:
                   dayString = "saturday" ;
                   break;
            case 7:
                   dayString = "Sunday";
                   break;
            default:
                   dayString = "invalid";
                }
                   System.out.println(dayString);
                   
        }


        }

        


    


    
