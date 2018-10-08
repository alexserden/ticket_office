package repository.buider;

import model.Route;
import model.Time;
import model.Type;

public class CreateTicket extends TicketBuilder {

    @Override
    void buildRoute(Long id, String name) {
        ticket.setRoute(new Route(id,name));
    }

    @Override
    void buildTime(Long id, String name) {
            ticket.setTime(new Time(id,name));
    }

    @Override
    void buildType(String name) {

        if(name.equals("Business Class")){
  ticket.setType(Type.Business);
        }else{
            ticket.setType(Type.Economy);

        }
    }
}
