import java.util.Scanner;

public class Parimeterrectangle
{
    public static void main(String[] args)
    {
        Scanner input=  new Scanner(System.in);
        System.out.println("Enter the All 4 side of rectangle :");
        int first= input.nextInt();
        int second= input.nextInt();
        int third= input.nextInt();
        int fourth= input.nextInt();
        int perimeter=first+second+third+fourth;
        System.out.println("The perimeter of rectangle is : "  +perimeter);
    }
}
