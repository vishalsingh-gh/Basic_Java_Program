import java.util.Scanner;

public class Agedetector
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the age to be detect: ");
        int age= input.nextInt();
        if(age>=60)
        {
            System.out.println("You are a senior");
        } else if (age>=20)
        {
            System.out.println("You are an adult");
        } else if (age>=13)
        {
            System.out.println("You are a teenager");
        }
        else
        {
            System.out.println("You are a child");
        }
    }
}
