import java.util.function.DoubleToIntFunction;

public class ExceptionHandling1{
    public static void main(String[] args) {

        // normal statement
         int num1 = 6;
         int num2 = 0;
         int result =0;

         //critical statement
        try
        {
         result =num1/num2;
         System.out.println("in try block");

        }
        catch(Exception obj)    //It prints "Something went wrong" followed by the exception object (obj), which includes information about the exception like its type and message.
        {
            System.out.println("Something went wrong"+ obj);
        }

        System.out.println(result);
        System.out.println("Bye");
    }
}