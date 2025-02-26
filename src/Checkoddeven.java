import java.util.Scanner;

public class Checkoddeven
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Check the number is odd or even");
        System.out.print("Enter the number to be checked:  ");
        int number= input.nextInt();
        if(number%2==0)
        {
            System.out.println("Given number is even");
        }
        else
        {
            System.out.println("Given number is odd");
        }

    }
}
