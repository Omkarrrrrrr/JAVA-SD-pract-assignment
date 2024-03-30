// this keyword

class Student{
	private int age;
	private String name;

	public void setData1(int age)
	{
		this.age=age;
		
	}
	public void setData2(String name)
	{
		this.name=name;
		
	}
	public void show()
	{
	System.out.println(age+" "+name);
	}
}
public class Encapsulation4{
	public static void main(String[] args){
	Student obj=new Student();
	Student obj1=new Student();
	obj.setData1(18);
	obj1.setData1(25);
    obj.setData2("Shubham");
    obj1.setData2("sahil");
	obj.show();
	obj1.show();
	
	}
}