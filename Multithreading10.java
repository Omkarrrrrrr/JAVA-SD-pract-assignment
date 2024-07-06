import java.util.concurrent.ThreadLocalRandom;


class Car implements Runnable{
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+ "Has entered the parking lot");
            Thread.sleep(2000);

            synchronized(this)
            {
                System.out.println(Thread.currentThread().getName()+ "Got into the car to drive");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Started to drive the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Came back and parked the car");
            }
        }
        catch(Exception e){
            System.out.println("Some problem");

        }
    }
}
public class Multithreading10{
    public static void main(String[] args) {
        Car c = new Car();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("son 1");
        t2.setName("son 2");
        t3.setName("son 3");

        t1.start();
        t2.start();
        t3.start();
    }
}