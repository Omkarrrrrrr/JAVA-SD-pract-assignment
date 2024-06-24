// this application is made without using oops concepts....and this in not the efficient way
import java.util.*;

class Rectangle
{
    float length;
    float breadth;
    float area;

    public void input()
    {
        System.out.println("Calculation of Rectangle App: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of Rectangle");
        length = sc.nextFloat();
        System.out.println("Please enter breadth of Rectangle");
        breadth = sc.nextFloat();
    }
    public void compute()
    {
        area = length*breadth;
    }
    public void disp()
    {
        System.out.println("The area of Rectangle is: " + area);
    }
}

class Square
{
    float length;
    float area;

    public void input()
    {
        System.out.println("Calculation of Square app :");
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter length of Square");
        length=scan.nextFloat();
       

    }
    public  void compute()
    {
        area=length*length;
    }

    public void disp()
    {
        System.out.println("The area of Square is : "+ area);
    }
}
class Circle
{
    float radius;
    float area;

    public void input()
    {
        System.out.println("Calculation of Circle app :");
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter radius of circle");
        radius=scan.nextFloat();
       

    }
    public  void compute()
    {
        area=3.14f* radius * radius;
    }

    public void disp()
    {
        System.out.println("The area of Circle is : "+ area);
    }
}
public class AreaApp{
    public static void main(String[] args) {
        
        Rectangle rec = new Rectangle();
        rec.input();
        rec.compute();
        rec.disp();

        Square sq = new Square();
        sq.input();
        sq.compute();
        sq.disp();

        Circle c = new Circle();
        c.input();
        c.compute();
        c.disp();


    }
}