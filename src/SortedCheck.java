public class SortedCheck {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        boolean Order1 = increasing(numArr);
        boolean Order2 = decreasing(numArr);
        if(Order1 || Order2){
            System.out.println("Your Array is Sorted ");
        }
        else {
            System.out.println("Your Array is not Sorted");
        }
    }

    public static boolean increasing(int[] numArr){
        int i = 1;
        while (i < numArr.length){
            if(numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean decreasing(int[] numArr){
        int i = 1;
        while (i < numArr.length ){
            if(numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
