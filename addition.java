import java.util.Scanner;

public class addition {
    
    public static void main(String[]args){
        int n1, n2 ,add = 0;
        Scanner S = new Scanner(System.in);
        System.out.print("\n enter first number:");
        n1 = S.nextInt();
        System.out.print("\n enter second number:");
        n2 = S.nextInt();
        add = n1 + n2;
        System.out.println("addition is:"+add );
    }
    
}
