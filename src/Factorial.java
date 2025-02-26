import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for Factorial: ");
        int num = input.nextInt();
        long factorial = factorial(num);
        System.out.println("Factorial is: " + factorial);
    }
    public static long factorial (int num) {
        if (num < 2)
        {
            return 1;
        }
        long factorial =1;
        int i = 2;
        while(i<=num)
        {
            factorial = factorial * i;
            i++;
        }
        return factorial;
    }
}
