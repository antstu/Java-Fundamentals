package labs_examples.input_output.labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom getHandString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */


class Parser {

    public static void main(String[] args) {

        ArrayList<Contestant> contestants = new ArrayList();

        String filePath = "src/labs_examples/input_output/files/contestants.csv";

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                contestants.add(mapValuesToStudentObject(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Contestant contestant : contestants){
            System.out.println(contestant.toString());
        }

    }

    private static Contestant mapValuesToStudentObject(String[] values) {

        Contestant contestant = new Contestant();

        contestant.setName(values[0]);
        contestant.setState(values[1]);
        contestant.setScore(Integer.parseInt(values[2]));

        return contestant;

    }

}
