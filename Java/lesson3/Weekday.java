package telran.homework.lesson3;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekEnd() {
        return ordinal() > 4;
    }

    public static void main(String[] args) {
        System.out.println(Weekday.MONDAY.isWeekEnd()); // false
        System.out.println(Weekday.SATURDAY.isWeekEnd()); // true
    }
}
