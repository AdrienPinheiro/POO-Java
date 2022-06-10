package approche_object.fr.diginamic.dates;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar test = Calendar.getInstance();
        test.set(Calendar.YEAR, 2016);
        test.set(Calendar.MONTH, 04);
        test.set(Calendar.DATE, 18);
        test.set(Calendar.HOUR_OF_DAY, 23);
        test.set(Calendar.MINUTE, 59);
        test.set(Calendar.SECOND, 30);

        Date date = test.getTime();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        String finalDate = formatDate.format(date);
        System.out.println(finalDate);

        Calendar actual = Calendar.getInstance();
        SimpleDateFormat formatActualDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dateActual = actual.getTime();
        String finalActualDate = formatActualDate.format(dateActual);
        System.out.println(finalActualDate);

        // les différentes langues
        Locale france = Locale.FRANCE;
        Locale russe = new Locale("Ru", "RU");
        Locale allemand = Locale.GERMANY;
        Locale chinois = Locale.CHINA;
    }
}
