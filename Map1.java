import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map1{
    public static void main(String[] args) {

        HashMap hm1 = new HashMap();
        hm1.put(1,"Virat");     //Entry
        hm1.put(2,"Rohit");
        hm1.put(3,"Sachin");
        System.out.println(hm1);  
        // hm1.put(null, null);  // Null values are also allowed in HashMap
        //order will not be always preserved in hashmap
        
        HashMap hm2 = new HashMap();  //Entry
        hm2.put("Rohit","Sharma");
        hm2.put("Virat","Kohli");
        hm2.put("Sachin","Tendulkar");
        System.out.println(hm2);           //Key  can be of any type


        LinkedHashMap lhm = new LinkedHashMap();  // This is used to preserve order of insertion
        lhm.put("Omkar",77);   //Entry
        lhm.put("Shubham",04);
        lhm.put("Pankak",26);
        System.out.println(lhm);
    }
}