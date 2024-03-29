class demo
{
  static void disp1()    // here static is used thats why no need to create any object ...thats the advantage of static
 {
    System.out.println("Static display1");
 }
 
 void disp2()
 {
    System.out.println("Non static display2");
 }

}
public class LaunchStatic2
{
   public static void main(String[]args)   // here static used
 {
   demo.disp1();
   // demo.disp2(); // this is invalid here

   demo d = new demo();  // by creating obj also its possible to call static method
   d.disp1();
   d.disp2();
 }

}