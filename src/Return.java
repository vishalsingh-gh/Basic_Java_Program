import java.util.Scanner;

public class Return
{
    public static void main(String[] args)
    {
    greet();
    int num1 = readnumber();
    int num2 = readnumber();
    int Sum = num1+num2;
        System.out.println("The sum of the number are: " +Sum);
    }

    public static void greet (){
    System.out.println("Welcome to my calculator:");
    }
        public static int readnumber()
        {
            Scanner input= new Scanner(System.in);
            System.out.print("Enter the number: ");
            int number = input.nextInt();
            return number;
        }
    }
