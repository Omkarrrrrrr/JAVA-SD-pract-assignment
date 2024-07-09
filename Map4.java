import java.util.Hashtable;
import java.util.*;   //this line is must....import is compulsory

public class Map4 {
    public static void main(String[] args) {
        
        Hashtable ht = new Hashtable();
        ht.put(1,"Rohit");
        ht.put(2, "Rohan");
        ht.put(3, "Ramesh");
        // ht.put(null, "Omkar");    //Null values are not allowed in Hashtable
        ht.putIfAbsent(4, "Shubham");

        System.out.println(ht);

        //Insertion order is not followed in HashTable

        TreeMap tm=new TreeMap();   

       tm.put(1, "Rohit");
       tm.put(2, "Ramesh");
       tm.put(4, "Rahul");
       tm.put(3, "Rohsn");

       System.out.println(tm);
       //order of insertion not preserved
       //It will give data  in ascending order
    }
    
}
