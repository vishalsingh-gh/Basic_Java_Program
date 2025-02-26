import java.util.Scanner;

public class Grading
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        float percentage= input.nextFloat();
        if(percentage>=90)
        {
            System.out.println("You got grade A");
        }
        else if (percentage>=75)
        {
            System.out.println("You got grade B");
        }
        else if(percentage>=60)
        {
            System.out.println("You got grade C");
        }
        else if (percentage>=30)
        {
            System.out.println("You got grade D");
        }
        else
        {
            System.out.println("You get fail");
        }
    }
}
