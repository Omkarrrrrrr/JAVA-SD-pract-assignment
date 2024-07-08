import java.util.*;
public class Itr_litr{
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(100);

        System.out.println(al);

        // for loop
        for(int i=0;i<al.size();i++)
        {
            Object o = al.get(i);
            System.out.println(o);
        }
        System.out.println("***********************************************************************");

        // for each
        for(Object o: al)
        {
            System.out.println(o);
        }

        System.out.println("***********************************************************************");

        //Iterator

        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
           // Integer i = (Integer)itr.next();
            System.out.println(itr.next());
        }

        System.out.println("***************************************************************");

        //listIterator

        ListIterator litr = al.listIterator(al.size());   //al.size() is necessary here

        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());       // reverse direction
        }

    }
}