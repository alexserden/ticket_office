package repository.buider;

import model.Route;
import model.Ticket;
import model.Time;
import model.Type;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class TicketBuilder {
    Ticket ticket;

    public TicketBuilder(){
        ticket = new Ticket();
    }
   public void createTicket(Long id,String route,String arrive,String departure,String type) throws ParseException {
       ticket.setId(id);
        buildRoute(id,route);
       buildTime(id, arrive, departure);
       buildType(type);
    }

    public void buildRoute(Long id, String route) {

        ticket.setRoute(new Route(id,route));
    }

    public void buildTime(Long id, String arrive, String departure) throws ParseException {
        SimpleDateFormat arr = new SimpleDateFormat();
        arr.applyPattern("dd.MM.yyyy");
        Date arriveDate = arr.parse(arrive);

        SimpleDateFormat depart= new SimpleDateFormat();
        depart.applyPattern("dd.MM.yyyy");
        Date departureDate = depart.parse(departure);

        ticket.setTime(new Time(id,arriveDate,departureDate));
    }

    public void buildType(String type) {

        if(type.equals("Business Class")){
            ticket.setType(Type.Business);
        }else{
            ticket.setType(Type.Economy);

        }
    }

   public Ticket getTicket(){
        return ticket;
    }
}
