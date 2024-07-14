import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {
    public static void main(String[] args) throws IOException
     {
        
        // File dir = new File("PW");
        // File file = new File(dir, "Pw.txt");   //Case sensetive so enter file name correctly
        
        // FileReader fd = new FileReader(file);

        // int i = fd.read();
        // System.out.println((char)i);     //Typeasted

        // while(i!=1){
        //     System.out.println(i + "--->");
        //     System.out.println((char)i);

        //     i = fd.read();
        // }

        // fd.close();

        
        File dir=new File("PW");
        File file=new File(dir, "Pw.txt");

        FileReader fd=new FileReader(file);
        char ch[]=new char[(int)file.length()];
       
       //  int i=fd.read();

        fd.read(ch);

        for(char data:ch)
        {
           System.out.print(data);
        }

        
       //  System.out.println((char)i);

       //  while(i!=-1)
       //  {
       //     System.out.print(i+ "----> ");
       //     System.out.println((char)i);
       //     i=fd.read();

       //  }


        
    }
    
}
