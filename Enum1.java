import javax.annotation.processing.SupportedOptions;

enum Week{
    MON,TUE,WED,THUR,FRI,SAT,SUN;
}
public class Enum1 {

    // we can define any enum inside class also...they are basically constant values month week color etc
    public static void main(String[] args) {
        
        Week w = Week.MON;
        System.out.println(w);

        int index = Week.MON.ordinal();    //gives index
        System.out.println(index);

        Week []wr = Week.values();
        for(Week w1 :wr)
        {
            System.out.println(w1+":"+w1.ordinal());
        }
    }
    
}
