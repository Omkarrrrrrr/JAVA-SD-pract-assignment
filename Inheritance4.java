
// class Demo1   // multilevel inheritance
// {
//     void disp()
//     {
//         System.out.println("Disp wrttien in demo1 class");
//     }
// }
// class Demo2 extends Demo1
// {

// }
// class Demo3 extends Demo2
// {

// }

class Parent1 //extends Object  // multiple inheritance which is not allowed in java...itll give error if we try to do it
{
    int age=18;
}
class Parent2 //extends Object
{
    int age=19;
}

class Child extends Parent1 //, extends Parent2
{
   
}

public class Inheritance4 
{
    public static void main(String[] args) 
    {
        // Demo3 d=new Demo3();
        // d.disp();
    }
    
}