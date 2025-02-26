import java.util.Scanner;

public class Sumofdigit {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum of digit: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of number:");
        int num = input.nextInt();
        int Sumofdigit = Sumofdigit(num);
        System.out.println("The Sum of digit of these number are: " + Sumofdigit);
    }

    public static int Sumofdigit(int num){
        int sum = 0;
        while (num > 0){
            sum = sum + num % 10;
            num = num /10;
        }
        return sum;
    }


    }
