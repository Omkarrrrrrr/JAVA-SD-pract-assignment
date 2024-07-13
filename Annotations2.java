import java.lang.annotation.*;
import java.util.function.DoubleUnaryOperator;

import javax.swing.ViewportLayout;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@interface CricketPlayer
{
    String country() default "India";
    int age() default 34;

}
@CricketPlayer
class Virat{

    @CricketPlayer
    private int innings;
    private int runs;

    @CricketPlayer
    public int getInnings(){
        return innings;
    }

    public void setInnings(int innings){
         this.innings=innings;
    }
    public int getRuns(){
        return runs;
    }

    public void setRuns(int runs){
        this.runs = runs;
    }

}
public class Annotations2 {
    public static void main(String[] args) {

        Virat v = new Virat();
        v.setInnings(300);
        v.setRuns(30000);

        System.out.println(v.getInnings());
        System.out.println(v.getRuns());

        // Class c = v.getClass();
        // Annotation a = c.getAnnotation(CricketPlayer.class);
        // CricketPlayer cp = (CricketPlayer)a;

        // String country = cp.country();
        // System.out.println(country);
        // int age=cp.age();
        // System.out.println(age);

        // Get the class object for Virat
        Class<Virat> c = Virat.class;

        // Check if the class is annotated with CricketPlayer
        if (c.isAnnotationPresent(CricketPlayer.class)) {
            CricketPlayer cp = c.getAnnotation(CricketPlayer.class);

            String country = cp.country();
            System.out.println(country);
            int age = cp.age();
            System.out.println(age);
        } else {
            System.out.println("Annotation not present on class");
        }

        
    }
    
}
