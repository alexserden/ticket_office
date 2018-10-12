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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (id != null ? !id.equals(ticket.id) : ticket.id != null) return false;
        if (route != null ? !route.equals(ticket.route) : ticket.route != null) return false;
        if (time != null ? !time.equals(ticket.time) : ticket.time != null) return false;
        return type == ticket.type;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (route != null ? route.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return  id +
                "," + route.getRoute() +
                "," + time.arrive +
                "," + time.departure +
                "," + type ;
    }
}
