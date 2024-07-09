import java.util.Map.*;
import java.util.*;    //Must to import this java.util files
public class Map2 {
    public static void main(String[] args) {
        
        Map map = new HashMap();
        map.put(1,"Rohan");
        map.put(2, "Rohit");
        map.put(3, "Rahul");
        map.put(4, "Ramesh");

        System.out.println(map);
        System.out.println(map.get(4));

        Set keySet=map.keySet();// return all keys
        Iterator itr1=keySet.iterator();
        while(itr1.hasNext())
        {
            // System.out.println(itr1.next());
            Integer key=(Integer)itr1.next();   //converting returned object to integer
            System.out.println(key);            // key is an Integer variable that stores the value returned by itr1.next() after typecasting.
            
        }

 
        Collection values = map.values();    //To return all values
        Iterator itr2 = values.iterator();
        while(itr2.hasNext())
        {
           // System.out.println(itr2.next());
           String name = (String)itr2.next();
           System.out.println(name);
        }

        Set entryset = map.entrySet();   //To return key-value pair
        //map.entrySet() returns a Set view of the mappings contained in the map. Each element in this set is a Map.Entry object representing a key-value pair.
        Iterator itr3 = entryset.iterator();
        while(itr3.hasNext())
        {
            //System.out.println(itr3.next());
            Map.Entry data=(Entry)itr3.next();
            //itr3.next() returns the next element in the iteration, which is a Map.Entry object representing a key-value pair.
            //This returned object is typecast to Map.Entry and assigned to the variable data.
            System.out.println(data.getKey()+":"+data.getValue());


        }







    }
    
}
