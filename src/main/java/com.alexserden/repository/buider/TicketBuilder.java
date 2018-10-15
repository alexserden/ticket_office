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
   public void createTicket(Long id, String route,String depatureAirport,String arrivalAirport,
                            String departureDate,String arrivalDate, String type) throws ParseException {
       ticket.setId(id);
        buildRoute(id,route,depatureAirport,arrivalAirport,departureDate,arrivalDate);
       buildType(type);
    }

    public void buildRoute(Long id, String route,String depatureAirport,String arrivalAirport,
                           String departureDate,String arrivalDate) throws ParseException {

               SimpleDateFormat arr = new SimpleDateFormat();
       arr.applyPattern("dd.MM.yyyy");
       Date arrival = arr.parse(arrivalDate);

       SimpleDateFormat depart= new SimpleDateFormat();
       depart.applyPattern("dd.MM.yyyy");
       Date departure = depart.parse(departureDate);

          Airport airportDep = new Airport(id,depatureAirport,departure);
          Airport airportArr = new Airport(id,arrivalAirport,arrival);
        ticket.setRoute(new Route(id,route,airportDep,airportArr));
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
