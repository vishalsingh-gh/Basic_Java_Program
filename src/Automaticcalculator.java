import java.util.Scanner;

public class Automaticcalculator
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float num1=input.nextFloat();
        System.out.print("Enter the Second number: ");
        float num2=input.nextFloat();
        System.out.print("Enter the operator(+,-,*,/): ");
        char operator = input.next().charAt(0);
        float result;

        switch (operator)
        {
            case '+':
                result= num1+num2;
                System.out.print("The sum is:"  +result);
                break;
            case '-':
                result= num1-num2;
                System.out.print("The subtraction is:"  +result);
                break;
            case '*':
                result= num1*num2;
                System.out.print("The multiplication is:"  +result);
                break;
            case '/':
                if(num2==0)
                {
                    System.out.print("Cannot divide by 0");
                }
                else
                {
                    result=num1/num2;
                    System.out.print("The division is: " +result);
                }
                break;
            default:
                System.out.print("Invalid operator");
        }
    }
}
