package model;



public class Ticket extends IdEntity{
    Long id;
    private Route route;
    private Time time;
    private  Type type;


    public Ticket(){

    }
    public Ticket(Long id, Route route,Time time,Type type) {
        super(id);
        this.route = route;
        this.time = time;
        this.type = type;

    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", route=" + route +
                ", type=" + type +
                ", time=" + time +
                '}';
    }
}
