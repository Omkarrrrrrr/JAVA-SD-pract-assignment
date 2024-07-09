import java.util.*;
import java.util.Map.*;    //necessary for using data structures like Map, HashMap, Set, and Iterator

class Student
{
    private String name;
    private int age;
    private String city;

    public Student(String name,int age,String city)
    {
        this.name = name;
        this.age = age;
        this.city = city;

    }
    //getter methods for accessing the private member variables name, age, and city of the Student class.
    public String getName(){
        return name;
    }
    public  int getAge(){
        return age;
    }
    public String getCity(){
        return city;
    }
    //getter methods for accessing the private member variables name, age, and city of the Student class.
    public String toString()
    {
        return name + " " + age + " " + city;
    }

    
}
public class Map3{
    public static void main(String[] args) {

        Student st1=new Student("Rohan", 18, "Bengaluru");
        Student st2=new Student("Rohit", 19, "Delhi");
        Student st3=new Student("Ramesh", 22, "Mysuru");

        Map map=new HashMap();   //creates a HashMap named map and adds the three Student objects to it with keys 1, 2, and 3.
        map.put(1, st1);
        map.put(2, st2);
        map.put(3, st3);
        System.out.println(map);
        //When System.out.println(map); is executed, it will display the HashMap's content. Since the toString method of the Student class is overridden, it will print the details of each student in the map.

        Set set = map.entrySet();
        Iterator itr = set.iterator();

        while(itr.hasNext())
        {
            //System.out.println(itr.next());
            Map.Entry data=(Entry)itr.next();
            System.out.println(data.getKey() + " : " + data.getValue());
        }
    }
}