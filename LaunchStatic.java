



public class LaunchStatic{
    static int age; // first

    static{ // second
        age = 18;
        System.out.println("Static block first");
        System.out.println(age);
    }

    static void disp()
    {
      System.out.println("Static display method after main after calling only");  
    }
    
    public static void main(String[]args)
    {
        System.out.println("Main method");
        // disp();
    }
}