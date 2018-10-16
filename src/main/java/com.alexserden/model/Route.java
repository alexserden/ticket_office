package model;


import java.util.Date;
import java.util.Map;

public class Route extends IdEntity {
    private String route;
   Map<Airport,Date> map;


    public Route(Long id, String route, Map<Airport, Date> map) {
        super(id);
        this.route = route;
        this.map = map;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Map<Airport, Date> getMap() {
        return map;
    }

    public void setMap(Map<Airport, Date> map) {
        this.map = map;
    }
}
