//This is all about 'throw' keyword
class MyException extends Exception      // MyException is a custom exception class that extends the Exception class.
{
        public MyException(){            // Default constructor

        }
        public MyException(String msg)  // Constructor that accepts a message
        {
            super(msg);
        }
}

public class ExceptionHandling5{
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = -2;
        try{
            if (num2 <0){
                throw new MyException("Negative number");
            }
            else{
                int result = num1 / num2;
                System.out.println(result);
            }
        }
        catch(Exception e){
            System.out.println("Enter a valid number");

        }
        
    }
}