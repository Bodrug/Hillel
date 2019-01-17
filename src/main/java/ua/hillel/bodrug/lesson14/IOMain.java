package ua.hillel.bodrug.lesson14;


import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class IOMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
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
        //url();
        //zipSream();
        objectStream();
    }

    public static void charCopy() throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("/home/hillel/Bodrug/hillel/111.txt");
            out = new FileWriter("/home/hillel/Bodrug/hillel/111.out.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {

                in.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }

    public static void byteCopy() throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("/home/hillel/Bodrug/hillel/111.txt");
            out = new FileOutputStream("/home/hillel/Bodrug/hillel/111.out.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }

    public static void byteBufferedCopy() throws IOException {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream("/home/hillel/Bodrug/hillel/111.txt"));
            out = new BufferedOutputStream(new FileOutputStream("/home/hillel/Bodrug/hillel/111.out.txt"));
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }

    public static void lineCopy() throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new FileReader("/home/hillel/Bodrug/hillel/111.txt"));
            out = new BufferedWriter(new FileWriter("/home/hillel/Bodrug/hillel/111.out.txt"));
            String c;
            while ((c = in.readLine()) != null) {
                out.write(c);
                out.write(System.lineSeparator());

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }

    public static void inprutStreamReader() {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);

    }

    public static void dataStream() throws IOException {
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

    private static void url() throws IOException {
        String url = "https://www.youtube.com/?gl=UA&hl=ru";
        try (InputStream inUrl = new URL(url).openStream();
             InputStreamReader inputStreamReader = new InputStreamReader(inUrl);
             BufferedReader br = new BufferedReader(inputStreamReader);

        ) {
            String s;
            List<String> strings = new ArrayList<>();
            while ((s = br.readLine()) != null) {
                strings.add(s);
            }
            strings.forEach(System.out::println);
            BufferedWriter out = new BufferedWriter(new FileWriter("/home/hillel/Bodrug/hillel/123.html"));
            out.write(strings.toString());
            out.flush();
            out.close();
        } catch (IOException e) {
            throw new IOException("Exception when open your URL " + url);
        }


    }

    private static void zipSream() throws IOException {
        String fileName = "/home/hillel/Bodrug/hillel/111.txt";
        String fipFileName = "/home/hillel/Bodrug/hillel/output.zip";
        try (
                ZipOutputStream zout =
                        new ZipOutputStream(new FileOutputStream("/home/hillel/Bodrug/hillel/output.zip"));
                FileInputStream fis = new FileInputStream(fileName)) {
            ZipEntry entry1 = new ZipEntry("111.txt");
            zout.putNextEntry(entry1);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zout.write(buffer);
            zout.closeEntry();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        //read
        long MILLS_IN_DAY = 24*60*60*1000;
        try(FileInputStream fis = new FileInputStream(fipFileName);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ZipInputStream zis = new ZipInputStream(bis)){
            ZipEntry ze;
            while ((ze=zis.getNextEntry())!=null){
                System.out.format("File: %s Size: %s Last Modified %s",
                        ze.getName(),ze.getSize(), LocalDate.ofEpochDay(ze.getTime() / MILLS_IN_DAY));

            }
        }


    }

    private static void objectStream() throws IOException, ClassNotFoundException{

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream( "object.dat"));
        Byte width = 12;
        Car obj = new Car(1, Arrays.asList(new Weel(15,width )));
        obj.weels = Arrays.asList((new Weel(15,width)));
        System.out.println(obj);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("object.dat"));
        Car o = (Car)objectInputStream.readObject();
        /*System.out.println(o);
        System.out.println(obj.hashCode());
        System.out.println(o.hashCode());
        System.out.println(obj.weels.hashCode());
        System.out.println(o.weels.hashCode());*/

    }

    static class Car implements Serializable{
        int id;
        //transient List <Weel> weels;//weels не будет сериализвано
        List <Weel> weels;
        @Override
        public String toString() {
            return "Car{" +
                    "id=" + id +
                    ", weel=" + weels +
                    '}';
        }

        public Car(int id, List<Weel> weel) {
            this.id = id;
            this.weels = weel;
        }
    }

    static  class Weel implements Externalizable{
        public Weel() {
        }

        int radius;
        byte width;
        @Override
        public String toString() {
            return "Weel{" +
                    "radius=" + radius +
                    '}';
        }

        Weel(int radius, byte width) {
            this.radius = radius;
            this.width = width;
        }


        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeInt(radius);
            out.writeByte(width);
            out.flush();
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            radius = in.readInt();
            width = in.readByte();
            System.out.println("readExternal o:" + radius);
        }
    }

}



