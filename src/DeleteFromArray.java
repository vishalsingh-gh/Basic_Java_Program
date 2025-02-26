import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numArr = ArrayUtility.inputArray();
        System.out.print("Enter the item for Deletion: ");
        int deletion = input.nextInt();
        int[] Function = deleteNum(numArr,deletion);
        System.out.println("Here is your Modified Sequence: ");
        ArrayUtility.DisplayArray(Function);
    }

    public static int[] deleteNum(int[] numArr , int deletion){
    int occ = Occurrencesarray.noOfOccurrence(numArr,deletion);
    if (occ == 0){
        return numArr;
    }
    int newSize = numArr.length - occ;
    int[] newArr = new int[newSize];

    int i = 0, j = 0;
    while (i < numArr.length){
        if (numArr[i] != deletion ){
            newArr[j] = numArr[i];
            j++;
        }
        i++;
    }
    return newArr;
    }
}
