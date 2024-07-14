import java.io.File;
import java.io.IOException;

public class IO_Operation1{
    public static void main(String[] args) throws IOException
    {
        
        File file1 = new File("Pw.txt");
        System.out.println(file1.exists());   //False

        file1.createNewFile();
        System.out.println(file1.exists());      //Use throws exception to duck it as it is throwing an exception   // Now this  will create the file we want

        File dir = new File("PW");
        System.out.println(dir.exists());

        dir.mkdir();                            //To create the directory
        System.out.println(dir.exists());


    }
    
}