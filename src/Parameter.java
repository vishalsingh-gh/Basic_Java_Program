public class Parameter
{
    public static void main(String[] args) {
        System.out.println("Sum of these two are: "+Sumtwonumber (521,1000));
        System.out.println("Sum of these two are: "+Sumtwonumber (51,-56));
        System.out.println("Sum of these two are: "+Sumtwonumber (21,57));
        System.out.println("Sum of these two are: "+Sumtwonumber (131,-969));
        System.out.println("Sum of these two are: "+Sumtwonumber (-5641,-1000));
    }

    public static int Sumtwonumber (int first, int second) {
        System.out.println("The first number is: " +first );
        System.out.println("The second number is: " +second);
        int sum= first+second;

        return sum;
    }
}
