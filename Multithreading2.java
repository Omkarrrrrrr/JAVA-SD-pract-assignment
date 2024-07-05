public class Multithreading2 {
    public static void main(String[] args) {
        System.out.println("Main thread");
        System.out.println("Before changing");
        String name = Thread.currentThread().getName();  //Thread.currentThread() returns a reference to the currently executing thread object (which is the main thread in this case). getName() retrieves the name of this thread.
        System.out.println("Name of thread is: "+name);
        System.out.println("Priority of thread is: " +Thread.currentThread().getPriority());

        Thread t = Thread.currentThread();   //This assigns the current thread (main thread) to a Thread variable named t.
        t.setName("PW");
        t.setPriority(1);
        System.out.println("after changing");
        String name1 = Thread.currentThread().getName();
        System.out.println("Name of thread is: "+name1);
        System.out.println("Priority of thread is: " +Thread.currentThread().getPriority());

    }
    
}
