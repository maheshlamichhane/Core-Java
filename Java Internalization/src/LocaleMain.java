import java.util.Locale;
public class LocaleMain {
        public static void main(String[] args) {

            // Create locales in different ways

            // 1️⃣ Using predefined constants
            Locale usLocale = Locale.US; // English, United States
            Locale franceLocale = Locale.FRANCE; // French, France

            // 2️⃣ Using language and country codes
            Locale indiaLocale = new Locale("en", "IN"); // English, India
            Locale germanLocale = new Locale("de", "DE"); // German, Germany
            Locale japanLocale = new Locale("ja", "JP"); // Japanese, Japan

            // Display their information
            printLocaleInfo(usLocale);
            printLocaleInfo(franceLocale);
            printLocaleInfo(indiaLocale);
            printLocaleInfo(germanLocale);
            printLocaleInfo(japanLocale);
        }

        private static void printLocaleInfo(Locale locale) {
            System.out.println("Locale: " + locale);
            System.out.println("Language: " + locale.getDisplayLanguage() +
                    " (" + locale.getLanguage() + ")");
            System.out.println("Country: " + locale.getDisplayCountry() +
                    " (" + locale.getCountry() + ")");
            System.out.println("---------------------------");
        }

}
