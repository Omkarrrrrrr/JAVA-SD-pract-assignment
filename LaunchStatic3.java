
class Demo1
{
    static int a;
    static int b;

    int m;
    int n;

    static
    {
        a= 20;
        b = 30;
        System.out.println("Control in static block");
    }
    
    {
       m= 100;
       n = 200;
       System.out.println("Control in non static block");
    }

    static void disp1()
    {
       System.out.println("Value of static var a is "+ a);   
       System.out.println("Value of static var b is "+ b);   
    }
    void disp2()
    {
       System.out.println("Value of instance var m is "+ m); 
       System.out.println("Value of instance var n is "+ n); 
    }
}

public class LaunchStatic3{
    public static void main(String[]args)
    {
       Demo1 d= new Demo1();
       Demo1.disp1();
       d.disp2();

    }
}