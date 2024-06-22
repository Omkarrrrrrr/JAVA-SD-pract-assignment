class Animal // extends object class in behind the scenes
{
    public void eat()
    {
        System.out.println("Animal eats everyday");
    }
    public void age(int x)
    {
        System.out.println("Animal age is");
    }
    
}

class Tiger extends Animal
{
   public void eat()
   {
    System.out.println("Tiger hunts and eat");
   }

  public void age(int x)
   {
    
   }
    
}


public class Inheritance3 
{
    public static void main(String[] args) 
    {
      Tiger t=new Tiger();
      t.eat();
      
      
    }   
}