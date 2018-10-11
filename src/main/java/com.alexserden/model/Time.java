package model;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Time extends IdEntity {
    private Long id;
    Date arrive;
    Date departure;


    public Time(Long id, Date arrive, Date departure) {
        this.id = id;
        this.arrive = arrive;
        this.departure = departure;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Date getArrive() {
        return arrive;
    }

    public void setArrive(Date arrive) {
        this.arrive = arrive;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }
}