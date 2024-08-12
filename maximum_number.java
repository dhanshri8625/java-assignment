import java.util.*;
public class maximum_number {
    public static void main(String[]args){
        int n1 , n2 ;
        Scanner S = new Scanner(System.in);
        System.out.print("\n enter first number:");
        n1 = S.nextInt();
        System.out.print("\n enter second number:");
        n2 = S.nextInt();
        if(n1 == n2){
            System.out.println("both number are equal");}
        else if(n1 > n2){
                System.out.println("maximum number is:"+n1);
            }
            else{
                System.out.println("maximum number is:"+n2);
            }

        }
    }
    

