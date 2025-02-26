import java.util.Scanner;

public class Greatestofthree
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to checking the greatest number between three: ");
        System.out.print("Enter the first number:");
        int num1= input.nextInt();
        System.out.print("Enter the Second number:");
        int num2= input.nextInt();
        System.out.print("Enter the third number:");
        int num3= input.nextInt();
        if(num1>=num2 && num1>=num3)
        {
            System.out.println("First number is greatest: "  +num1);
        }
        else if(num2>=num1 && num2>num3)
        {
            System.out.println("Second number is greatest: "  +num2  );
        }
        else if(num3>=num1 && num3>num2)
        {
            System.out.println("Third number is greatest: "  +num3);
        }
        else
        {
            System.out.println("All given three number are equal");
        }
    }
}
