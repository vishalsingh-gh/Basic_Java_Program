import java.util.Scanner;

public class Lcm2num
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = input.nextInt();
        int lcm = lcm(num1,num2);
        System.out.print("The lcm of these two number are: "+lcm);
    }
    public static int lcm(int num1, int num2){
        int i=1;
        while(i <= num2)
        {
            int factor = num1 * i;
            if(factor % num2 == 0)
            {
                return factor;
            }
            i++;
        }
        return  0;
    }
}
