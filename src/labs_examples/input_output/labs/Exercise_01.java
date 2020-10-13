package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {


        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        String filePath = "src/labs_examples/input_output/files/write_test.txt";

        try (FileWriter fw = new FileWriter(filePath)) {
//            TODO: use abs path ?
            inputStream = new FileInputStream("src/labs_examples/input_output/files/char_data.txt");
            bufferedInputStream = new BufferedInputStream(inputStream);

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                fw.write(new String(buffer, 0, bytesRead));
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

}

