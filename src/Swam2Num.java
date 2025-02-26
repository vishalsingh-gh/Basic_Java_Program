import java.util.Scanner;

public class Swam2Num
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number for swapping");
        System.out.print("enter the number A:  ");
        int a = input.nextInt();
        System.out.print("enter the number B:  ");
        int b = input.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("Swapping done..");
        System.out.println("Value of A is  " +a);
        System.out.println("Value of B is  " +b);
    }
}


