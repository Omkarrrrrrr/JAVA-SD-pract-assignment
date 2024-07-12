import java.util.*;


//We are sorting here using comparator
class Student{
    int age;
    String name;

    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }

    public String toString() {
		return "Student [age=" + age + ", name=" +name +"]";
	}
   
}


public class ComparatorVsComparable2 {
    public static void main(String[] args) {


    Comparator<Student> com=new Comparator<Student>()
   	{
   		public int compare(Student i,Student j)
   		{
   			if(i.age >j.age)      //sorting on basis of their age
   				return 1;
   			else
   				return -1;
   		}
   	};

        
     	
    	List<Student> studs= new ArrayList<>();
    	studs.add(new Student(21,"Omkar"));
    	studs.add(new Student(12,"Shubham"));
    	studs.add(new Student(18,"Pankaj"));
    	studs.add(new Student(20,"Harsh"));
    	

        System.out.println("Before Sorting");
    	for(Student s:studs)
    		System.out.println(s);

        System.out.println("after sorting");
        Collections.sort(studs,com);          
    	for(Student s: studs)
    		System.out.println(s);
        
    }
    
}
