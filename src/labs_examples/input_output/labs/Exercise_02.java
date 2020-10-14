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

        FileReader  inputStream = null;
        FileWriter outputStream = null;

        try {
//            initalize Reader and Writer
            inputStream = new FileReader("src/labs_examples/input_output/files/KtoD.txt");
            outputStream = new FileWriter("src/labs_examples/input_output/files/output_file.txt");

            int c;
            char ca;

            while((c = inputStream.read()) != -1) {
//                why cant i write ca.equals?

//                doesnt work

                ca = (char) inputStream.read();
                if ("a".equals(ca)) {
                    outputStream.write("~");
                }
                else if ("e".equals(ca)) {
                    outputStream.write("-");
                }
                else {
                    outputStream.write(ca);
                }
            }

        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
        finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException exc2) {
                System.out.println(exc2.getMessage());
            }
        }
    }
}

