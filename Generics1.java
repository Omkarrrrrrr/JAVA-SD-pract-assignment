import java.util.*;
public class Generics1 {
    public static void main(String[] args) {
        
        //Array follows typesafety
        // String arr[] = new String[10];
        // arr[0] = "Omkar";
        // arr[1] = "Java";
        //arr[2] = 77;      //Compiletime error

        // // Accessing array elements way 1
        // String name1 = arr[0];
        // String name2 = arr[1];

        // // Printing the values to verify
        // System.out.println("First element: " + name1);
        // System.out.println("Second element: " + name2);

        // // Accessing array elements way 2
        // System.out.println(arr[0]);


        // No typesafety in arrayList
        ArrayList al = new ArrayList();

        al.add("Shubham");
        al.add("Web dev");

        al.add(20); // No compile error

        System.out.println(al);

        // Collection stores data as object but here we have to store the data in string type
        String n1 =(String)al.get(0);   //Typecasting is necessary to perform string related operations
        String n2 =(String)al.get(1);
        String n3 =(String)al.get(2);   //Though the element at index 2 is int type it will not give any CE
                                        //But it will give runtime error.  java.lang.ClassCastException


        //To get solution on this problem generics were invented
        
         //Typesafety achived usimg generics
         ArrayList<String> al2=new ArrayList<String>();

         al2.add("Hyder");
         al2.add("PW");
 
         //al.add(10);  // Here we cant store any diff type of data because we already restricted that using generics

        
 
         String name1 =al2.get(0);
         String name2 =al2.get(1);

         System.out.println(name1);
         System.out.println(name2);



    }
    
}
