import java.util.Scanner;

public class licencse
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to licencing company");
        System.out.println("Enter you age: ");
        int age=input.nextInt();
        if(age>=18)
        {
            System.out.println("Eligible for licence");
        }
        else{
            System.out.println("beta cycle chalao");
        }
    }
}
