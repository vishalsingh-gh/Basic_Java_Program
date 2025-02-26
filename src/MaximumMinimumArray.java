public class MaximumMinimumArray {
    public static void main(String[] args) {
        int [] numarr = ArrayUtility.inputArray();
        int function1 = maximum(numarr);
        System.out.println("The maximum number is: " +function1);
        int function2 = minimum(numarr);
        System.out.println("The minimum number is: " + function2);
    }

    public static int maximum(int [] numarr){
        if(numarr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = numarr[0];
        int i = 1;
        while (i < numarr.length){
            if(max < numarr[i]){
                max = numarr[i];
            }
            i++;
        }
     return max;
    }

    public static int minimum(int [] numarr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numarr.length){
            if (min > numarr[i]){
                min = numarr[i];
            }
            i++;
        }
     return min;
    }
}
