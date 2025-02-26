import java.util.Scanner;

public class Primenum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("THE PRIME NUMBER CHECKERS");
        System.out.print("Enter the number to be checked: ");
        int num = input.nextInt();
        boolean isprime = isprime(num);
        if (isprime){
            System.out.println("Your number is prime: ");
        }
        else {
            System.out.println("Your number is not prime: ");
        }
    }
    public static boolean isprime( int num){
    int i = 2;
    while (i < num ) {
        if (num % i == 0) {
            return false;
        }
        i++;
    }
       return true;
    }
}
