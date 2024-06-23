// Base class AeroPlane2
class AeroPlane2
{
    public void takeOff()
    {
       
        System.out.println("AeroPlane is taking off");
    }

    public void fly()
    {
        System.out.println("AeroPlane is Flying");
    }
}

// Subclass CargoPlane2 extending AeroPlane2
class CargoPlane2 extends AeroPlane2
{
    // overridden methods are used
    public void takeOff()
    {
        System.out.println("CargoPlane requires longer runway");
    }
   public void fly()
   {
    System.out.println("Cargoplane flies at lower height");
   }  
}

// Subclass PassengerPlane2 extending AeroPlane2
class PassengerPlane2 extends AeroPlane2
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

// Subclass FighterPlane2 extending AeroPlane2
class FighterPlane2 extends AeroPlane2
{
    public void takeOff()
    {
        System.out.println("FighterPlane requires small size runway");
    }
    public void fly()
    {
    System.out.println("FighterPlane flies at high height");
    }
}

// Class to demonstrate polymorphism
class Airport
{
     // Method to accept any AeroPlane2 reference and call its methods
    public void poly(AeroPlane2 ref)
    {
        ref.takeOff();
        ref.fly();

        System.out.println("-------------------------------------------------");
    }
}


public class Polymorphism2 {
    public static void main(String[] args) {
        CargoPlane2 cp=new CargoPlane2();
        
        PassengerPlane2 pp=new PassengerPlane2();

        FighterPlane2 fp=new FighterPlane2();

        Airport a =new Airport();

        // Demonstrate polymorphism by passing different plane objects
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);

        // cp.takeOff();
        // cp.fly();

        // pp.takeOff();
        // pp.fly();

        // fp.takeOff();
        // fp.fly();
    }
    
}
