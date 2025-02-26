 import java.util.Scanner;

public class Oddsum
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to be sum:  ");
        int num= input.nextInt();
        int sum = oddsum(num);
        System.out.println("Odd sum till " + num + " is: " +sum);
    }
    public static int oddsum(int num) {

        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum = sum + i;
            i = i + 2;
        }
        return sum;
    }
}
