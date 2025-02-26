import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the Num1 :");
        int Num1 = input.nextInt();
        System.out.print("enter the Num2: ");
        int Num2 = input.nextInt();

        int sum= Num1+Num2;
        int sub= Num1-Num2;
        int mult= Num1*Num2;
        int div= Num1/Num2;
        int mod= Num1%Num2;

        System.out.println("Addition : " +sum);
        System.out.println("Subtraction : " +sub);
        System.out.println("Multiplication : " +mul);
        System.out.println("Division : " +div);
        System.out.println("Modulus : " +mod);

    }
}
