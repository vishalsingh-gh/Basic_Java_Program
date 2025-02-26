import java.util.Scanner;

public class Bitwiseoperator
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to check bitwise operator: ");
        System.out.print("Enter the first number: ");
        int num1= input.nextInt();
        System.out.print("Enter the second number: ");
        int num2= input.nextInt();

        int result1=num1&num2;
        System.out.println("The result of and operator is: "+result1);
        int result2=num1|num2;
        System.out.println("The result of or operator is: "+result2);
        int result3=num1^num2;
        System.out.println("The result of xor operator is: "+result3);
        int result4=~num1;
        System.out.println("The result of not operator is: "+result4);
        int result5=num1<<4;
        System.out.println("The result of left shift operator is: "+result5);
        int result6=4>>num2;
        System.out.println("The result of right shift operator is: "+result6);

    }
}





























