import java.util.Scanner;

public class sum
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1=input.nextInt();
        System.out.print("Enter the num2: ");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("sum of the number are:  "  + sum);
    }
}
