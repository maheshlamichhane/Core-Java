import java.io.*;

public class FileMain {
    public static void main(String[] args) throws IOException {

        File file = new File("demofile.txt");
        System.out.println("File exists: " + file.exists());
        System.out.println("File canRead: " + file.canRead());
        System.out.println("File canWrite: " + file.canWrite());
        System.out.println("File canExecute: " + file.canExecute());
        System.out.println("File isDirectory: " + file.isDirectory());
        System.out.println("File isHidden: " + file.isHidden());
        System.out.println("File length: " + file.length());
        System.out.println("File lastModified: " + file.lastModified());
        System.out.println("File absolute path: "+file.getAbsolutePath());
        System.out.println("File name: "+file.getName());
        System.out.println("File path: "+file.getPath());
        System.out.println("File isFile:"+file.isFile());
        System.out.println("File and dir list: "+file.list());

        // File Reader and File Writer
        FileWriter fw = new FileWriter(file);
        fw.write("Hello");
        fw.write(65);
        fw.write(new char[]{'a','b','c'});
        fw.write("Don");
        fw.close();

        FileWriter fw2 = new FileWriter(file,true);
        fw2.write("Hehe");
        fw2.close();

        FileReader fr = new FileReader(file);
        System.out.print("File Content=");
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        fr.close();


        //BufferedReader and BufferedWriter
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fileWriter,100);
        bw.write(100);
        bw.newLine();
        char[] ch1 = {'a','b','c','d'};
        bw.write(ch1);
        bw.newLine();
        bw.write("durga");
        bw.newLine();
        bw.write("Software solutions");
        bw.flush();
        bw.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader,100);
        String line = br.readLine();
        while(line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();

        // Printwriter
        PrintWriter out = new PrintWriter(file);
        out.write(123);
        out.write('a');
        out.write("kdsjflkd");
        out.write(new char[]{'a','b','c','d'});
        out.println(12);
        out.println(2.2);
        out.println(true);
        out.close();


        //FileOutputStream and FileInputStream
        try {
            // create a writer
            FileOutputStream fos = new FileOutputStream("nature.jpg");
            // write data to file
            fos.write("Hey, there!".getBytes());
            fos.write("\n".getBytes());
            fos.write("How are you doing?".getBytes());

            // close the writer
            fos.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            // create a reader
            FileInputStream fis = new FileInputStream("nature.jpeg");

            // read one byte at a time
            int chh;
            while ((chh = fis.read()) != -1) {
                System.out.print((char) chh);
            }

            // close the reader
            fis.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //BufferedInputStream and BufferedOutputStream
        try {
            // create a writer
            FileOutputStream fos = new FileOutputStream("nature.jpg");
            BufferedOutputStream writer = new BufferedOutputStream(fos);

            FileInputStream fis = new FileInputStream("nature.jpeg");
            BufferedInputStream reader = new BufferedInputStream(fis);

            // read one byte at a time
            int chhhh;
            while ((chhhh = reader.read()) != -1) {
                // write data to file
                writer.write((int)chhhh);
            }
            // flush remaining bytes
            writer.flush();

            // close the writer
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {

            FileInputStream fis = new FileInputStream(new File("nature.jpg"));
            BufferedInputStream reader = new BufferedInputStream(fis);

            // read one byte at a time
            int cha;
            while ((cha = reader.read()) != -1) {
                System.out.print((char) cha);
            }

            // close the reader
            reader.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}