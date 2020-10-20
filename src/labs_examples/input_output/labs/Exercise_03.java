package labs_examples.input_output.labs;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */


class AdditonalByteStreams {

    public static void main(String[] args) {

//        charStreams();
//        byteStreams();
        dataOutputStream();
        dataInputStream();


    }





    public static void byteStreams() {

        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        OutputStream output = null;

        try {

            inputStream = new FileInputStream("src/labs_examples/input_output/files/KtoD.txt");
            bufferedInputStream = new BufferedInputStream(inputStream);

            output = new BufferedOutputStream(
                    new FileOutputStream("src/labs_examples/input_output/files/byte_buffer_test.txt"),  5);

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1){
                System.out.print(new String(buffer, 0, bytesRead));
                output.write(buffer);
            }

        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            try {
                inputStream.close();
                bufferedInputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


    }






    public static void charStreams() {

        StringReader inputStream = null;

        BufferedReader input= null;


        String content = "";


        try {
            content = new String(Files.readAllBytes(Paths.get("src/labs_examples/input_output/files/KtoD.txt")), StandardCharsets.UTF_8);
            input = new BufferedReader(new FileReader("src/labs_examples/input_output/files/KtoD.txt"));
        } catch (IOException exc1) {
            System.out.println(exc1);
        }

        inputStream = new StringReader(content);

        int i;

        try (LineNumberReader lineNumberReader = new LineNumberReader(input)) {
            String line = lineNumberReader.readLine();
            System.out.println("in file line reader");
            while (line != null) {
                System.out.println(line);
                line = lineNumberReader.readLine();
            }
        } catch (IOException exc3) {
            System.out.println(exc3.getMessage());
        }


        try {
            System.out.println("this is StringReader");
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        } finally {
            try {
                input.close();
            } catch (IOException exc4) {
                System.out.println(exc4);
            }

        }

    }


    public static void dataOutputStream () {

        try {
            DataOutputStream inst = new DataOutputStream(new FileOutputStream("src/labs_examples/input_output/files/data_output.txt"));

            inst.writeInt(7);
            inst.writeUTF("hello");
            inst.writeDouble(3.14);

        } catch(IOException exc5) {
            System.out.println(exc5.getMessage());
        }

    }


    public static void dataInputStream() {


        try(InputStream input = new FileInputStream("src/labs_examples/input_output/files/data_output.txt")) {
            DataInputStream inst = new DataInputStream(input);
            int i = inst.readInt();
            String s = inst.readUTF();
            double d = inst.readDouble();

            System.out.println(i + " - " + s + " - " + d);
        } catch(IOException exc5) {
            System.out.println(exc5.getMessage());
        }
    }


    //TODO: need help with data outputStream and datainputStream
}