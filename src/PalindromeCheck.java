public class PalindromeCheck {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        boolean ispalin = ispalindrome(numArr);
        if (ispalin) {
            System.out.println("Enter array is Palindrome");
        } else {
            System.out.println("Enter array is not Palindrome ");
        }
    }

    public static boolean ispalindrome(int[] numArr){
        int i = 0;
        while(i < numArr.length / 2){
            if (numArr[i] != numArr[numArr.length -1 - i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
