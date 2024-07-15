import java.io.*;


 class BufferedWriterJava {
    
    public static void main(String[] args) throws IOException
    {
        File dir=new File("PW");
        File file=new File(dir, "pw.txt");

        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        char ch[]={'p','w','s','j'};
        bw.write(ch);

        // bw.flush();
        bw.close();
    }

    
}
