class Student{
    private int age;
    private String name;

    public void setData()  
    {
        age = 18;
        name = "Rahul";
    }

    public  void show()
    {
        System.out.println(name + " " + age);
    }
}




public class Encapsulation1{
    public static void main(String[]args){
        Student obj = new Student();
        // obj.age = 18;
        // obj.name = "Omkar"; // this will not run because ...intially age and name are kept private
        obj.setData();
        obj.show();


    }
}