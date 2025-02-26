public class Function
{
   /* public static void main(String[] args)
    {
        System.out.println("Function start");
       marks();
        System.out.println("Function complete");
    }
    public static void marks()
    {
        System.out.println("I achieve very good marks in exam");
    }*/
   public static void main(String[] args)
   {
     //  pattern1();
     //  pattern2();
     //  pattern3();
      pattern4();
   }
   public static void pattern1()
   {
       System.out.println("* * * * *");
       System.out.println("* * * *");
       System.out.println("* * *");
       System.out.println("* *");
       System.out.println("*");
       System.out.println("\n");
   }
    public static void pattern2()
    {
        System.out.println("*\n* *\n* * *\n* * * *\n* * * * *" );
        System.out.println("* * * * *\n* * * *\n* * *\n* *\n* ");
    }
    public static void pattern3()
    {
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
        System.out.println("\n");

    }
    public static void pattern4() {
       /* System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");*/
        int rows=0;
        while (rows < 5)
        {
            System.out.print("*");
            int i=0;
            while(i<rows)
            {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
