package model;


import java.util.Date;

public class Ticket extends IdEntity{

    private Route route;
    private Date arrive;
    private Date departure;
    private  Type type;
    private TicketStatus ticketStatus;
    private int vacancies = 10;
    public Ticket(){

    }

    public Ticket(Long id, Route route, Date arrive, Date departure, Type type, TicketStatus ticketStatus) {
        super(id);
        this.route = route;
        this.arrive = arrive;
        this.departure = departure;
        this.type = type;
        this.ticketStatus = ticketStatus;
    }
    public int getVacancies(){
        return vacancies;
    }
    public void setVacancies(int vacancies){
         this.vacancies = vacancies;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (route != null ? !route.equals(ticket.route) : ticket.route != null) return false;
        if (arrive != null ? !arrive.equals(ticket.arrive) : ticket.arrive != null) return false;
        if (departure != null ? !departure.equals(ticket.departure) : ticket.departure != null) return false;
        if (type != ticket.type) return false;
        return ticketStatus == ticket.ticketStatus;
    }

    @Override
    public int hashCode() {
        int result = route != null ? route.hashCode() : 0;
        result = 31 * result + (arrive != null ? arrive.hashCode() : 0);
        result = 31 * result + (departure != null ? departure.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (ticketStatus != null ? ticketStatus.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "route=" + route +
                ", arrive=" + arrive +
                ", departure=" + departure +
                ", type=" + type +
                ", ticketStatus=" + ticketStatus +
                '}';
    }
}
