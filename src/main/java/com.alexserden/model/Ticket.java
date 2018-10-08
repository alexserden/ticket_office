package model;



public class Ticket extends IdEntity{
    Long id;
    private Route route;
    private Time time;
    private  Type type;

    public Ticket(){

    }

    public Ticket(Long id, Route route, Time time, Type type) {
        super(id);
        this.route = route;
        this.time = time;
        this.type = type;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return route.getRoute() +","
                + time.getTime() +","
                 +type;
    }
}
