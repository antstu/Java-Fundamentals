package labs_examples.input_output.labs;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
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

        charStreams();

    }






    public static void charStreams() {
        StringReader inputStream = null;
        StringWriter outputStream = null;

        String content = "";


        try {
            content = new String(Files.readAllBytes(Paths.get("src/labs_examples/input_output/files/KtoD.txt")), StandardCharsets.UTF_8);
        } catch (IOException exc1) {
            System.out.println(exc1);
        }

        inputStream = new StringReader(content);

        int i;

        try {

            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
        
    }
}