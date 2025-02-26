import java.util.Scanner;

public class Simpleinterest
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the principal amount Rs :  ");
        int principal=input.nextInt();
        System.out.print("Enter the rate on amount %:  ");
        float rate=input.nextFloat();
        System.out.print("Enter the time for amount:  ");
        float time=input.nextFloat();
       float simpleinterest= ((principal*rate*time)/100);
        System.out.print(" The simple interest is: " +simpleinterest);
    }
}
