import java.util.Scanner;

public class Productfloating
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the Num1: ");
        float Num1= input.nextFloat();
        System.out.print("Enter the Num2: ");
        float Num2= input.nextFloat();
        float product=Num1*Num2;
        System.out.println("Product of floating Number is : "  +product);
    }
}
