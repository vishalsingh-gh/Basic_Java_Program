import java.util.Scanner;

public class Logical
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to ticket discount page: ");
        System.out.print("Enter your age: ");
        int age=input.nextInt();
        System.out.print("Are you a female? (true/false) ");
        boolean isfemale=input.nextBoolean();
        if(age<5)
        {
            System.out.println("You get 80% discount on ticket");
        }
        else if(isfemale)
        {
            System.out.println("You got 60% discount on ticket");
        }
       else if(age>60 && !isfemale)
        {
            System.out.println("You get no discount on ticket");
        }
    }

}
