public class ReverseArray {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
          reverse(numArr);
        System.out.println("Your Reverse Array is: ");
        ArrayUtility.DisplayArray(numArr);
    }

    public static void reverse(int[] array ){
        int i = 0;
        while (i < array.length / 2){
            int swap = array[i];
            array[i] = array[(array.length - 1) - i] ;
            array[(array.length - 1) - i] = swap;
            i++;
        }
    }
}
