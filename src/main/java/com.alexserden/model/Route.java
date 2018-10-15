package model;




public class Route extends IdEntity {
    private String route;
    Airport Departure;
    Airport Arrival;


    public Route(Long id, String route, Airport departure, Airport arrival) {
        super(id);
        this.route = route;
        Departure = departure;
        Arrival = arrival;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Airport getDeparture() {
        return Departure;
    }

    public void setDeparture(Airport departure) {
        Departure = departure;
    }

    public Airport getArrival() {
        return Arrival;
    }

    public void setArrival(Airport arrival) {
        Arrival = arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Route route1 = (Route) o;

        if (route != null ? !route.equals(route1.route) : route1.route != null) return false;
        if (Departure != null ? !Departure.equals(route1.Departure) : route1.Departure != null) return false;
        return Arrival != null ? Arrival.equals(route1.Arrival) : route1.Arrival == null;
    }

    @Override
    public int hashCode() {
        int result = route != null ? route.hashCode() : 0;
        result = 31 * result + (Departure != null ? Departure.hashCode() : 0);
        result = 31 * result + (Arrival != null ? Arrival.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Route{" +
                "route='" + route + '\'' +
                ", Departure=" + Departure +
                ", Arrival=" + Arrival +
                '}';
    }
}
