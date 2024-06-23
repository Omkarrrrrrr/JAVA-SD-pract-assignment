class AeroPlane1
{
    public void takeOff()
    {
        System.out.println("AeroPlane is taking off");
    }
    public void fly()
    {
       System.out.println("AeroPlane is flying"); 
    }
}
class CargoPlane1 extends AeroPlane1
{
   public void takeOff()
    {
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly()
    {
       System.out.println("CargoPlane flies at lower height"); 
    } 
}
class PassengerPlane1 extends AeroPlane1
{
    public void takeOff()
    {
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly()
    {
       System.out.println("PassengerPlane flies at medium height"); 
    } 

}

public class Polymorphism1{
    public static void main(String[]args)
    {
        CargoPlane1 cp =new CargoPlane1();

        PassengerPlane1 pp =new PassengerPlane1();

        //pp=cp     // this will throw error because reference should be same only

        // This declares a reference variable ref of type AeroPlane1. This reference can point to any object that is an instance of AeroPlane1 or its subclasses.
        AeroPlane1 ref;

        ref=cp;  // ref is assigned to cp object now
        // will execute the overridden methods in CargoPlane1.
        ref.takeOff(); 
        ref.fly();

        System.out.println("------------------------------------------------------------");

        ref = pp; // ref is assigned to pp object now
        //will execute the overridden methods in PassengerPlane1

        ref.takeOff();
        ref.fly();
    }
}