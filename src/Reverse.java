import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("The reverse of the number is: "+reverse);
    }
    public static int reverse (int num){
    int newNum = 0;
    while (num > 0){
        int digit = num % 10;
        newNum = newNum * 10 + digit;
        num /= 10;
    }
    return newNum;
    }
}
