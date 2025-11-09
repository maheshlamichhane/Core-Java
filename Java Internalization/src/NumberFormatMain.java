import java.text.NumberFormat;
import java.util.Locale;
public class NumberFormatMain {
        public static void main(String[] args) {
            double amount = 12345.67;

            Locale us = Locale.US;
            Locale india = new Locale("en", "IN");
            Locale france = Locale.FRANCE;

            NumberFormat usFormat = NumberFormat.getCurrencyInstance(us);
            NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(india);
            NumberFormat franceFormat = NumberFormat.getCurrencyInstance(france);

            System.out.println("US: " + usFormat.format(amount));
            System.out.println("India: " + indiaFormat.format(amount));
            System.out.println("France: " + franceFormat.format(amount));
        }

}
