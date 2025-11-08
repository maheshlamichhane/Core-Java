public class SimpleEnumMain {

    public enum Day {
        MONDAY("Start of the week"),
        TUESDAY("Work mode on"),
        WEDNESDAY("Midweek"),
        THURSDAY("Almost there"),
        FRIDAY("Weekend is coming"),
        SATURDAY("Relax!"),
        SUNDAY("Recharge");

        // Instance variable
        private final String description;

        // Constructor (must be private or package-private)
        Day(String description) {
            this.description = description;
        }

        // Instance method
        public String getDescription() {
            return description;
        }

        // Another instance method
        public boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }

        // Main method to test
        public static void main(String[] args) {
            for (Day day : Day.values()) {
                System.out.println(day + ": " + day.getDescription() +
                        " | Weekend? " + day.isWeekend());
            }
        }
    }

}
