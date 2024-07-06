// Deadlock situation
import java.util.concurrent.ExecutionException;

import javax.sound.midi.Sequencer.SyncMode;

class Library implements  Runnable{

    String res1 = new String("JAVA");
    String res2 = new String("SQL");
    String res3 = new String("DSA");

    public void run(){
        String name = Thread.currentThread().getName();
        if(name.equals("Student 1"))
        {
            try{
                Thread.sleep(3000);
                synchronized(res1)
                {
                    System.out.println("Student 1 has acquired "+ res1);
                    Thread.sleep(3000);
                    synchronized(res2)
                    {
                        System.out.println("student 1 has acquired "+res2);
                        Thread.sleep(3000);
                        synchronized(res3)
                        {
                            System.out.println("Stuent 1 has acquired "+res3);
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("some problem");
            }
        }
        else{
            try{
                Thread.sleep(3000);
                synchronized(res3)
                {
                    System.out.println("Student 2 has acquired "+ res1);
                    Thread.sleep(3000);
                    synchronized(res2)
                    {
                        System.out.println("student 2 has acquired "+res2);
                        Thread.sleep(3000);
                        synchronized(res1)
                        {
                            System.out.println("Stuent 2 has acquired "+res3);
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("some problem");
            }

        }

    }
}
public class Multithreading11 {
    public static void main(String[] args) {
        Library lib= new Library();

        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("Student 1");
        t2.setName("Student 2");

        t1.start();
        t2.start();
    }
    
}
