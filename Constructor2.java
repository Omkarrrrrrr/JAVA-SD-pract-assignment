class Demo
{
    private int a;
    private int b;


    public Demo()
    {
        System.out.println("Zero paarametrized constructor by programmer");
    }

    public Demo(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

void disp()
{
    System.out.println(a);
    System.out.println(b);
}

}

public class Constructor2
{
    public static void main(String[]args)
    {
        Demo d = new Demo();  // this  will not show any error because default constructor is made in behind the scenes
        d.disp();   // this will give default value of a and b which are 0
                    // as we have already used a constructor written by programmer , we have to add zero parametrized constructot to get this d.disp() result
        Demo d2 = new Demo(10,20);
        d2.disp();
    }
}