import java.util.Scanner;

public class Leapyearcheck
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to check the leap year calculator");
        System.out.print("Enter the year for checking leap year: ");
        int year=input.nextInt();
        if(year%400==0 ||(year%100!=0 && year%4==0))
        {
            System.out.print("The enter year is leap year " +year);
        }
        else
        {
            System.out.print("The enter year is not leap year " +year);
        }
    }
}
