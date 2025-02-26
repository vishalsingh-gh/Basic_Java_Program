import java.util.Scanner;

public class ArrayUtility {
    public static int [] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int size = input.nextInt();
        int[] num = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter the element no " + (i + 1) + ": ");
            num[i] = input.nextInt();
            i++;
        }
        return num;
    }
    // HERE PROGRAM ARE MAKE FOR DISPLAY AN ARRAY::
    public static void DisplayArray(int[] numArr){
        int i = 0;
        while (i < numArr.length){
            System.out.print(numArr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
