package exercitiu4;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingSchedule {
    public final List<String> readingDay(String line) {
        List<String> listDuties = new ArrayList<>();
        try (Scanner reader = new Scanner(new FileReader("weekfiles/" + line))) {
            while (reader.hasNextLine()) {
                listDuties.add(reader.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listDuties;
    }
}
