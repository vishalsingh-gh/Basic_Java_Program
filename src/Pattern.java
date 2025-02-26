import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int rows = input.nextInt();
      //  pattern(rows);
        pattern2(rows);
       // pattern3(rows);
    }

    public static void pattern2(int maxRows){
        int rows = maxRows;
        while(rows > 0){
            int i = 0;
            while (i < rows){
                System.out.print("* ");
                i++;
            }

            System.out.println();
            rows--;
        }
    }

    public static void pattern3(int maxRows){
        int rows = maxRows;
        while(rows > 0){
            int j = 0;
            while(j < rows - 1){
                System.out.print("  ");
                j++;
            }
            int i = 0;
            while (i <= (maxRows - rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }



    public static void pattern(int maxRows){
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}


