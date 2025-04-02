import java.util.Scanner;

public class sum
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1=input.nextInt();
        System.out.print("Enter the num2: ");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("sum of the number are:  "  + sum);
    }
}

// QUESTION HAS TO BE CARRY OUT AND FIND THE LOGIC





import java.util.Scanner;

public class SumNumbersInString {
    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with numbers: ");
        String input = scanner.nextLine(); // Read user input
        scanner.close(); // Close scanner

        int sum = sumNumbersInString(input);
        System.out.println("Sum of numbers in string: " + sum);
    }

    public static int sumNumbersInString(String str) {
        int sum = 0;
        String temp = ""; // Temporary string to hold digits

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                temp += ch; // Append digit to temp string
            } else {
                // If temp is not empty, convert it to a number and add to sum
                if (!temp.isEmpty()) {
                    sum += Integer.parseInt(temp);
                    temp = ""; // Reset temp
                }
            }
        }

        // Add any remaining number at the end of the string
        if (!temp.isEmpty()) {
            sum += Integer.parseInt(temp);
        }

        return sum;
    }
}


