// try with multiple catches block


public class ExceptionHandling2
{
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;
        int result = 0;
        int values[]={4,3,5,7};
        String name="omkar";

        try
        {
            result =num1/num2;            // May throw ArithmeticException
            System.out.println(values[0]);  // Will not throw exception
            System.out.println(name.length());  // May throw NullPointerException
        }
        catch(ArithmeticException e)
        {
            System.out.println("You can not divide the no. by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limits");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong..");
        }

        System.out.println(result);
        System.out.println("Bye");
    }
}