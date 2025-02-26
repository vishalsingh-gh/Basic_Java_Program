import java.util.Scanner;

public class BitwiseSwitch {

        public static void main(String[] args) {

            System.out.println("Welcome to bitwise opeartor: ");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the first no: ");
            int num1 = input.nextInt();
            System.out.print("Enter the Second no: ");
            int num2 = input.nextInt();


            System.out.println("Enter the operator: ");
            System.out.println("1. AND");
            System.out.println("2. OR");
            System.out.println("3. NOT(ONLY ON FIRST NUMBER)");
            System.out.println("4. XOR");
            System.out.println("5. LEFTSHIFT(ONLY ON FIRST NUMBER)");
            System.out.println("6. RIGHTSHIFT(ONLY ON FIRST NUMBER)");
            System.out.println("Enter the option above for calculation: ");
            int choice = input.nextInt();


            int result;
            switch (choice){
                case 1:
                    result = num1 & num2;
                    System.out.println("The AND operation on this two number are: " +result);
                    break;

                case 2:
                    result = num1 | num2;
                    System.out.println("The OR operation on this two number are: " +result);
                    break;
                case 3:
                    result = ~num1;
                    System.out.println("The NOT operation firstnumber are: " +result);
                    break;
                case 4:
                    result = num1 ^ num2;
                    System.out.println("The XOR operation on this two number are: " +result);
                    break;
                case 5:
                    result = num1 << 1;
                    System.out.println("The LESTSHIFT operation firstnumber are: " +result);
                    break;
                case 6:
                    result = num1 >> 1;
                    System.out.println("The RIGHTSHIFT operation firstnumber are: " +result);
                    break;
                default:
                    System.out.println("Invald operator");
            }


        }
    }
