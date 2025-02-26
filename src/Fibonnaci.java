import java.util.Scanner;

public class Fibonnaci
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Enter the number in Fibonnaci sequence: ");
        int number = input.nextInt();
        System.out.print("Here is the fibonnaci series");
        printfibonacci(number);
    }
    public static void printfibonacci(int number){
        if(number < 0) return;
        System.out.print("0 ");
        if(number == 0) return;
        System.out.print("1 ");
        int first = 0 , second = 1;
        while (first + second <= number){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
