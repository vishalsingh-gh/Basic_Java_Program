import java.util.Scanner;

public class Compoundinterest
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the principal amount Rs : ");
        int principal= input.nextInt();
        System.out.print("Enter the rate of interest % : ");
        float rate=input.nextFloat();
        System.out.print("Enter the time for compound interest : ");
        float time= input.nextFloat();
    double compoundinterest= principal* Math.pow((1+rate/100),time);
        System.out.print("The Compound interest on the Amount is :  "  + compoundinterest);


    }
}
