package model;

import java.util.Date;
import java.util.Map;

public class Airport extends IdEntity{
    String name;
    Date date;
   static Map<Airport,Date> map;

    public Airport(Long id, String name, Date date) {
        super(id);
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static Map<Airport, Date> getMap() {
        return map;
    }

    public static void setMap(Map<Airport, Date> map) {
        Airport.map = map;
    }
}
