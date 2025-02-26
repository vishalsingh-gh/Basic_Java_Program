import java.util.Scanner;

public class Hcf2num
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int hcf = hcf(num1,num2);
        System.out.println("The HCF of these two are: " +hcf);
    }
    public static int hcf(int num1,int num2){
       int hcf = 1;
       int i = 2;
       int least = least(num1 , num2);
        while (i <= least){
            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
                i++;
        }
        return  hcf;
    }
    public  static int least(int num1 , int num2){
        if(num1 < num2) {
            return num1;
        }
            else{
                return num2;
            }



    }
}
