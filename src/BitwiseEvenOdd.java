import java.util.Scanner;

public class BitwiseEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Checking Even Odd by Bitwise:  ");
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        if((num & 1) == 0){
            System.out.println("Given Number is Even");
        }
        else{
            System.out.println("Given Number is Odd");
        }
    }
}
