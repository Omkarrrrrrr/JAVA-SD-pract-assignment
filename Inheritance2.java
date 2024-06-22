class Human1
{
    private String name;
    int age;

    Human1()   // constructor does not participate in inheritance but it will execute automatically java compiler as it is constructor
    {
        System.out.println("Human class constructor");
    }

    void sleep()
    {
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student1 extends Human1
{
    void disp()
    {
        System.out.println("the age is  : " + age);
        // System.out.println("the name is :" + name); // here it will give error because in human1 there is not name
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        st1.sleep();
        st1.disp();
    }
    
}
