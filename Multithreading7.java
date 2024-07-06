class Demo1 implements Runnable
{
    public void run()
    {
        System.out.println("child thread excuting");
        try{
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
        System.out.println("child thread task completed");
    }
}
public class Multithreading7 {
    public static void main(String[] args) {
        System.out.println("Main thread started");

        Demo1 d = new Demo1();
        Thread t1 = new Thread(d);
        t1.start();  //starts the new thread, which executes the run method of Demo1
    }
    
}
