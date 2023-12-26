package automation.testsuite.day19;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestCode {

    @Test
    public void checkDate() {
        try {
            String dateString = "16-01-2023";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date = LocalDate.parse(dateString, formatter);

            LocalDate currentDate = LocalDate.now();
            boolean isSameMonth = date.getMonth() == currentDate.getMonth() && date.getYear() == currentDate.getYear();

            System.out.println("Is the date in the current month? " + isSameMonth);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
