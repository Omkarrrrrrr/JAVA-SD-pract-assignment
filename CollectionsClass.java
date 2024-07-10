import java.util.*;
public class CollectionsClass {
    public static void main(String[] args) {
        
        ArrayList al1 = new ArrayList();

        al1.add(100);
        al1.add(50);
        al1.add(150);
        al1.add(25);
        al1.add(75);
        al1.add(125);


        System.out.println(al1);

        Collections.sort(al1);   //This sort method is available for String data also
        System.out.println(al1);  

        int index = Collections.binarySearch(al1, 75);    //To use binary search method ....data must be sorted...if it isnt then sort it first
        System.out.println("Index is : "+index);

        Collections.rotate(al1,3);
        System.out.println(al1);

        Collections.shuffle(al1);
        System.out.println(al1);

       System.out.println(Collections.frequency(al1, 25)); 
       

        
    }
    
}
