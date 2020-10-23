package exercitiu4;

public class Main {
    public static void main(String[] args) {
        DaySchedule monday = new DaySchedule(DayOfTheWeek.MONDAY, new ReadingSchedule().readingDay("monday.txt"));
        DaySchedule tuesday = new DaySchedule(DayOfTheWeek.TUESDAY, new ReadingSchedule().readingDay("tuesday.txt"));
        DaySchedule wednesday = new DaySchedule(DayOfTheWeek.WEDNESDAY, new ReadingSchedule().readingDay("wednesday.txt"));
        DaySchedule thursday = new DaySchedule(DayOfTheWeek.THURSDAY, new ReadingSchedule().readingDay("thursday.txt"));
        DaySchedule friday = new DaySchedule(DayOfTheWeek.FRIDAY, new ReadingSchedule().readingDay("friday.txt"));
        DaySchedule saturday = new DaySchedule(DayOfTheWeek.SATURDAY, new ReadingSchedule().readingDay("saturday.txt"));
        DaySchedule sunday = new DaySchedule(DayOfTheWeek.SUNDAY, new ReadingSchedule().readingDay("sunday.txt"));

        System.out.println(monday);
        System.out.println(tuesday);
        System.out.println(wednesday);
        System.out.println(thursday);
        System.out.println(friday);
        System.out.println(saturday);
        System.out.println(sunday);


    }
}
