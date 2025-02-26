import java.util.Scanner;

public class Checkpnz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checking");
        System.out.print("Enter the number to be checked: ");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("Enter number is positive");
        } else if (number < 0) {
            System.out.println("Enter number is negative");
        }
        else if(number==0)
        {
            System.out.println("Enter number is zero");
        }
    }
}
