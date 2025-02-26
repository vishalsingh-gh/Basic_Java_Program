import java.util.Scanner;

public class Areaoftriangle
{
    public static void main(String[] args)
    {
        Scanner input=  new Scanner(System.in);
        System.out.print("Enter the base of triangle : ");
        int base= input.nextInt();
        System.out.print("Enter the height of triangle : ");
        int height=input.nextInt();
        int Area= (int)(0.5*base*height);
        System.out.print("Area of triangle are : " +Area);
    }
}
