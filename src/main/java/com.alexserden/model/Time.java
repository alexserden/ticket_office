package model;

public class Time extends IdEntity{
    Long id;
    String time;

    public Time(Long id, String time) {
        super(id);
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Time{" +
                "time=" + time +
                '}';
    }
}
