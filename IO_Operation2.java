import java.io.*;
public class IO_Operation2 {
    public static void main(String[] args)  throws IOException
    {
        // File dir = new File("PWJAVA");          //Paramter  should not be empty..every time we need to give file name
        // System.out.println(dir.isDirectory());

        // dir.mkdir();                           // To create the file we want

        // File file = new File(dir, "pwskills.txt");  // Here dir is referring to directory that we have made above
        // file.createNewFile();                       //To create the pwskills.txt file  //This throws IOexception so duck it
        // System.out.println(file.isFile());


        int count = 0;
        File f = new File("PWJAVA");    // we will be seeing there are how much files in PWJAVA dir

        String str[] = f.list();       //Here we will be storing list of  all  files


        for(String name:str)
        {
            count++;
            System.out.println(name);
        }

        System.out.println("No of files are: "+ count);

    }
    
}
