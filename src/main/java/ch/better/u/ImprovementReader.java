package ch.better.u;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ImprovementReader {
    public static List<Improvement> readDataLineByLine()
    {

        try {
            // Create an object of filereader
            // class with CSV file as a parameter.
            FileReader filereader = new FileReader("src/main/resources/improvements.csv");

            // create csvReader object passing
            // file reader as a parameter
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            List<Improvement> improvements = new ArrayList<>();

            // we are going to read data line by line
            while ((nextRecord = csvReader.readNext()) != null) {
                String id = nextRecord[0];
                String name = nextRecord[1];
                int points = Integer.parseInt(nextRecord[2]);
                boolean done = Boolean.parseBoolean(nextRecord[3]);

                Improvement improvement = new Improvement(id, name, points, done);
                improvements.add(improvement);
            }
            return improvements;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
