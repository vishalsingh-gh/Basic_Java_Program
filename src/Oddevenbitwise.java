import java.util.Scanner;

public class Oddevenbitwise
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int num= input.nextInt();
        if((num&1)==1)
        {
            System.out.println("Given number is odd: "+num);
        }
        else
        {
            System.out.println("Given number is even: "+num);
        }
    }
}
