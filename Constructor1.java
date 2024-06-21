class Student   // class name =  constructor name
{
    private String name;
    private int age;

    Student(String name,int age)   // as it is constructor there will be no return type
    {
        this.name=name;
        this.age=age;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}


public class Constructor1{
    public static void main(String[]args)
    {
        Student st = new Student("Rahul", 10);

        String name = st.getName();
        System.out.println(name);

        int age = st.getAge();
        System.out.println(age);
    }
}