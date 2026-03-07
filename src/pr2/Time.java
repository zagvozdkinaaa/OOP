package pr2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public Time(){

    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Second must be between 0 and 59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute,  second);
    }

    public String toStandard() {
        int standHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String amPm = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", hour, minute, second, amPm);
    }

    public void add(Time t2) {
        int totalSeconds = this.second + t2.second;
        int extraMinutes = totalSeconds / 60;
        this.second = totalSeconds % 60;

        int totalMinutes = this.minute + t2.minute + extraMinutes;
        int extraHours = totalMinutes / 60;
        this.minute = totalMinutes % 60;

        int totalHours = this.hour + t2.hour + extraHours;
        this.hour = totalHours % 24;
    }
}
