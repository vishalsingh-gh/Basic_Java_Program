import java.util.Scanner;
class Main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
           System.out.print("Enter the value of A: ");
        int a = input.nextInt();
         System.out.print("Enter the value of B: ");
        int b = input.nextInt();
        
     int sum =   sum2num(a,b);
     System.out.println("Sum of the Number: "+ sum);
     
     int SumDigit = SumofDigit(sum);
      System.out.println("Sum of the Digit : "+ SumDigit);
    }
    
    public static int sum2num(int a , int b){
        int sum = a+b;
        return sum;
    }
    
    public static int SumofDigit(int sum){
    int DigitSum = 0;
      while(sum > 0){
         int newnum = sum % 10;
         DigitSum = newnum+DigitSum; 
          sum = sum/10;
      }
     return DigitSum ;   
    }
}
