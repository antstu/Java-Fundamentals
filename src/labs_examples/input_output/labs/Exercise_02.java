package labs_examples.input_output.labs;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */


class CreateEncrypted {

    public static void main(String[] args) {
        //declare FileReader and FileWriter because it is a character stream

        FileReader  reader = null;
        FileWriter writer = null;

        try {
//            initalize Reader and Writer
            reader = new FileReader("src/labs_examples/input_output/files/KtoD.txt");
            writer = new FileWriter("src/labs_examples/input_output/files/output_file.txt");

            int c;
            char ca;

            while((c = reader.read()) != -1) {
//                why cant i write ca.equals?
                ca = (char) c;
//                doesnt work
                if (ca == 'a') {
                    writer.write("~");
                }
                else if (ca == 'e') {
                    writer.write("-");
                }
                else {
                    writer.write(ca);
                }
            }

        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
        finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException exc2) {
                System.out.println(exc2.getMessage());
            }
        }
    }
}

