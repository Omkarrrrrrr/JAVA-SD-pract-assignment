interface A
{
    void show();           // declaring method
    default void config()  // we can define method in inerface using default keyword(java8)
    {
        System.out.println("in config");
    }
    static void abc()     // static methods are also possible in java8
    {

    }
}

class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
}
public class Java8Features {
    public static void main(String[] args) {
        A.abc();
        A obj = new B();
        obj.config();
    }
}
