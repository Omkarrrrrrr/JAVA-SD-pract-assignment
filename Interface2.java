interface Computer
{
    void compileCode();   // must be implemented by any class that implements this interface.
    default void config() //Default methods can have a body, providing a default behavior that can be used or overridden by implementing classes.
    {

    }
}

class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("you got 5 errors");
    }
}

class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("you got 5 errors, faster");
    }
}

class Developer
{
    public void buildApp(Computer obj) //buildApp method prints "Building App" and then calls the compileCode() method on the provided Computer object.
    {
        System.out.println("Building App");
        obj.compileCode();
    }  
}

public class Interface2 {
    public static void main(String[] args) {

        //Laptop obj = new Laptop();
        Computer obj = new Laptop();  // demonstrates polymorphism
        Developer dev = new Developer();
        dev.buildApp(obj);
       

    }
}