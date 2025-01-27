import java.io.*;
class appendNameToRAFFile{
    public static void main(String[] args) {
        try {
            RandomAccessFile f = new RandomAccessFile("D:\\AgusJava\\genprgms\\FilesandPath\\NewText.txt","rw");
            System.out.println("Pointer Initially at: "+f.getFilePointer);
            String s = "Agus";
            f.seek(f.length);
            System.out.println("Pointer Now at: "+f.getFilePointer);
            f.write(s.getBytes());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
}
}