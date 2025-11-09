import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
public class DateFormatMain {
        public static void main(String[] args) {
            // Current date and time
            Date currentDate = new Date();

            // Different locales
            Locale[] locales = {
                    Locale.US,
                    Locale.UK,
                    Locale.FRANCE,
                    Locale.JAPAN,
                    new Locale("hi", "IN") // Hindi (India)
            };

            // Loop through locales and display formatted date
            for (Locale locale : locales) {
                DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.FULL, locale);
                String formattedDate = dateFormatter.format(currentDate);
                System.out.println("Locale: " + locale.getDisplayName());
                System.out.println("Formatted Date: " + formattedDate);
                System.out.println("------------------------------------");
            }
        }

}