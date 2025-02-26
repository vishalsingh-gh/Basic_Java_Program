import java.util.Scanner;

public class Numbertable
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number table");
        System.out.print("Enter the number for table:  ");
        int num= input.nextInt();
        numbertable(num);
    }

    public static void numbertable(int num) {
    int i=1;
    while(i<=10)
    {
        System.out.println(num + " X " + i + " = " + (num*i));
        i++;
    }
    }

    }
