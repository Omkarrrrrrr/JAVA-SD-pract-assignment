
class MyThread extends Thread{             // inherits all the props and behaviours of thread which are invisible but they are present by default in threads as like thread itself

    public void run()
    {
        System.out.println("Child Thread");
    }
}


public class Multithreading3
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread"); 

        MyThread t=new MyThread();
        t.start();                        // here we cant call run method directly.  // start method internally calls run method and allocates new thread in java

    }
    
}


/*The MyThread class defines the behavior of a new thread by overriding the run method.
The LaunchMulti3 class contains the main method, which is the entry point of the application.
The main thread prints "Main Thread" and then starts a new MyThread, which prints "Child Thread" in a separate thread. */