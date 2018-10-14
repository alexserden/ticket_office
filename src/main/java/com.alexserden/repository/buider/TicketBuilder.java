package repository.buider;

import model.Airport;
import model.Route;
import model.Ticket;
import model.Type;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class TicketBuilder {
    Ticket ticket;

    public TicketBuilder(){
        ticket = new Ticket();
    }
   public void createTicket(Long id, String route, String airoport,String arrive, String departure, String type) throws ParseException {
       ticket.setId(id);
        buildRoute(id,route,airoport);
       buildType(type);
       SimpleDateFormat arr = new SimpleDateFormat();
       arr.applyPattern("dd.MM.yyyy");
       Date arriveDate = arr.parse(arrive);

       SimpleDateFormat depart= new SimpleDateFormat();
       depart.applyPattern("dd.MM.yyyy");
       Date departureDate = depart.parse(departure);
    }

    public void buildRoute(Long id, String route,String name) {

        ticket.setRoute(new Route(id,route,new Airport(id,name)));
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
