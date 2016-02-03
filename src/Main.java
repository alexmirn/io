import java.io.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//-------------------------------------------------------
// создание потока байтов
//        ByteArrayOutputStream buff = new ByteArrayOutputStream();
//        for (int k=0; k <10; k++ ) {
//            buff.write(new byte[] {0,1,2});
//        }
//        byte[] bytes = buff.toByteArray();
//        System.out.println(Arrays.toString(bytes));
//    }

//-------------------------------------------------------
        // создание потока стрингов
//        StringWriter buff = new StringWriter( new File("1000d.txt"));
//        for (int k=0; k <10; k++ ) {
//            buff.write(new char[] {'H', 'e', 'l', 'l', 'o', ' '});
//        }
//        System.out.println(buff);

//-------------------------------------------------------
        // создание потока char-ов
//        CharArrayWriter buff = new CharArrayWriter();
//        for (int k=0; k <10; k++ ) {
//            buff.write(new char[] {'H', 'e', 'l', 'l', 'o', ' '});
//        }
//        char[] chars = buff.toCharArray(); // можно и без этого
//        System.out.println(buff);
//    }


//-------------------------------------------------------
        // чтение потока char-ов
//        char[] charBuff = new char[]{'H', 'e', 'l', 'l', 'o', ' '};
//        f(new CharArrayReader(charBuff));
//    }
//
//    private static void f(Reader reader) throws IOException {
//        int ch;
//        while ((ch = reader.read()) != -1) {
//            System.out.println((char) ch);
//        }

//-------------------------------------------------------
        // write 1000 double numbers to file
//        DataOutputStream out = new DataOutputStream(
//                new FileOutputStream(
//                        new File("1000d.txt")));
//        for (int i = 0; i < 1000; i++) {
//            out.writeDouble(321.90);
//        }
//        out.flush();
//        out.close();

//-------------------------------------------------------
        // zip, buffer and write 1000 double numbers to file
//        DataOutputStream out = new DataOutputStream(
//                new GZIPOutputStream(
//                        new BufferedOutputStream( // ускоряет процесс записи, т.к.
//                        // сначала накапливает 256 байтов и только потом пишет
//                        new FileOutputStream(
//                                new File("1000zip.txt")), 256))
//                );
//        for (int i = 0; i < 1000; i++) {
//            out.writeDouble(321.90);
//        }
//        out.flush();
//        out.close();

//-------------------------------------------------------
        // read 1000 double numbers from file
//        DataInputStream in = new DataInputStream(
//                new FileInputStream(
//                        new File("1000d.txt")));
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(in.readDouble());
//        }

//-------------------------------------------------------
        // write entity.Person class with help of EntityDataOutput
//        ByteArrayOutputStream buff = new ByteArrayOutputStream();
//
//        new EntityDataOutput(
//                new DataOutputStream(buff)).
//                writePerson(
//                        new Person("Alex", 29, new entity.Sex[]{entity.Sex.M}));
//        byte[] bytes = buff.toByteArray();
//        System.out.println(bytes.length);
//        entity.Person person = new EntityDataInput(
//                new DataInputStream(
//                        new ByteArrayInputStream(bytes))).readPerson();
//        System.out.println(person);
//-------------------------------------------------------
        // serialization - deserialization of java object
//        ByteArrayOutputStream buff = new ByteArrayOutputStream();
//        ObjectOutput out = new ObjectOutputStream(buff);
//        out.writeObject("Hello!");
//        out.writeObject(new Integer(123));
//        out.writeObject(new byte[][] {{0, 1}, {2, 3}});
//        out.flush();
//        out.close();
//        byte[] rawData = buff.toByteArray();
//        System.out.println(rawData.length);
//        System.out.println(Arrays.toString(rawData));
//        System.out.println(new String(rawData, "UTF-8"));
//        ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(rawData));
//        System.out.println((String) in.readObject());
//        System.out.println((Integer) in.readObject());
//        System.out.println(Arrays.deepToString((byte[][]) in.readObject()));
//-------------------------------------------------------
        // serialization - deserialization of java object2
//        ByteArrayOutputStream buff = new ByteArrayOutputStream();
//        ObjectOutput out = new ObjectOutputStream(buff);
//        out.writeObject(new Person("Olexiy", 29, new Sex[]{Sex.M}));
//        out.flush();
//        out.close();
//        byte[] rawData = buff.toByteArray();
//        System.out.println(rawData.length);
//        System.out.println(Arrays.toString(rawData));
//        System.out.println(new String(rawData, "UTF-8"));
//        ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(rawData));
//        Person person = (Person) in.readObject();
//        System.out.println(person);
//-------------------------------------------------------
        // рефлексия
//        String className = "entity.Person";
//        Class clazz = Class.forName(className);
//        Field[] fields = clazz.getDeclaredFields();
//        for (Field field: fields) {
//            System.out.println(field.getName());
//            System.out.println(field.getModifiers());
//        }
//-------------------------------------------------------
        // скачать из интернета картинку и записать ее на диск
//        final URLConnection httpCon = new URL("http://jpg-1.com/media/2016-2-2/zyEGnL7Fvc.jpg").openConnection();
//        final int len = httpCon.getContentLength();
//        if (len > 0) {
//            /* read data */
//            final byte[] imageData = new byte[len];
//            final InputStream inputStream = httpCon.getInputStream();
//            try {
//                int readed = 0;
//                do {
//                    readed += inputStream.read(imageData, readed, len - readed);
//                } while(readed < len);
//            } finally {
//                try {
//                    inputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            /* write data */
//            final OutputStream outputStream = new FileOutputStream("/home/yalex/Documents/first.jpg");
//            try {
//                outputStream.write(imageData);
//            } finally {
//                try {
//                    outputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        } else {
//            System.out.println("Net sodergimogo ili no connection");
//        }
//------------------------------------------------------------------------------
        // 2-ой способ скачать из интернета картинку и записать ее на диск
//        URL url = new URL( "http://jpg-1.com/media/2016-2-2/zyEGnL7Fvc.jpg" );
//        Image image = ImageIO.read(url);
//        String type = "png";
//        File file = new File( "newimage.".concat(type) );
//        ImageIO.write((RenderedImage) image, type,file );
//------------------------------------------------------------------------------
        // 3-ий способ скачать из интернета картинку и записать ее на диск
//        URL url = new URL("http://jpg-1.com/media/2016-2-2/zyEGnL7Fvc.jpg");
//        InputStream in = new BufferedInputStream(url.openStream().);
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        byte[] buf = new byte[1024];
//        int n;
//        while ((n=in.read(buf)) != -1) {
//            out.write(buf, 0, n);
//        }
//        out.close();
//        in.close();
//
//        byte[] response = out.toByteArray();
//        FileOutputStream fos = new FileOutputStream"third.jpg");
//        fos.write(response);
//        fos.close();
//------------------------------------------------------------------------------
        // 4-ый способ скачать из интернета картинку и записать ее на диск
//        URL url = new URL("http://jpg-1.com/media/2016-2-2/zyEGnL7Fvc.jpg");
//        InputStream in = new BufferedInputStream(url.openStream());
//        OutputStream out = new BufferedOutputStream(new FileOutputStream("fourth.jpg"));
//
//        for ( int i; (i = in.read()) != -1; ) {
//            out.write(i);
//        }
//        in.close();
//        out.close();
//------------------------------------------------------------------------------
        // 5-ый способ with try with resources скачать из интернета картинку и записать ее на диск
//        String sourceUrl = "http://jpg-1.com/media/2016-2-2/zyEGnL7Fvc.jpg";
//        String targetDirectory = new File("").getAbsolutePath();
//
//        URL imageUrl = new URL(sourceUrl);
//        try (InputStream imageReader = new BufferedInputStream(
//                imageUrl.openStream());
//             OutputStream imageWriter = new BufferedOutputStream(
//                     new FileOutputStream("fifth.jpg"));)
//        {
//            int readByte;
//
//            while ((readByte = imageReader.read()) != -1)
//            {
//                try {
//                    imageWriter.write(readByte);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//------------------------------------------------------------------------------
//       // запись строки в файл
//        try(FileWriter writer = new FileWriter("text.txt", false))
//        {
//            // запись всей строки
//            String text = "Мама мыла раму, раму мыла мама";
//            writer.write(text);
//            // запись по символам
//            writer.append('\n');
//            writer.append('E');
//
//            writer.flush();
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }

//------------------------------------------------------------------------------
//       // посимвольное чтение из файла
//        try(FileReader reader = new FileReader("text.txt"))
//        {
//            // читаем посимвольно
//            int c;
//            while((c=reader.read())!=-1){
//
//                System.out.print((char)c);
//            }
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }
    }

}