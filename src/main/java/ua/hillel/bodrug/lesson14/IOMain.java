package ua.hillel.bodrug.lesson14;


import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IOMain {

    public static void main(String[] args) throws IOException {
        /*File file = new File("test.txt");
        System.out.println(file.exists());
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        File file1 = new File("/home/hillel/Bodrug/hillel/classes");
        System.out.println(file1.isDirectory());
        */

        /*String[] list = file1.list();
        for (String s : list) {
            System.out.println(s);
        }*/

        /*Path path = file1.toPath();
        Path path1 = Paths.get("home:\\hillel\\Bodrug\\hillel\\classes");
        File file2 = path1.toFile();
        Iterator<Path> iterator = path1.iterator();
        while (iterator.hasNext()){
            Path next = iterator.next();
            System.out.println(next.toString());
        }*/


        /*Files.walkFileTree(
                Paths.get("home:\\hillel\\bodrug\\hillel"),
                new SimpleFileVisitor<>(){
                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) throws IOException{
                        System.out.println(file);
                        return super.visitFile(file, attributes);
                    }
                    )
                }
        )*/

        /*WatchService watcher = FileSystems.getDefault().newWatchService();
        Path path2 = Paths.get("/home/hillel/Bodrug/hillel/");
        WatchKey register = path2.register(watcher, StandardWatchEventKinds.ENTRY_CREATE);
        try {
            WatchKey take = watcher.take();
            System.out.println(take);
            List<WatchEvent<?>> x = take.pollEvents();
            for (WatchEvent<?> watchEvent : x) {
                System.out.println(watchEvent);
            }
            System.out.println(x);
        }
        catch (InterruptedException x){}




        InputStream in = System.in;
        OutputStream out = System.out;*/

/*
        FileInputStream in = null;
        FileOutputStream out = null;
         try {
             in = new FileInputStream("/home/hillel/Bodrug/hillel/111.txt");
             out = new FileOutputStream("/home/hillel/Bodrug/hillel/111.out.txt");
             int c;
             while (( c = in.read())!=-1){
                 out.write(c);
             }
         }catch (FileNotFoundException e){
             e.printStackTrace();
         }catch (IOException e){
             e.printStackTrace();
         }
         finally {
             if (in!=null){
                 in.close();
             }
             if(out!=null){
                 out.close();
             }
         }
*/


        //byteCopy();
        //charCopy();
        //byteBufferedCopy();
        //lineCopy();
        //dataStream();
        url();
    }

    public static void charCopy() throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("/home/hillel/Bodrug/hillel/111.txt");
            out = new FileWriter("/home/hillel/Bodrug/hillel/111.out.txt");
            int c;
            while (( c = in.read())!=-1){
                out.write(c);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if (in!=null){

                in.close();
            }
            if(out!=null){
                out.flush();
                out.close();
            }
        }
    }

    public static void byteCopy() throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("/home/hillel/Bodrug/hillel/111.txt");
            out = new FileOutputStream("/home/hillel/Bodrug/hillel/111.out.txt");
            int c;
            while (( c = in.read())!=-1){
                out.write(c);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if (in!=null){
                in.close();
            }
            if(out!=null){
                out.flush();
                out.close();
            }
        }
    }

    public static void byteBufferedCopy() throws IOException{
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream("/home/hillel/Bodrug/hillel/111.txt"));
            out = new BufferedOutputStream(new FileOutputStream("/home/hillel/Bodrug/hillel/111.out.txt"));
            int c;
            while (( c = in.read())!=-1){
                out.write(c);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if (in!=null){
                in.close();
            }
            if(out!=null){
                out.flush();
                out.close();
            }
        }
    }

    public static void lineCopy() throws IOException{
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new FileReader("/home/hillel/Bodrug/hillel/111.txt"));
            out = new BufferedWriter(new FileWriter("/home/hillel/Bodrug/hillel/111.out.txt"));
            String c;
            while (( c = in.readLine())!=null){
                out.write(c);
                out.write(System.lineSeparator());

            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if (in!=null){
                in.close();
            }
            if(out!=null){
                out.flush();
                out.close();
            }
        }
    }

    public static void inprutStreamReader(){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);

    }

    public static void dataStream() throws IOException{
        DataOutputStream dataOutputStream =
                new DataOutputStream(
                        new FileOutputStream("data.dat"));

        dataOutputStream.writeInt(123);
        dataOutputStream.writeDouble(321.11);
        dataOutputStream.writeUTF("TEST");

        dataOutputStream.flush();
        dataOutputStream.close();
        DataInputStream dataInputStream =
                new DataInputStream(
                        new FileInputStream("data.dat"));

        int i = dataInputStream.readInt();
        double v = dataInputStream.readDouble();
        String s = dataInputStream.readUTF();
        System.out.println(i);
        System.out.println(v);
        System.out.println(s);
        dataInputStream.close();
    }

    private static void url() throws IOException{
        String url = "https://www.youtube.com/?gl=UA&hl=ru";
        try (InputStream inUrl = new URL(url).openStream();
             InputStreamReader inputStreamReader = new InputStreamReader(inUrl);
             BufferedReader br = new BufferedReader(inputStreamReader);

        ){
            String s;
            List<String> strings = new ArrayList<>();
            while ((s = br.readLine())!= null){
                strings.add(s);
            }
            strings.forEach(System.out::println);
            BufferedWriter out = new BufferedWriter(new FileWriter("/home/hillel/Bodrug/hillel/123.html"));
            out.write(strings.toString());
            out.flush();
            out.close();
        } catch (IOException e){
                 throw new IOException("Exception when open your URL " + url);
        }


    }


}
