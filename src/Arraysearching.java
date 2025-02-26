import java.util.Scanner;

public class Arraysearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myarr = {23,4,87,95,71,69,55,43,37,16};
        System.out.print("Enter the number for Search: ");
        int num = input.nextInt();
        boolean isfound = isfound(myarr,num);
        if (isfound){
            System.out.println("Number found");
        }
        else {
            System.out.println("Number not found");
        }
    }

    public static boolean isfound(int[] myarr , int num){
        int index = 0;
        while(index < myarr.length){
            if(myarr[index] == num){
                return true;
            }
           index++;
        }
        return false;
    }
}



