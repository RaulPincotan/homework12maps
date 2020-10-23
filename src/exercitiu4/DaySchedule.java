package exercitiu4;

import java.util.List;

public class DaySchedule {
    private final DayOfTheWeek day;
    private final List<String>activities;

    public DaySchedule(DayOfTheWeek day, List<String> activities) {
        this.day = day;
        this.activities = activities;
    }

    public DayOfTheWeek getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activities=" + activities +
                '}';
    }
}
