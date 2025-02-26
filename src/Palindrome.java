import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be check for palindrome: ");
        int num = input.nextInt();
        boolean palindrome = checkpalindrome(num);
        if(palindrome){
            System.out.println("Your Number is palindrome");
        }
        else {
            System.out.println("Your Number is not palindrome");
        }

    }

    public static boolean checkpalindrome(int num){
    int reverse = reverse(num);
        return num == reverse;
    }

    public static int reverse(int num){
        int newNum = 0;
        while (num > 0){
          int digit = num % 10;
          newNum = newNum * 10 + digit;
          num = num/10;
        }
        return newNum;
    }
}
