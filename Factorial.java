
import java.util.Scanner;
public class FactorialTest
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= in.nextInt();
        System.out.println("The factorial of "+n+" is "+factorial(n));
    }
    
    private static long factorial(int n)
    {
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
}
