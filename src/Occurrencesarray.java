import java.util.Scanner;

public class Occurrencesarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numarray = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to search: ");
        int num = input.nextInt();
        int function = noOfOccurrence(numarray,num);
        System.out.println("your number is found " + function + " times in the array");
    }

    public static int noOfOccurrence(int [] numarray , int num){
        int occ = 0;
        int i = 0;
        while(i <numarray.length){
            if (numarray[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
