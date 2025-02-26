import java.util.Scanner;

public class Fartocelcius
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the fahrenheit teperature :  ");
        float fahrenheit= input.nextFloat();
        float celcius=((fahrenheit-32)*5/9);
        System.out.print("The temperature in Celcius is : " +celcius);
    }
}
