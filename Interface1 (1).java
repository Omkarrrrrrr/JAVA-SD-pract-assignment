interface A 
{
    int num = 6; // this var is by default public static final
    void show();  // declared a method
}
public class Interface1{
    public static void main(String[] args) {
        
       //System.out.println(num);  // this will not run directly
        System.out.println(A.num);

       // A.num = 9; // as the variable  is final ...we cant change it

       // A obj = new A() // instantiation is not allowed in interface
    }
}