import java.util.Scanner;

public class Armstrong {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        boolean isArmstrong = isArmstrong(number);
        if (isArmstrong){
            System.out.println("number is Armstrong number");
        }
        else{
            System.out.println("number is not Armstrong number");
        }
    }

    public static boolean isArmstrong(int number){
        int noofditgit = noofdigit(number);
        int numberCopy = number;
        int finalNumber = 0;
        while (number > 0){
            int lastDigit = number % 10;
            number = number/10;
            finalNumber = finalNumber + power(lastDigit , noofditgit);
        }

        return finalNumber == numberCopy;
    }

    public static int noofdigit(int number){
        int digit = 0;
        while (number > 0){
            digit++;
            number = number/10;
        }
        return digit;
    }

    public static int power(int number1 , int number2){
       int result = 1;
       int i = 0;
       while (i < number2){
           result = result*number1;
           i++;
       }
       return  result;
    }
}
