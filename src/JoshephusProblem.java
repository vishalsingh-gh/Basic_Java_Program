import java.util.Scanner;

public class JoshephusProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
      int n = input.nextInt();
        System.out.println("Enter the value of k: ");
      int k = input.nextInt();
        int survivor = josephus(n, k)+1;
        System.out.println("The Survivor is person at position: " + survivor);
    }


    public  static int josephus(int n, int k){
        if(n==1){
            return 0;
        }
        else {
            return(josephus(n-1,k)+k)%n;
        }
    }
}
