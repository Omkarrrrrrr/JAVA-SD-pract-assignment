class Student {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(age + " " + name);
    }
}

public class Encapsulation5 {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setAge(18);
        obj1.setAge(25);
        obj.setName("Navin");
        obj1.setName("kiran"); // Set name to "kiran" for obj1
        int stud1Age = obj.getAge();
        String stud1Name = obj.getName();
        System.out.println(stud1Age + " " + stud1Name);

        int stud2Age = obj1.getAge();
        String stud2Name = obj1.getName();
        System.out.println(stud2Age + " " + stud2Name);
    }
}