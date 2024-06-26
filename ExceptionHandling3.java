import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        
        int num=0;
        Scanner sc=new Scanner(System.in);   //here we create resource
        // try with resource
        try
        {
            num =sc.nextInt();             //here we used resource
                              //here we will close resource//if there is no  exception in above line...it will not used
        }
        //finally block is executed regardless of whether an exception is thrown in the try block or not.
        finally      
        {
            sc.close(); //freeing up any system resources associated with it.
            System.out.println("Resource closed");
        }
        System.out.println(num);   //scanner class will take input from user if it gives error
    }
}
