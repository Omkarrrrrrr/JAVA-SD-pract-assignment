import java.util.*;

//sorting using comparable

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        // Sorting on the basis of their age
        if(this.age >that.age)
        	return 1;
        else
        return -1;
         
    }
}

public class ComparatorVsComparable3 {
    public static void main(String[] args) {

        Comparator<Student> com=(i,j) -> i.age > j.age?1:-1;


        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Omkar"));
        studs.add(new Student(12, "Shubham"));
        studs.add(new Student(18, "Pankaj"));
        studs.add(new Student(20, "Harsh"));

        System.out.println("Before Sorting:");
        for (Student s : studs)
            System.out.println(s);

        Collections.sort(studs,com); // Using Comparable interface
        System.out.println("\nAfter Sorting:");
        for (Student s : studs)
            System.out.println(s);
    }
}


/*Summary
The program defines a Student class with a natural ordering based on age using the Comparable interface.
It then creates a Comparator for sorting Student objects based on age.
The list of students is printed before and after sorting using the Comparator.*/