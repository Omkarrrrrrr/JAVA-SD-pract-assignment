import java.util.Scanner;

public class Multithreading1 {
    public static void main(String[] args) {
        System.out.println("Calculation task started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number");
        int num2 = sc.nextInt();

        int result = num1+num2;
        System.out.println(result);

        System.out.println("Calculation task ended");

        System.out.println("****************************************************");

        System.out.println("Printing * Task Started");

        for(int i=0;i<4;i++)
        {
            System.out.println("*");
        }

        System.out.println("Printing * Task Ended");

        System.out.println("****************************************************");

        System.out.println("Displaying important message task");
        for(int i=0;i<3;i++)
        {
        System.out.println("Focus is important to master skills");
        }

        System.out.println("Displaying import message task ended");

        System.out.println("****************************************************");
    }
    
}

/*Need for Multithreading
In the provided program, each task runs one after another in a sequential manner. While this is simple and works well for basic tasks, there are several reasons why you might need multithreading:

Concurrency: If each task can run independently, using threads allows them to run concurrently rather than sequentially. This can improve the efficiency of the program, especially if tasks are I/O bound or involve waiting (e.g., user input).

Responsiveness: In applications with a user interface, using multiple threads ensures that the UI remains responsive. For example, one thread can handle user input while another performs background calculations or I/O operations.

Utilizing Multiple Processors: On systems with multiple CPU cores, multithreading can lead to better utilization of system resources. Each thread can run on a different core, potentially improving performance.

Parallelism: For tasks that can be parallelized (e.g., processing elements of a large dataset independently), multithreading can significantly speed up the processing time.*/