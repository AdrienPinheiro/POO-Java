package approche_object.fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) throws ParseException {
        Date actual = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String actualFormat = format.format(actual);
        System.out.println(actualFormat);

        SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String testFormat = "19/05/2016 23:59:30";
        Date test = format2.parse(testFormat);
        System.out.println(testFormat);
    }
}
