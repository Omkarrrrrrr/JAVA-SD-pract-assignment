import java.io.*;

import javax.crypto.spec.DESKeySpec;
public class File_Writer {
    public static void main(String[] args) throws Exception
    {
        
        File dir = new File("PW");

        File file = new File(dir, "Pw.txt");
        file.createNewFile();

        FileWriter fw = new FileWriter(file,true);
        // fw.write("Pw");
        fw.write("JAVA");
        fw.write(65);           // ASCII values -> a
        fw.write(97);
        char ch[] = {'j','a','v','a'};
        fw.write(ch);

        fw.close();      //Resource closing is must to write the data   //instead fw.close() we can use fw.flush() also
        // fw.flush();

        System.out.println("To see the changes open Pw.txt");

        //If we dont want to overwrite the data use true keyword while creting fileWriter obj




    }
    
}
