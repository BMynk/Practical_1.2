public class DateTest {
    public static void main(String[] args) {
        // Create a Date object
        Date myDate = new Date(3, 25, 2026);

        // Display the date
        System.out.print("The date is: ");
        myDate.displayDate();

        // Demonstrate setters and getters
        myDate.setMonth(12);
        myDate.setDay(31);
        myDate.setYear(2025);

        System.out.print("After changing values, the date is: ");
        myDate.displayDate();
    }
}