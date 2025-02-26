public class ArraySumAverage {
    public static void main(String[] args){
      int[] numArray  = ArrayUtility.inputArray();
      long sum = sum(numArray);
      int average = average(numArray);
        System.out.println("The sum of the element is :" +sum);
        System.out.print("The average of the element is :" +average);
    }

    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i < numArray.length){
        sum = sum + numArray[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] numArray){
        int aver = 0;
       long sum = sum(numArray);
        aver = (int) (sum / numArray.length);
        return aver;
    }

}